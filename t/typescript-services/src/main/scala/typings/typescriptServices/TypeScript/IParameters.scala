package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParameters extends StObject {
  
  var ast: AST = js.native
  
  def astAt(index: Double): AST = js.native
  
  def identifierAt(index: Double): Identifier = js.native
  
  def initializerAt(index: Double): EqualsValueClause = js.native
  
  def isOptionalAt(index: Double): Boolean = js.native
  
  def lastParameterIsRest(): Boolean = js.native
  
  var length: Double = js.native
  
  def typeAt(index: Double): AST = js.native
}
object IParameters {
  
  @scala.inline
  def apply(
    ast: AST,
    astAt: Double => AST,
    identifierAt: Double => Identifier,
    initializerAt: Double => EqualsValueClause,
    isOptionalAt: Double => Boolean,
    lastParameterIsRest: () => Boolean,
    length: Double,
    typeAt: Double => AST
  ): IParameters = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], astAt = js.Any.fromFunction1(astAt), identifierAt = js.Any.fromFunction1(identifierAt), initializerAt = js.Any.fromFunction1(initializerAt), isOptionalAt = js.Any.fromFunction1(isOptionalAt), lastParameterIsRest = js.Any.fromFunction0(lastParameterIsRest), length = length.asInstanceOf[js.Any], typeAt = js.Any.fromFunction1(typeAt))
    __obj.asInstanceOf[IParameters]
  }
  
  @scala.inline
  implicit class IParametersMutableBuilder[Self <: IParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstAt(value: Double => AST): Self = StObject.set(x, "astAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIdentifierAt(value: Double => Identifier): Self = StObject.set(x, "identifierAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializerAt(value: Double => EqualsValueClause): Self = StObject.set(x, "initializerAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsOptionalAt(value: Double => Boolean): Self = StObject.set(x, "isOptionalAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLastParameterIsRest(value: () => Boolean): Self = StObject.set(x, "lastParameterIsRest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAt(value: Double => AST): Self = StObject.set(x, "typeAt", js.Any.fromFunction1(value))
  }
}

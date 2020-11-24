package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParameters extends js.Object {
  
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
  implicit class IParametersOps[Self <: IParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAst(value: AST): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstAt(value: Double => AST): Self = this.set("astAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIdentifierAt(value: Double => Identifier): Self = this.set("identifierAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializerAt(value: Double => EqualsValueClause): Self = this.set("initializerAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsOptionalAt(value: Double => Boolean): Self = this.set("isOptionalAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLastParameterIsRest(value: () => Boolean): Self = this.set("lastParameterIsRest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAt(value: Double => AST): Self = this.set("typeAt", js.Any.fromFunction1(value))
  }
}

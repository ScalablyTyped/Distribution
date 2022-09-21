package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signature extends StObject {
  
  var declaration: js.UndefOr[SignatureDeclaration | JSDocSignature] = js.native
  
  def getDeclaration(): SignatureDeclaration = js.native
  
  def getDocumentationComment(): js.Array[SymbolDisplayPart] = js.native
  def getDocumentationComment(typeChecker: TypeChecker): js.Array[SymbolDisplayPart] = js.native
  
  def getJsDocTags(): js.Array[JSDocTagInfo] = js.native
  
  def getParameters(): js.Array[Symbol] = js.native
  
  def getReturnType(): Type = js.native
  
  def getTypeParameterAtPosition(pos: Double): Type = js.native
  
  def getTypeParameters(): js.UndefOr[js.Array[TypeParameter]] = js.native
  
  var parameters: js.Array[Symbol] = js.native
  
  var typeParameters: js.UndefOr[js.Array[TypeParameter]] = js.native
}

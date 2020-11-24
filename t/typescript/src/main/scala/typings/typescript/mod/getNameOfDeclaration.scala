package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "getNameOfDeclaration")
@js.native
object getNameOfDeclaration extends js.Object {
  
  def apply(declaration: Declaration): js.UndefOr[DeclarationName] = js.native
  def apply(declaration: Expression): js.UndefOr[DeclarationName] = js.native
}

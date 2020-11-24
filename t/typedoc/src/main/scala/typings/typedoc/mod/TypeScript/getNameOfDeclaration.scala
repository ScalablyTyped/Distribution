package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Declaration
import typings.typescript.mod.DeclarationName
import typings.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getNameOfDeclaration")
@js.native
object getNameOfDeclaration extends js.Object {
  
  def apply(declaration: Declaration): js.UndefOr[DeclarationName] = js.native
  def apply(declaration: Expression): js.UndefOr[DeclarationName] = js.native
}

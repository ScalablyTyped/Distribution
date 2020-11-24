package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocTypedefTag
import typings.typescript.mod.PrivateIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getNameOfJSDocTypedef")
@js.native
object getNameOfJSDocTypedef extends js.Object {
  
  def apply(declaration: JSDocTypedefTag): js.UndefOr[Identifier | PrivateIdentifier] = js.native
}

package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocProtectedTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocProtectedTag")
@js.native
object createJSDocProtectedTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocProtectedTag` or the factory supplied by your transformation context instead. */
  def apply(): JSDocProtectedTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocProtectedTag = js.native
  def apply(tagName: Identifier): JSDocProtectedTag = js.native
  def apply(tagName: Identifier, comment: String): JSDocProtectedTag = js.native
}

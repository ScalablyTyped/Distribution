package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocClassTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocClassTag")
@js.native
object createJSDocClassTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocClassTag` or the factory supplied by your transformation context instead. */
  def apply(): JSDocClassTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocClassTag = js.native
  def apply(tagName: Identifier): JSDocClassTag = js.native
  def apply(tagName: Identifier, comment: String): JSDocClassTag = js.native
}

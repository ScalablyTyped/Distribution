package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocPublicTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocPublicTag")
@js.native
object createJSDocPublicTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocPublicTag` or the factory supplied by your transformation context instead. */
  def apply(): JSDocPublicTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocPublicTag = js.native
  def apply(tagName: Identifier): JSDocPublicTag = js.native
  def apply(tagName: Identifier, comment: String): JSDocPublicTag = js.native
}

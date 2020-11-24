package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocPrivateTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocPrivateTag")
@js.native
object createJSDocPrivateTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocPrivateTag` or the factory supplied by your transformation context instead. */
  def apply(): JSDocPrivateTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocPrivateTag = js.native
  def apply(tagName: Identifier): JSDocPrivateTag = js.native
  def apply(tagName: Identifier, comment: String): JSDocPrivateTag = js.native
}

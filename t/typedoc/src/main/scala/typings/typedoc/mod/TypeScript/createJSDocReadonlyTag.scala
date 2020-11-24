package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocReadonlyTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocReadonlyTag")
@js.native
object createJSDocReadonlyTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocReadonlyTag` or the factory supplied by your transformation context instead. */
  def apply(): JSDocReadonlyTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocReadonlyTag = js.native
  def apply(tagName: Identifier): JSDocReadonlyTag = js.native
  def apply(tagName: Identifier, comment: String): JSDocReadonlyTag = js.native
}

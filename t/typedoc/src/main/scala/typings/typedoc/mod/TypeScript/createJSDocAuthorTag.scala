package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocAuthorTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocAuthorTag")
@js.native
object createJSDocAuthorTag extends js.Object {
  
  /** @deprecated Use `factory.createJSDocAuthorTag` or the factory supplied by your transformation context instead. */
  def apply(): JSDocAuthorTag = js.native
  def apply(tagName: js.UndefOr[scala.Nothing], comment: String): JSDocAuthorTag = js.native
  def apply(tagName: Identifier): JSDocAuthorTag = js.native
  def apply(tagName: Identifier, comment: String): JSDocAuthorTag = js.native
}

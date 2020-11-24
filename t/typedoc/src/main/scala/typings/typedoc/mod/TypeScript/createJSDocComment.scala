package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDoc
import typings.typescript.mod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJSDocComment")
@js.native
object createJSDocComment extends js.Object {
  
  /** @deprecated Use `factory.createJSDocComment` or the factory supplied by your transformation context instead. */
  def apply(): JSDoc = js.native
  def apply(comment: js.UndefOr[scala.Nothing], tags: js.Array[JSDocTag]): JSDoc = js.native
  def apply(comment: String): JSDoc = js.native
  def apply(comment: String, tags: js.Array[JSDocTag]): JSDoc = js.native
}

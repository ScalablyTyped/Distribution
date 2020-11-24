package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JsxText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createJsxText")
@js.native
object createJsxText extends js.Object {
  
  /** @deprecated Use `factory.createJsxText` or the factory supplied by your transformation context instead. */
  def apply(text: String): JsxText = js.native
  def apply(text: String, containsOnlyTriviaWhiteSpaces: Boolean): JsxText = js.native
}

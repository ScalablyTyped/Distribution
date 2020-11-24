package typings.wordpressRichText.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/rich-text", "replace")
@js.native
object replace extends js.Object {
  
  def apply(value: Value, pattern: String, replacement: String): Value = js.native
  def apply(
    value: Value,
    pattern: String,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]
  ): Value = js.native
  def apply(value: Value, pattern: RegExp, replacement: String): Value = js.native
  def apply(
    value: Value,
    pattern: RegExp,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]
  ): Value = js.native
}

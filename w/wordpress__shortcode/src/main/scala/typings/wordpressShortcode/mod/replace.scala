package typings.wordpressShortcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/shortcode", "replace")
@js.native
object replace extends js.Object {
  def apply(tag: String, text: String, callback: js.Function1[/* shortcode */ Shortcode_, String]): String = js.native
}


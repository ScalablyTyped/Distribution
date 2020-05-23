package typings.wordpressShortcode.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeAttrs> */
trait PartialShortcodeAttrs extends js.Object {
  var named: js.UndefOr[Record[String, js.UndefOr[String]]] = js.undefined
  var numeric: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialShortcodeAttrs {
  @scala.inline
  def apply(named: Record[String, js.UndefOr[String]] = null, numeric: js.Array[String] = null): PartialShortcodeAttrs = {
    val __obj = js.Dynamic.literal()
    if (named != null) __obj.updateDynamic("named")(named.asInstanceOf[js.Any])
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialShortcodeAttrs]
  }
}


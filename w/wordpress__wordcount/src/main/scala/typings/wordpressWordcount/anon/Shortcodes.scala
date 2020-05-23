package typings.wordpressWordcount.anon

import typings.wordpressWordcount.mod.CountType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shortcodes extends js.Object {
  /** Array of known shortcode names */
  var shortcodes: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[CountType] = js.undefined
}

object Shortcodes {
  @scala.inline
  def apply(shortcodes: js.Array[String] = null, `type`: CountType = null): Shortcodes = {
    val __obj = js.Dynamic.literal()
    if (shortcodes != null) __obj.updateDynamic("shortcodes")(shortcodes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shortcodes]
  }
}


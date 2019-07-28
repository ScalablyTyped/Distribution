package typings.atWordpressWordcount

import typings.atWordpressWordcount.atWordpressWordcountMod.CountType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Shortcodes extends js.Object {
  /** Array of known shortcode names */
  var shortcodes: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[CountType] = js.undefined
}

object Anon_Shortcodes {
  @scala.inline
  def apply(shortcodes: js.Array[String] = null, `type`: CountType = null): Anon_Shortcodes = {
    val __obj = js.Dynamic.literal()
    if (shortcodes != null) __obj.updateDynamic("shortcodes")(shortcodes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Shortcodes]
  }
}


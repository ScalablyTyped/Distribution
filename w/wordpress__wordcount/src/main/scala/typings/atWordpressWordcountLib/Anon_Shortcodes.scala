package typings
package atWordpressWordcountLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Shortcodes extends js.Object {
  /** Array of known shortcode names */
  var shortcodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[atWordpressWordcountLib.atWordpressWordcountMod.CountType] = js.undefined
}

object Anon_Shortcodes {
  @scala.inline
  def apply(
    shortcodes: js.Array[java.lang.String] = null,
    `type`: atWordpressWordcountLib.atWordpressWordcountMod.CountType = null
  ): Anon_Shortcodes = {
    val __obj = js.Dynamic.literal()
    if (shortcodes != null) __obj.updateDynamic("shortcodes")(shortcodes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Shortcodes]
  }
}


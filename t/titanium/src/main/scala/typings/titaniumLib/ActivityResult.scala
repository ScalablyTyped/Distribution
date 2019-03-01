package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the
  * [startActivityForResult](Titanium.Android.Activity.startActivityForResult) callback.
  */
trait ActivityResult extends js.Object {
  /**
  	 * Intent that can contain data returned to the caller. Data can be attached to
  	 * the intent as "extras").
  	 */
  var intent: js.UndefOr[titaniumLib.TitaniumNs.AndroidNs.Intent] = js.undefined
  /**
  	 * Unique, automatically generated integer request code.
  	 */
  var requestCode: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Integer result code that the started activity passed to
  	 * [setResult](Titanium.Android.Activity.setResult).
  	 */
  var resultCode: js.UndefOr[scala.Double] = js.undefined
}

object ActivityResult {
  @scala.inline
  def apply(
    intent: titaniumLib.TitaniumNs.AndroidNs.Intent = null,
    requestCode: scala.Int | scala.Double = null,
    resultCode: scala.Int | scala.Double = null
  ): ActivityResult = {
    val __obj = js.Dynamic.literal()
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (requestCode != null) __obj.updateDynamic("requestCode")(requestCode.asInstanceOf[js.Any])
    if (resultCode != null) __obj.updateDynamic("resultCode")(resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityResult]
  }
}


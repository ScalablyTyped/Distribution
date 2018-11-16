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


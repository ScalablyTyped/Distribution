package typings.titanium

import typings.titanium.Titanium.Android.Intent
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
  var intent: js.UndefOr[Intent] = js.undefined
  /**
    * Unique, automatically generated integer request code.
    */
  var requestCode: js.UndefOr[Double] = js.undefined
  /**
    * Integer result code that the started activity passed to
    * [setResult](Titanium.Android.Activity.setResult).
    */
  var resultCode: js.UndefOr[Double] = js.undefined
}

object ActivityResult {
  @scala.inline
  def apply(
    intent: Intent = null,
    requestCode: js.UndefOr[Double] = js.undefined,
    resultCode: js.UndefOr[Double] = js.undefined
  ): ActivityResult = {
    val __obj = js.Dynamic.literal()
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCode)) __obj.updateDynamic("requestCode")(requestCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resultCode)) __obj.updateDynamic("resultCode")(resultCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityResult]
  }
}


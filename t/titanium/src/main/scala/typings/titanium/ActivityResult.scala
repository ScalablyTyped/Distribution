package typings.titanium

import typings.titanium.Titanium.Android.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the
  * [startActivityForResult](Titanium.Android.Activity.startActivityForResult) callback.
  */
@js.native
trait ActivityResult extends js.Object {
  /**
    * Intent that can contain data returned to the caller. Data can be attached to
    * the intent as "extras").
    */
  var intent: js.UndefOr[Intent] = js.native
  /**
    * Unique, automatically generated integer request code.
    */
  var requestCode: js.UndefOr[Double] = js.native
  /**
    * Integer result code that the started activity passed to
    * [setResult](Titanium.Android.Activity.setResult).
    */
  var resultCode: js.UndefOr[Double] = js.native
}

object ActivityResult {
  @scala.inline
  def apply(): ActivityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityResult]
  }
  @scala.inline
  implicit class ActivityResultOps[Self <: ActivityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIntent(value: Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    @scala.inline
    def setRequestCode(value: Double): Self = this.set("requestCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCode: Self = this.set("requestCode", js.undefined)
    @scala.inline
    def setResultCode(value: Double): Self = this.set("resultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultCode: Self = this.set("resultCode", js.undefined)
  }
  
}


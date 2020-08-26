package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimingParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * User timing category
    *
    * **Required for timing hit type.**
    *
    * Specifies the user timing category.
    *
    * Max length: 150 Bytes
    *
    * Example value: `category`
    */
  var utc: js.UndefOr[String] = js.native
  /**
    * User timing label
    *
    * Specifies the user timing label.
    *
    * Max length: 500 Bytes
    *
    * Example value: `label`
    */
  var utl: js.UndefOr[String] = js.native
  /**
    * User timing time
    *
    * **Required for timing hit type.**
    *
    * Specifies the user timing value. The value is in milliseconds.
    *
    * Example value: `123`
    */
  var utt: js.UndefOr[String | Double] = js.native
  /**
    * User timing variable name
    *
    * **Required for timing hit type.**
    *
    * Specifies the user timing variable.
    *
    * Max length: 500 Bytes
    *
    * Example value: `lookup`
    */
  var utv: js.UndefOr[String] = js.native
}

object TimingParams {
  @scala.inline
  def apply(): TimingParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimingParams]
  }
  @scala.inline
  implicit class TimingParamsOps[Self <: TimingParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUtc(value: String): Self = this.set("utc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtc: Self = this.set("utc", js.undefined)
    @scala.inline
    def setUtl(value: String): Self = this.set("utl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtl: Self = this.set("utl", js.undefined)
    @scala.inline
    def setUtt(value: String | Double): Self = this.set("utt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtt: Self = this.set("utt", js.undefined)
    @scala.inline
    def setUtv(value: String): Self = this.set("utv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtv: Self = this.set("utv", js.undefined)
  }
  
}


package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var utc: js.UndefOr[String] = js.undefined
  /**
    * User timing label
    *
    * Specifies the user timing label.
    *
    * Max length: 500 Bytes
    *
    * Example value: `label`
    */
  var utl: js.UndefOr[String] = js.undefined
  /**
    * User timing time
    *
    * **Required for timing hit type.**
    *
    * Specifies the user timing value. The value is in milliseconds.
    *
    * Example value: `123`
    */
  var utt: js.UndefOr[String | Double] = js.undefined
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
  var utv: js.UndefOr[String] = js.undefined
}

object TimingParams {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    utc: String = null,
    utl: String = null,
    utt: String | Double = null,
    utv: String = null
  ): TimingParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (utc != null) __obj.updateDynamic("utc")(utc.asInstanceOf[js.Any])
    if (utl != null) __obj.updateDynamic("utl")(utl.asInstanceOf[js.Any])
    if (utt != null) __obj.updateDynamic("utt")(utt.asInstanceOf[js.Any])
    if (utv != null) __obj.updateDynamic("utv")(utv.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingParams]
  }
}


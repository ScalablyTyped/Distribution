package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenviewParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Application ID
    *
    * Application identifier.
    *
    * Max length: 150 Bytes
    *
    * Example value: `com.company.app`
    */
  var aid: js.UndefOr[String] = js.undefined
  /**
    * Application Installer ID
    *
    * Application installer identifier.
    *
    * Max length: 150 Bytes
    *
    * Example value: `com.platform.vending`
    */
  var aiid: js.UndefOr[String] = js.undefined
  /**
    * Application Name
    *
    * Specifies the application name. This field is required for any hit that has app related data
    * (i.e., app version, app ID, or app installer ID). For hits sent to web properties, this field is optional.
    *
    * Max length: 100 Bytes
    *
    * Example value: `My App`
    */
  var an: js.UndefOr[String] = js.undefined
  /**
    * Application Version
    *
    * Specifies the application version.
    *
    * Max length: 100 Bytes
    *
    * Example value: `1.2`
    */
  var av: js.UndefOr[String] = js.undefined
  /**
    * Screen Name
    *
    * This parameter is optional on web properties, and required on mobile properties for screenview hits,
    * where it is used for the 'Screen Name' of the screenview hit.
    *
    * Max length: 2048 Bytes
    *
    * Example value: `High Scores`
    */
  var cd: js.UndefOr[String] = js.undefined
}

object ScreenviewParams {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    aid: String = null,
    aiid: String = null,
    an: String = null,
    av: String = null,
    cd: String = null
  ): ScreenviewParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aid != null) __obj.updateDynamic("aid")(aid.asInstanceOf[js.Any])
    if (aiid != null) __obj.updateDynamic("aiid")(aiid.asInstanceOf[js.Any])
    if (an != null) __obj.updateDynamic("an")(an.asInstanceOf[js.Any])
    if (av != null) __obj.updateDynamic("av")(av.asInstanceOf[js.Any])
    if (cd != null) __obj.updateDynamic("cd")(cd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenviewParams]
  }
}


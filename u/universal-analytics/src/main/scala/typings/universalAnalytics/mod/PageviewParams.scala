package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageviewParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Document Host Name
    *
    * Specifies the hostname from which content was hosted.
    *
    * Max length: 100 Bytes
    */
  var dh: js.UndefOr[String] = js.undefined
  /**
    * Document location URL
    *
    * Use this parameter to send the full URL (document location) of the page on which content resides.
    *
    * Max length: 2048 Bytes
    */
  var dl: js.UndefOr[String] = js.undefined
  /**
    * Document Path
    *
    * The path portion of the page URL. Should begin with '/'.
    *
    * Max length: 2048 Bytes
    */
  var dp: js.UndefOr[String] = js.undefined
  /**
    * Document Title
    *
    * The title of the page / document.
    *
    * Max length: 1500 Bytes
    */
  var dt: js.UndefOr[String] = js.undefined
}

object PageviewParams {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    dh: String = null,
    dl: String = null,
    dp: String = null,
    dt: String = null
  ): PageviewParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dh != null) __obj.updateDynamic("dh")(dh.asInstanceOf[js.Any])
    if (dl != null) __obj.updateDynamic("dl")(dl.asInstanceOf[js.Any])
    if (dp != null) __obj.updateDynamic("dp")(dp.asInstanceOf[js.Any])
    if (dt != null) __obj.updateDynamic("dt")(dt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageviewParams]
  }
}


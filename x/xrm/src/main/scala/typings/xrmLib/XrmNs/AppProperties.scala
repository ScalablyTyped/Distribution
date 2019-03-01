package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * properties of the current business app in Customer Engagement.
  */
trait AppProperties extends js.Object {
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var webResourceId: js.UndefOr[java.lang.String] = js.undefined
  var webResourceName: js.UndefOr[java.lang.String] = js.undefined
  var welcomePageId: js.UndefOr[java.lang.String] = js.undefined
  var welcomePageName: js.UndefOr[java.lang.String] = js.undefined
}

object AppProperties {
  @scala.inline
  def apply(
    appId: java.lang.String = null,
    displayName: java.lang.String = null,
    uniqueName: java.lang.String = null,
    url: java.lang.String = null,
    webResourceId: java.lang.String = null,
    webResourceName: java.lang.String = null,
    welcomePageId: java.lang.String = null,
    welcomePageName: java.lang.String = null
  ): AppProperties = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName)
    if (url != null) __obj.updateDynamic("url")(url)
    if (webResourceId != null) __obj.updateDynamic("webResourceId")(webResourceId)
    if (webResourceName != null) __obj.updateDynamic("webResourceName")(webResourceName)
    if (welcomePageId != null) __obj.updateDynamic("welcomePageId")(welcomePageId)
    if (welcomePageName != null) __obj.updateDynamic("welcomePageName")(welcomePageName)
    __obj.asInstanceOf[AppProperties]
  }
}


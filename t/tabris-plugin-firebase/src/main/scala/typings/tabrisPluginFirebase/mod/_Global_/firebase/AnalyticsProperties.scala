package typings.tabrisPluginFirebase.mod._Global_.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris-plugin-firebase.tabris-plugin-firebase._Global_.firebase.PropertyMixins.Analytics> */
trait AnalyticsProperties extends js.Object {
  var analyticsCollectionEnabled: js.UndefOr[Boolean] = js.undefined
  var screenName: js.UndefOr[String] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object AnalyticsProperties {
  @scala.inline
  def apply(
    analyticsCollectionEnabled: js.UndefOr[Boolean] = js.undefined,
    screenName: String = null,
    userId: String = null
  ): AnalyticsProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analyticsCollectionEnabled)) __obj.updateDynamic("analyticsCollectionEnabled")(analyticsCollectionEnabled.asInstanceOf[js.Any])
    if (screenName != null) __obj.updateDynamic("screenName")(screenName.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsProperties]
  }
}


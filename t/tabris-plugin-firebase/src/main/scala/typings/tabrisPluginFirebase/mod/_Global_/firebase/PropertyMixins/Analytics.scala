package typings.tabrisPluginFirebase.mod._Global_.firebase.PropertyMixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analytics extends js.Object {
  var analyticsCollectionEnabled: Boolean
  var screenName: String
  var userId: String
}

object Analytics {
  @scala.inline
  def apply(analyticsCollectionEnabled: Boolean, screenName: String, userId: String): Analytics = {
    val __obj = js.Dynamic.literal(analyticsCollectionEnabled = analyticsCollectionEnabled.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analytics]
  }
}


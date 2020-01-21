package typings.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var backoffConfig: js.Any
  var documentsUri: String
  var insightsUri: String
  var listsUri: String
  var mapsUri: String
  var sessionStorageEnabled: Boolean
  var streamsUri: String
  var subscriptionsUri: String
}

object Configuration {
  @scala.inline
  def apply(
    backoffConfig: js.Any,
    documentsUri: String,
    insightsUri: String,
    listsUri: String,
    mapsUri: String,
    sessionStorageEnabled: Boolean,
    streamsUri: String,
    subscriptionsUri: String
  ): Configuration = {
    val __obj = js.Dynamic.literal(backoffConfig = backoffConfig.asInstanceOf[js.Any], documentsUri = documentsUri.asInstanceOf[js.Any], insightsUri = insightsUri.asInstanceOf[js.Any], listsUri = listsUri.asInstanceOf[js.Any], mapsUri = mapsUri.asInstanceOf[js.Any], sessionStorageEnabled = sessionStorageEnabled.asInstanceOf[js.Any], streamsUri = streamsUri.asInstanceOf[js.Any], subscriptionsUri = subscriptionsUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Configuration]
  }
}


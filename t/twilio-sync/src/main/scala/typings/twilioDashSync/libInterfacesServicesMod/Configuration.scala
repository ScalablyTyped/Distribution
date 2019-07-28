package typings.twilioDashSync.libInterfacesServicesMod

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
    val __obj = js.Dynamic.literal(backoffConfig = backoffConfig, documentsUri = documentsUri, insightsUri = insightsUri, listsUri = listsUri, mapsUri = mapsUri, sessionStorageEnabled = sessionStorageEnabled, streamsUri = streamsUri, subscriptionsUri = subscriptionsUri)
  
    __obj.asInstanceOf[Configuration]
  }
}


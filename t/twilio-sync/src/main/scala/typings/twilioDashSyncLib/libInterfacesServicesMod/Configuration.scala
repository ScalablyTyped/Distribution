package typings
package twilioDashSyncLib.libInterfacesServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var backoffConfig: js.Any
  var documentsUri: java.lang.String
  var insightsUri: java.lang.String
  var listsUri: java.lang.String
  var mapsUri: java.lang.String
  var sessionStorageEnabled: scala.Boolean
  var streamsUri: java.lang.String
  var subscriptionsUri: java.lang.String
}

object Configuration {
  @scala.inline
  def apply(
    backoffConfig: js.Any,
    documentsUri: java.lang.String,
    insightsUri: java.lang.String,
    listsUri: java.lang.String,
    mapsUri: java.lang.String,
    sessionStorageEnabled: scala.Boolean,
    streamsUri: java.lang.String,
    subscriptionsUri: java.lang.String
  ): Configuration = {
    val __obj = js.Dynamic.literal(backoffConfig = backoffConfig, documentsUri = documentsUri, insightsUri = insightsUri, listsUri = listsUri, mapsUri = mapsUri, sessionStorageEnabled = sessionStorageEnabled, streamsUri = streamsUri, subscriptionsUri = subscriptionsUri)
  
    __obj.asInstanceOf[Configuration]
  }
}


package typings.twilioSync.servicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var backoffConfig: js.Any = js.native
  
  var documentsUri: String = js.native
  
  var insightsUri: String = js.native
  
  var listsUri: String = js.native
  
  var mapsUri: String = js.native
  
  var sessionStorageEnabled: Boolean = js.native
  
  var streamsUri: String = js.native
  
  var subscriptionsUri: String = js.native
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
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setBackoffConfig(value: js.Any): Self = this.set("backoffConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUri(value: String): Self = this.set("documentsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsUri(value: String): Self = this.set("insightsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsUri(value: String): Self = this.set("listsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapsUri(value: String): Self = this.set("mapsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionStorageEnabled(value: Boolean): Self = this.set("sessionStorageEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamsUri(value: String): Self = this.set("streamsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUri(value: String): Self = this.set("subscriptionsUri", value.asInstanceOf[js.Any])
  }
}

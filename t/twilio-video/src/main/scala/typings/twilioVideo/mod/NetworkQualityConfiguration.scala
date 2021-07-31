package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkQualityConfiguration extends StObject {
  
  var local: js.UndefOr[NetworkQualityVerbosity] = js.undefined
  
  var remote: js.UndefOr[NetworkQualityVerbosity] = js.undefined
}
object NetworkQualityConfiguration {
  
  @scala.inline
  def apply(): NetworkQualityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkQualityConfiguration]
  }
  
  @scala.inline
  implicit class NetworkQualityConfigurationMutableBuilder[Self <: NetworkQualityConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: NetworkQualityVerbosity): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setRemote(value: NetworkQualityVerbosity): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}

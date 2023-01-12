package typings.twilioVideo.tsdefTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkQualityConfiguration extends StObject {
  
  var local: js.UndefOr[NetworkQualityVerbosity] = js.undefined
  
  var remote: js.UndefOr[NetworkQualityVerbosity] = js.undefined
}
object NetworkQualityConfiguration {
  
  inline def apply(): NetworkQualityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkQualityConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkQualityConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: NetworkQualityVerbosity): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setRemote(value: NetworkQualityVerbosity): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}

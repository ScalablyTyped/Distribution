package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseSettings extends StObject {
  
  var retentionSettings: RetentionSettings
}
object ReleaseSettings {
  
  inline def apply(retentionSettings: RetentionSettings): ReleaseSettings = {
    val __obj = js.Dynamic.literal(retentionSettings = retentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseSettings] (val x: Self) extends AnyVal {
    
    inline def setRetentionSettings(value: RetentionSettings): Self = StObject.set(x, "retentionSettings", value.asInstanceOf[js.Any])
  }
}

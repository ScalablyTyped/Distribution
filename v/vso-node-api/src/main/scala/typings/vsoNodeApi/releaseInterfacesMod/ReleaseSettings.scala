package typings.vsoNodeApi.releaseInterfacesMod

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
  
  extension [Self <: ReleaseSettings](x: Self) {
    
    inline def setRetentionSettings(value: RetentionSettings): Self = StObject.set(x, "retentionSettings", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseSettings extends StObject {
  
  var retentionSettings: RetentionSettings = js.native
}
object ReleaseSettings {
  
  @scala.inline
  def apply(retentionSettings: RetentionSettings): ReleaseSettings = {
    val __obj = js.Dynamic.literal(retentionSettings = retentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseSettings]
  }
  
  @scala.inline
  implicit class ReleaseSettingsMutableBuilder[Self <: ReleaseSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetentionSettings(value: RetentionSettings): Self = StObject.set(x, "retentionSettings", value.asInstanceOf[js.Any])
  }
}

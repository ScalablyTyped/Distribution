package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginRemoveEditorsNSData extends PluginConfig {
  
  var removeEditorsNSData: Boolean | js.Object = js.native
}
object PluginRemoveEditorsNSData {
  
  @scala.inline
  def apply(removeEditorsNSData: Boolean | js.Object): PluginRemoveEditorsNSData = {
    val __obj = js.Dynamic.literal(removeEditorsNSData = removeEditorsNSData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEditorsNSData]
  }
  
  @scala.inline
  implicit class PluginRemoveEditorsNSDataMutableBuilder[Self <: PluginRemoveEditorsNSData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveEditorsNSData(value: Boolean | js.Object): Self = StObject.set(x, "removeEditorsNSData", value.asInstanceOf[js.Any])
  }
}

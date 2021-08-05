package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveEditorsNSData
  extends StObject
     with PluginConfig {
  
  var removeEditorsNSData: Boolean | js.Object
}
object PluginRemoveEditorsNSData {
  
  inline def apply(removeEditorsNSData: Boolean | js.Object): PluginRemoveEditorsNSData = {
    val __obj = js.Dynamic.literal(removeEditorsNSData = removeEditorsNSData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveEditorsNSData]
  }
  
  extension [Self <: PluginRemoveEditorsNSData](x: Self) {
    
    inline def setRemoveEditorsNSData(value: Boolean | js.Object): Self = StObject.set(x, "removeEditorsNSData", value.asInstanceOf[js.Any])
  }
}

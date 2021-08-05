package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginConvertPathData
  extends StObject
     with PluginConfig {
  
  var convertPathData: Boolean | js.Object
}
object PluginConvertPathData {
  
  inline def apply(convertPathData: Boolean | js.Object): PluginConvertPathData = {
    val __obj = js.Dynamic.literal(convertPathData = convertPathData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertPathData]
  }
  
  extension [Self <: PluginConvertPathData](x: Self) {
    
    inline def setConvertPathData(value: Boolean | js.Object): Self = StObject.set(x, "convertPathData", value.asInstanceOf[js.Any])
  }
}

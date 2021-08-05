package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VimeoCuePoint extends StObject {
  
  var data: VimeoCuePointData
  
  var id: String
  
  var time: Double
}
object VimeoCuePoint {
  
  inline def apply(data: VimeoCuePointData, id: String, time: Double): VimeoCuePoint = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VimeoCuePoint]
  }
  
  extension [Self <: VimeoCuePoint](x: Self) {
    
    inline def setData(value: VimeoCuePointData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

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
  
  @scala.inline
  def apply(data: VimeoCuePointData, id: String, time: Double): VimeoCuePoint = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VimeoCuePoint]
  }
  
  @scala.inline
  implicit class VimeoCuePointMutableBuilder[Self <: VimeoCuePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: VimeoCuePointData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

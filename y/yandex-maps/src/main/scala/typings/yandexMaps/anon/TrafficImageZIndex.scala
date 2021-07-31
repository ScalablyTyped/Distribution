package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficImageZIndex extends StObject {
  
  var trafficImageZIndex: js.UndefOr[Double] = js.undefined
  
  var trafficInfoZIndex: js.UndefOr[Double] = js.undefined
  
  var trafficJamZIndex: js.UndefOr[Double] = js.undefined
}
object TrafficImageZIndex {
  
  @scala.inline
  def apply(): TrafficImageZIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficImageZIndex]
  }
  
  @scala.inline
  implicit class TrafficImageZIndexMutableBuilder[Self <: TrafficImageZIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficImageZIndex(value: Double): Self = StObject.set(x, "trafficImageZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficImageZIndexUndefined: Self = StObject.set(x, "trafficImageZIndex", js.undefined)
    
    @scala.inline
    def setTrafficInfoZIndex(value: Double): Self = StObject.set(x, "trafficInfoZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficInfoZIndexUndefined: Self = StObject.set(x, "trafficInfoZIndex", js.undefined)
    
    @scala.inline
    def setTrafficJamZIndex(value: Double): Self = StObject.set(x, "trafficJamZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficJamZIndexUndefined: Self = StObject.set(x, "trafficJamZIndex", js.undefined)
  }
}

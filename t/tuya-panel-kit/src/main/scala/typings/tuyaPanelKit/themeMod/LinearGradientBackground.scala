package typings.tuyaPanelKit.themeMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradientBackground
  extends StObject
     with _BackgroundProps {
  
  var stops: js.UndefOr[Record[String, String]] = js.undefined
  
  var x1: js.UndefOr[String] = js.undefined
  
  var x2: js.UndefOr[String] = js.undefined
  
  var y1: js.UndefOr[String] = js.undefined
  
  var y2: js.UndefOr[String] = js.undefined
}
object LinearGradientBackground {
  
  @scala.inline
  def apply(): LinearGradientBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientBackground]
  }
  
  @scala.inline
  implicit class LinearGradientBackgroundMutableBuilder[Self <: LinearGradientBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStops(value: Record[String, String]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}

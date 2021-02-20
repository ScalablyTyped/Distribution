package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XY extends StObject {
  
  var x: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
  
  var y: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
}
object XY {
  
  @scala.inline
  def apply(): XY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XY]
  }
  
  @scala.inline
  implicit class XYMutableBuilder[Self <: XY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

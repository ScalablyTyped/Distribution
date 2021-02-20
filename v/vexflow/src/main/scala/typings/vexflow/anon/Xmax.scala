package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xmax extends StObject {
  
  var height: Double = js.native
  
  var width: Double = js.native
  
  var x_max: Double = js.native
  
  var x_min: Double = js.native
}
object Xmax {
  
  @scala.inline
  def apply(height: Double, width: Double, x_max: Double, x_min: Double): Xmax = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xmax]
  }
  
  @scala.inline
  implicit class XmaxMutableBuilder[Self <: Xmax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_max(value: Double): Self = StObject.set(x, "x_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_min(value: Double): Self = StObject.set(x, "x_min", value.asInstanceOf[js.Any])
  }
}

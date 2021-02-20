package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRectangle extends StObject {
  
  def contains(point: IPoint): Boolean = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object IRectangle {
  
  @scala.inline
  def apply(contains: IPoint => Boolean, height: Double, width: Double, x: Double, y: Double): IRectangle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRectangle]
  }
  
  @scala.inline
  implicit class IRectangleMutableBuilder[Self <: IRectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: IPoint => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

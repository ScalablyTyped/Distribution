package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detail extends StObject {
  
  var detail: Double
  
  var radius: Double
}
object Detail {
  
  @scala.inline
  def apply(detail: Double, radius: Double): Detail = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
  
  @scala.inline
  implicit class DetailMutableBuilder[Self <: Detail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}

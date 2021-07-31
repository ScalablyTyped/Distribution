package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extraleftpx extends StObject {
  
  var extra_left_px: Double
  
  var extra_right_px: Double
  
  var spacing: Double
  
  var width: Double
}
object Extraleftpx {
  
  @scala.inline
  def apply(extra_left_px: Double, extra_right_px: Double, spacing: Double, width: Double): Extraleftpx = {
    val __obj = js.Dynamic.literal(extra_left_px = extra_left_px.asInstanceOf[js.Any], extra_right_px = extra_right_px.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extraleftpx]
  }
  
  @scala.inline
  implicit class ExtraleftpxMutableBuilder[Self <: Extraleftpx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra_left_px(value: Double): Self = StObject.set(x, "extra_left_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra_right_px(value: Double): Self = StObject.set(x, "extra_right_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

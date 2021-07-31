package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraLeft extends StObject {
  
  var extraLeft: Double
  
  var extraRight: Double
  
  var left: Double
  
  var right: Double
}
object ExtraLeft {
  
  @scala.inline
  def apply(extraLeft: Double, extraRight: Double, left: Double, right: Double): ExtraLeft = {
    val __obj = js.Dynamic.literal(extraLeft = extraLeft.asInstanceOf[js.Any], extraRight = extraRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraLeft]
  }
  
  @scala.inline
  implicit class ExtraLeftMutableBuilder[Self <: ExtraLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraLeft(value: Double): Self = StObject.set(x, "extraLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraRight(value: Double): Self = StObject.set(x, "extraRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}

package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossSlideThresholds extends StObject {
  
  var rearrangeStart: Double
  
  var selectionStart: Double
  
  var speedBumpEnd: Double
  
  var speedBumpStart: Double
}
object CrossSlideThresholds {
  
  inline def apply(rearrangeStart: Double, selectionStart: Double, speedBumpEnd: Double, speedBumpStart: Double): CrossSlideThresholds = {
    val __obj = js.Dynamic.literal(rearrangeStart = rearrangeStart.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], speedBumpEnd = speedBumpEnd.asInstanceOf[js.Any], speedBumpStart = speedBumpStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlideThresholds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossSlideThresholds] (val x: Self) extends AnyVal {
    
    inline def setRearrangeStart(value: Double): Self = StObject.set(x, "rearrangeStart", value.asInstanceOf[js.Any])
    
    inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    inline def setSpeedBumpEnd(value: Double): Self = StObject.set(x, "speedBumpEnd", value.asInstanceOf[js.Any])
    
    inline def setSpeedBumpStart(value: Double): Self = StObject.set(x, "speedBumpStart", value.asInstanceOf[js.Any])
  }
}

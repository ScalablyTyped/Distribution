package typings.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the distance thresholds for a CrossSliding interaction. */
trait CrossSlideThresholds extends StObject {
  
  /** The distance, in DIPs, from the initial point of contact until the rearrange action is initiated. */
  var rearrangeStart: Double
  
  /** The distance, in DIPs, from the initial point of contact until the selection action is initiated. */
  var selectionStart: Double
  
  /** The distance, in DIPs, from the initial point of contact until the end of the speed bump. */
  var speedBumpEnd: Double
  
  /** The distance, in DIPs, from the initial point of contact until the speed bump is initiated. */
  var speedBumpStart: Double
}
object CrossSlideThresholds {
  
  inline def apply(rearrangeStart: Double, selectionStart: Double, speedBumpEnd: Double, speedBumpStart: Double): CrossSlideThresholds = {
    val __obj = js.Dynamic.literal(rearrangeStart = rearrangeStart.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], speedBumpEnd = speedBumpEnd.asInstanceOf[js.Any], speedBumpStart = speedBumpStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlideThresholds]
  }
  
  extension [Self <: CrossSlideThresholds](x: Self) {
    
    inline def setRearrangeStart(value: Double): Self = StObject.set(x, "rearrangeStart", value.asInstanceOf[js.Any])
    
    inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    inline def setSpeedBumpEnd(value: Double): Self = StObject.set(x, "speedBumpEnd", value.asInstanceOf[js.Any])
    
    inline def setSpeedBumpStart(value: Double): Self = StObject.set(x, "speedBumpStart", value.asInstanceOf[js.Any])
  }
}

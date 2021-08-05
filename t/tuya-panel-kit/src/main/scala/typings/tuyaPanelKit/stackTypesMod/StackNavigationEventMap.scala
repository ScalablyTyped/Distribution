package typings.tuyaPanelKit.stackTypesMod

import typings.tuyaPanelKit.anon.Data
import typings.tuyaPanelKit.anon.DataClosing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackNavigationEventMap extends StObject {
  
  /**
    * Event which fires when navigation gesture is canceled.
    */
  var gestureCancel: Data
  
  /**
    * Event which fires when navigation gesture is completed.
    */
  var gestureEnd: Data
  
  /**
    * Event which fires when navigation gesture starts.
    */
  var gestureStart: Data
  
  /**
    * Event which fires when a transition animation ends.
    */
  var transitionEnd: DataClosing
  
  /**
    * Event which fires when a transition animation starts.
    */
  var transitionStart: DataClosing
}
object StackNavigationEventMap {
  
  inline def apply(
    gestureCancel: Data,
    gestureEnd: Data,
    gestureStart: Data,
    transitionEnd: DataClosing,
    transitionStart: DataClosing
  ): StackNavigationEventMap = {
    val __obj = js.Dynamic.literal(gestureCancel = gestureCancel.asInstanceOf[js.Any], gestureEnd = gestureEnd.asInstanceOf[js.Any], gestureStart = gestureStart.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any], transitionStart = transitionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNavigationEventMap]
  }
  
  extension [Self <: StackNavigationEventMap](x: Self) {
    
    inline def setGestureCancel(value: Data): Self = StObject.set(x, "gestureCancel", value.asInstanceOf[js.Any])
    
    inline def setGestureEnd(value: Data): Self = StObject.set(x, "gestureEnd", value.asInstanceOf[js.Any])
    
    inline def setGestureStart(value: Data): Self = StObject.set(x, "gestureStart", value.asInstanceOf[js.Any])
    
    inline def setTransitionEnd(value: DataClosing): Self = StObject.set(x, "transitionEnd", value.asInstanceOf[js.Any])
    
    inline def setTransitionStart(value: DataClosing): Self = StObject.set(x, "transitionStart", value.asInstanceOf[js.Any])
  }
}

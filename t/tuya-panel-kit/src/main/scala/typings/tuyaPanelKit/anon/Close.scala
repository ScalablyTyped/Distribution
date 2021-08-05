package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.stackTypesMod.TransitionSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  /**
    * Transition configuration when removing a screen.
    */
  var close: TransitionSpec
  
  /**
    * Transition configuration when adding a screen.
    */
  var open: TransitionSpec
}
object Close {
  
  inline def apply(close: TransitionSpec, open: TransitionSpec): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: TransitionSpec): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: TransitionSpec): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}

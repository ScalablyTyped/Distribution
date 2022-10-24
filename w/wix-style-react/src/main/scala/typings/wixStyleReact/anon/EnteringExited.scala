package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnteringExited extends StObject {
  
  var entered: HeightLeft
  
  var entering: BottomHeight
  
  var exited: HeightLeft
  
  var exiting: LeftWidth
}
object EnteringExited {
  
  inline def apply(entered: HeightLeft, entering: BottomHeight, exited: HeightLeft, exiting: LeftWidth): EnteringExited = {
    val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], entering = entering.asInstanceOf[js.Any], exited = exited.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnteringExited]
  }
  
  extension [Self <: EnteringExited](x: Self) {
    
    inline def setEntered(value: HeightLeft): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
    
    inline def setEntering(value: BottomHeight): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
    
    inline def setExited(value: HeightLeft): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
    
    inline def setExiting(value: LeftWidth): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
  }
}

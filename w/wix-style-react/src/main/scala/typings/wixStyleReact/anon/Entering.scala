package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entering extends StObject {
  
  var entered: BottomString
  
  var entering: BottomString
  
  var exited: BottomString
  
  var exiting: BottomString
}
object Entering {
  
  inline def apply(entered: BottomString, entering: BottomString, exited: BottomString, exiting: BottomString): Entering = {
    val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], entering = entering.asInstanceOf[js.Any], exited = exited.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entering]
  }
  
  extension [Self <: Entering](x: Self) {
    
    inline def setEntered(value: BottomString): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
    
    inline def setEntering(value: BottomString): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
    
    inline def setExited(value: BottomString): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
    
    inline def setExiting(value: BottomString): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
  }
}

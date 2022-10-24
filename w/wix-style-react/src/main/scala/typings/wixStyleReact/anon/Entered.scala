package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entered extends StObject {
  
  var entered: LeftString
  
  var entering: LeftString
  
  var exited: LeftString
  
  var exiting: LeftString
}
object Entered {
  
  inline def apply(entered: LeftString, entering: LeftString, exited: LeftString, exiting: LeftString): Entered = {
    val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], entering = entering.asInstanceOf[js.Any], exited = exited.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entered]
  }
  
  extension [Self <: Entered](x: Self) {
    
    inline def setEntered(value: LeftString): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
    
    inline def setEntering(value: LeftString): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
    
    inline def setExited(value: LeftString): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
    
    inline def setExiting(value: LeftString): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
  }
}

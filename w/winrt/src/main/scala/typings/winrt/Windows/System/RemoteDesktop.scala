package typings.winrt.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RemoteDesktop {
  
  trait IInteractiveSessionStatics extends StObject {
    
    var isRemote: Boolean
  }
  object IInteractiveSessionStatics {
    
    inline def apply(isRemote: Boolean): IInteractiveSessionStatics = {
      val __obj = js.Dynamic.literal(isRemote = isRemote.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInteractiveSessionStatics]
    }
    
    extension [Self <: IInteractiveSessionStatics](x: Self) {
      
      inline def setIsRemote(value: Boolean): Self = StObject.set(x, "isRemote", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractiveSession extends StObject
}

package typings.winrt.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RemoteDesktop {
  
  @js.native
  trait IInteractiveSessionStatics extends StObject {
    
    var isRemote: Boolean = js.native
  }
  object IInteractiveSessionStatics {
    
    @scala.inline
    def apply(isRemote: Boolean): IInteractiveSessionStatics = {
      val __obj = js.Dynamic.literal(isRemote = isRemote.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInteractiveSessionStatics]
    }
    
    @scala.inline
    implicit class IInteractiveSessionStaticsMutableBuilder[Self <: IInteractiveSessionStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRemote(value: Boolean): Self = StObject.set(x, "isRemote", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InteractiveSession extends StObject
}

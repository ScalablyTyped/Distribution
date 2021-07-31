package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleSwitchDriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (hasElementEventTrigger : wix-ui-core.anon.Element): wix-ui-core.anon.GetId extends (args : any): infer R ? any : any */ trait ToggleSwitchDriver extends StObject {
    
    def getSize(): String
    
    def getSkin(): String
  }
  object ToggleSwitchDriver {
    
    @scala.inline
    def apply(getSize: () => String, getSkin: () => String): ToggleSwitchDriver = {
      val __obj = js.Dynamic.literal(getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin))
      __obj.asInstanceOf[ToggleSwitchDriver]
    }
    
    @scala.inline
    implicit class ToggleSwitchDriverMutableBuilder[Self <: ToggleSwitchDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSize(value: () => String): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSkin(value: () => String): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    }
  }
}

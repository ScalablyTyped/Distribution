package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleSwitchToggleSwitchDotdriverMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (param0 : wix-style-react.anon.EventTrigger): wix-style-react.anon.GetId extends (args : any): infer R ? R : any */ trait ToggleSwitchDriver extends StObject {
    
    def getSize(): String
    
    def getSkin(): String
  }
  object ToggleSwitchDriver {
    
    inline def apply(getSize: () => String, getSkin: () => String): ToggleSwitchDriver = {
      val __obj = js.Dynamic.literal(getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin))
      __obj.asInstanceOf[ToggleSwitchDriver]
    }
    
    extension [Self <: ToggleSwitchDriver](x: Self) {
      
      inline def setGetSize(value: () => String): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => String): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    }
  }
}

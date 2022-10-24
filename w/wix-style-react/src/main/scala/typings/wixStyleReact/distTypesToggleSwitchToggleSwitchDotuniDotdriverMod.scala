package typings.wixStyleReact

import typings.wixStyleReact.distTypesToggleSwitchToggleSwitchCoreToggleSwitchCoreDotuniDotdriverMod.ToggleSwitchCoreUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleSwitchToggleSwitchDotuniDotdriverMod {
  
  trait ToggleSwitchUniDriver
    extends StObject
       with ToggleSwitchCoreUniDriver {
    
    def getSize(): js.Promise[String]
    
    def getSkin(): js.Promise[String]
  }
  object ToggleSwitchUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getId: () => js.Promise[String],
      getKnobIcon: () => js.Promise[js.Object],
      getKnobIconStyles: () => js.Promise[js.Object],
      getKnobStyles: () => js.Promise[js.Object],
      getRootStyles: () => js.Promise[js.Object],
      getSize: () => js.Promise[String],
      getSkin: () => js.Promise[String],
      getTabIndex: () => js.Promise[Double],
      getTrackStyles: () => js.Promise[js.Object],
      hasKnobIcon: () => js.Promise[Boolean],
      isChecked: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean]
    ): ToggleSwitchUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getId = js.Any.fromFunction0(getId), getKnobIcon = js.Any.fromFunction0(getKnobIcon), getKnobIconStyles = js.Any.fromFunction0(getKnobIconStyles), getKnobStyles = js.Any.fromFunction0(getKnobStyles), getRootStyles = js.Any.fromFunction0(getRootStyles), getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin), getTabIndex = js.Any.fromFunction0(getTabIndex), getTrackStyles = js.Any.fromFunction0(getTrackStyles), hasKnobIcon = js.Any.fromFunction0(hasKnobIcon), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[ToggleSwitchUniDriver]
    }
    
    extension [Self <: ToggleSwitchUniDriver](x: Self) {
      
      inline def setGetSize(value: () => js.Promise[String]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[String]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    }
  }
}

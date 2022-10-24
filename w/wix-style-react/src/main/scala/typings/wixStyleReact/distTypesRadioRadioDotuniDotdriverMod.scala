package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadioRadioDotuniDotdriverMod {
  
  trait RadioUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getId(): js.Promise[String]
    
    def getLabel(): js.Promise[String]
    
    def getName(): js.Promise[String]
    
    def getValue(): js.Promise[String]
    
    def iconExists(): js.Promise[Boolean]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def keyDown(key: String): js.Promise[Unit]
    
    def labelExists(): js.Promise[Boolean]
  }
  object RadioUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getId: () => js.Promise[String],
      getLabel: () => js.Promise[String],
      getName: () => js.Promise[String],
      getValue: () => js.Promise[String],
      iconExists: () => js.Promise[Boolean],
      isChecked: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      keyDown: String => js.Promise[Unit],
      labelExists: () => js.Promise[Boolean]
    ): RadioUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getValue = js.Any.fromFunction0(getValue), iconExists = js.Any.fromFunction0(iconExists), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), keyDown = js.Any.fromFunction1(keyDown), labelExists = js.Any.fromFunction0(labelExists))
      __obj.asInstanceOf[RadioUniDriver]
    }
    
    extension [Self <: RadioUniDriver](x: Self) {
      
      inline def setGetId(value: () => js.Promise[String]): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => js.Promise[String]): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "iconExists", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setKeyDown(value: String => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      inline def setLabelExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "labelExists", js.Any.fromFunction0(value))
    }
  }
}

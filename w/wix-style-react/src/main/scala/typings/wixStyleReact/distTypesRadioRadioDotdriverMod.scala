package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadioRadioDotdriverMod {
  
  trait RadioDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getId(): String
    
    def getLabel(): String
    
    def getName(): String
    
    def getValue(): String
    
    def iconExists(): Boolean
    
    def isChecked(): Boolean
    
    def isDisabled(): Boolean
    
    def keyDown(key: String): Unit
    
    def labelExists(): Boolean
  }
  object RadioDriver {
    
    inline def apply(
      click: () => Unit,
      exists: () => Boolean,
      getId: () => String,
      getLabel: () => String,
      getName: () => String,
      getValue: () => String,
      iconExists: () => Boolean,
      isChecked: () => Boolean,
      isDisabled: () => Boolean,
      keyDown: String => Unit,
      labelExists: () => Boolean
    ): RadioDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getValue = js.Any.fromFunction0(getValue), iconExists = js.Any.fromFunction0(iconExists), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), keyDown = js.Any.fromFunction1(keyDown), labelExists = js.Any.fromFunction0(labelExists))
      __obj.asInstanceOf[RadioDriver]
    }
    
    extension [Self <: RadioDriver](x: Self) {
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setIconExists(value: () => Boolean): Self = StObject.set(x, "iconExists", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setKeyDown(value: String => Unit): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      inline def setLabelExists(value: () => Boolean): Self = StObject.set(x, "labelExists", js.Any.fromFunction0(value))
    }
  }
}

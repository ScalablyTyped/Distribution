package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldDriverMod {
  
  trait FormFieldDriver
    extends StObject
       with BaseDriver {
    
    def element(): HTMLElement
    
    def getChildren(): HTMLElement | Null
    
    def getInfoContent(): String
    
    def getLabel(): HTMLElement | Null
    
    def getLengthLeft(): Double | Null
    
    def getSuffix(): HTMLElement | Null
    
    def hasTooltip(): Boolean
    
    def isLengthExceeded(): Boolean
    
    def isRequired(): Boolean
  }
  object FormFieldDriver {
    
    inline def apply(
      element: () => HTMLElement,
      exists: () => Boolean,
      getChildren: () => HTMLElement | Null,
      getInfoContent: () => String,
      getLabel: () => HTMLElement | Null,
      getLengthLeft: () => Double | Null,
      getSuffix: () => HTMLElement | Null,
      hasTooltip: () => Boolean,
      isLengthExceeded: () => Boolean,
      isRequired: () => Boolean
    ): FormFieldDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getInfoContent = js.Any.fromFunction0(getInfoContent), getLabel = js.Any.fromFunction0(getLabel), getLengthLeft = js.Any.fromFunction0(getLengthLeft), getSuffix = js.Any.fromFunction0(getSuffix), hasTooltip = js.Any.fromFunction0(hasTooltip), isLengthExceeded = js.Any.fromFunction0(isLengthExceeded), isRequired = js.Any.fromFunction0(isRequired))
      __obj.asInstanceOf[FormFieldDriver]
    }
    
    extension [Self <: FormFieldDriver](x: Self) {
      
      inline def setElement(value: () => HTMLElement): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setGetChildren(value: () => HTMLElement | Null): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetInfoContent(value: () => String): Self = StObject.set(x, "getInfoContent", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => HTMLElement | Null): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLengthLeft(value: () => Double | Null): Self = StObject.set(x, "getLengthLeft", js.Any.fromFunction0(value))
      
      inline def setGetSuffix(value: () => HTMLElement | Null): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
      
      inline def setHasTooltip(value: () => Boolean): Self = StObject.set(x, "hasTooltip", js.Any.fromFunction0(value))
      
      inline def setIsLengthExceeded(value: () => Boolean): Self = StObject.set(x, "isLengthExceeded", js.Any.fromFunction0(value))
      
      inline def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    }
  }
}

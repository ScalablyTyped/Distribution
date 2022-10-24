package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesCommonMod.StatusIndications
import typings.wixStyleReact.distTypesFormFieldMod.LabelSize
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormFieldFormFieldDotdriverMod {
  
  trait FormFieldDriver
    extends StObject
       with BaseDriver {
    
    def element(): HTMLElement
    
    def getChildren(): HTMLElement | Null
    
    def getInfoContent(): String
    
    def getLabel(): HTMLElement | Null
    
    def getLabelSize(): LabelSize
    
    def getLengthLeft(): Double | Null
    
    def getStatusMessage(): String
    
    def getSuffix(): HTMLElement | Null
    
    def hasStatus(status: StatusIndications): Boolean
    
    def hasTooltip(): Boolean
    
    def hoverInfoIcon(): js.Promise[Unit]
    
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
      getLabelSize: () => LabelSize,
      getLengthLeft: () => Double | Null,
      getStatusMessage: () => String,
      getSuffix: () => HTMLElement | Null,
      hasStatus: StatusIndications => Boolean,
      hasTooltip: () => Boolean,
      hoverInfoIcon: () => js.Promise[Unit],
      isLengthExceeded: () => Boolean,
      isRequired: () => Boolean
    ): FormFieldDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getInfoContent = js.Any.fromFunction0(getInfoContent), getLabel = js.Any.fromFunction0(getLabel), getLabelSize = js.Any.fromFunction0(getLabelSize), getLengthLeft = js.Any.fromFunction0(getLengthLeft), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getSuffix = js.Any.fromFunction0(getSuffix), hasStatus = js.Any.fromFunction1(hasStatus), hasTooltip = js.Any.fromFunction0(hasTooltip), hoverInfoIcon = js.Any.fromFunction0(hoverInfoIcon), isLengthExceeded = js.Any.fromFunction0(isLengthExceeded), isRequired = js.Any.fromFunction0(isRequired))
      __obj.asInstanceOf[FormFieldDriver]
    }
    
    extension [Self <: FormFieldDriver](x: Self) {
      
      inline def setElement(value: () => HTMLElement): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setGetChildren(value: () => HTMLElement | Null): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetInfoContent(value: () => String): Self = StObject.set(x, "getInfoContent", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => HTMLElement | Null): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelSize(value: () => LabelSize): Self = StObject.set(x, "getLabelSize", js.Any.fromFunction0(value))
      
      inline def setGetLengthLeft(value: () => Double | Null): Self = StObject.set(x, "getLengthLeft", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => String): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetSuffix(value: () => HTMLElement | Null): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => Boolean): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHasTooltip(value: () => Boolean): Self = StObject.set(x, "hasTooltip", js.Any.fromFunction0(value))
      
      inline def setHoverInfoIcon(value: () => js.Promise[Unit]): Self = StObject.set(x, "hoverInfoIcon", js.Any.fromFunction0(value))
      
      inline def setIsLengthExceeded(value: () => Boolean): Self = StObject.set(x, "isLengthExceeded", js.Any.fromFunction0(value))
      
      inline def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    }
  }
}

package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesCommonMod.StatusIndications
import typings.wixStyleReact.distTypesFormFieldMod.LabelSize
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormFieldFormFieldDotuniDotdriverMod {
  
  trait FormFieldUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getChildren(): js.Promise[HTMLElement | Null]
    
    def getInfoContent(): js.Promise[String]
    
    def getLabel(): js.Promise[HTMLElement | Null]
    
    def getLabelSize(): js.Promise[LabelSize]
    
    def getLengthLeft(): js.Promise[Double | Null]
    
    def getStatusMessage(): js.Promise[String]
    
    def getSuffix(): js.Promise[HTMLElement | Null]
    
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def hasTooltip(): js.Promise[Boolean]
    
    def hoverInfoIcon(): js.Promise[Unit]
    
    def isLengthExceeded(): js.Promise[Boolean]
    
    def isRequired(): js.Promise[Boolean]
  }
  object FormFieldUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getChildren: () => js.Promise[HTMLElement | Null],
      getInfoContent: () => js.Promise[String],
      getLabel: () => js.Promise[HTMLElement | Null],
      getLabelSize: () => js.Promise[LabelSize],
      getLengthLeft: () => js.Promise[Double | Null],
      getStatusMessage: () => js.Promise[String],
      getSuffix: () => js.Promise[HTMLElement | Null],
      hasStatus: StatusIndications => js.Promise[Boolean],
      hasTooltip: () => js.Promise[Boolean],
      hoverInfoIcon: () => js.Promise[Unit],
      isLengthExceeded: () => js.Promise[Boolean],
      isRequired: () => js.Promise[Boolean]
    ): FormFieldUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getInfoContent = js.Any.fromFunction0(getInfoContent), getLabel = js.Any.fromFunction0(getLabel), getLabelSize = js.Any.fromFunction0(getLabelSize), getLengthLeft = js.Any.fromFunction0(getLengthLeft), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getSuffix = js.Any.fromFunction0(getSuffix), hasStatus = js.Any.fromFunction1(hasStatus), hasTooltip = js.Any.fromFunction0(hasTooltip), hoverInfoIcon = js.Any.fromFunction0(hoverInfoIcon), isLengthExceeded = js.Any.fromFunction0(isLengthExceeded), isRequired = js.Any.fromFunction0(isRequired))
      __obj.asInstanceOf[FormFieldUniDriver]
    }
    
    extension [Self <: FormFieldUniDriver](x: Self) {
      
      inline def setGetChildren(value: () => js.Promise[HTMLElement | Null]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetInfoContent(value: () => js.Promise[String]): Self = StObject.set(x, "getInfoContent", js.Any.fromFunction0(value))
      
      inline def setGetLabel(value: () => js.Promise[HTMLElement | Null]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelSize(value: () => js.Promise[LabelSize]): Self = StObject.set(x, "getLabelSize", js.Any.fromFunction0(value))
      
      inline def setGetLengthLeft(value: () => js.Promise[Double | Null]): Self = StObject.set(x, "getLengthLeft", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetSuffix(value: () => js.Promise[HTMLElement | Null]): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHasTooltip(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTooltip", js.Any.fromFunction0(value))
      
      inline def setHoverInfoIcon(value: () => js.Promise[Unit]): Self = StObject.set(x, "hoverInfoIcon", js.Any.fromFunction0(value))
      
      inline def setIsLengthExceeded(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLengthExceeded", js.Any.fromFunction0(value))
      
      inline def setIsRequired(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    }
  }
}

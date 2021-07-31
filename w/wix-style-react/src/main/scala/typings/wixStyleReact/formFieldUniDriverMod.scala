package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldUniDriverMod {
  
  trait FormFieldUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getChildren(): js.Promise[HTMLElement | Null]
    
    def getInfoContent(): js.Promise[String]
    
    def getLabel(): js.Promise[HTMLElement | Null]
    
    def getLengthLeft(): js.Promise[Double | Null]
    
    def getSuffix(): js.Promise[HTMLElement | Null]
    
    def hasTooltip(): js.Promise[Boolean]
    
    def isLengthExceeded(): js.Promise[Boolean]
    
    def isRequired(): js.Promise[Boolean]
  }
  object FormFieldUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getChildren: () => js.Promise[HTMLElement | Null],
      getInfoContent: () => js.Promise[String],
      getLabel: () => js.Promise[HTMLElement | Null],
      getLengthLeft: () => js.Promise[Double | Null],
      getSuffix: () => js.Promise[HTMLElement | Null],
      hasTooltip: () => js.Promise[Boolean],
      isLengthExceeded: () => js.Promise[Boolean],
      isRequired: () => js.Promise[Boolean]
    ): FormFieldUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getInfoContent = js.Any.fromFunction0(getInfoContent), getLabel = js.Any.fromFunction0(getLabel), getLengthLeft = js.Any.fromFunction0(getLengthLeft), getSuffix = js.Any.fromFunction0(getSuffix), hasTooltip = js.Any.fromFunction0(hasTooltip), isLengthExceeded = js.Any.fromFunction0(isLengthExceeded), isRequired = js.Any.fromFunction0(isRequired))
      __obj.asInstanceOf[FormFieldUniDriver]
    }
    
    @scala.inline
    implicit class FormFieldUniDriverMutableBuilder[Self <: FormFieldUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetChildren(value: () => js.Promise[HTMLElement | Null]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInfoContent(value: () => js.Promise[String]): Self = StObject.set(x, "getInfoContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabel(value: () => js.Promise[HTMLElement | Null]): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLengthLeft(value: () => js.Promise[Double | Null]): Self = StObject.set(x, "getLengthLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSuffix(value: () => js.Promise[HTMLElement | Null]): Self = StObject.set(x, "getSuffix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasTooltip(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTooltip", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLengthExceeded(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLengthExceeded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRequired(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    }
  }
}

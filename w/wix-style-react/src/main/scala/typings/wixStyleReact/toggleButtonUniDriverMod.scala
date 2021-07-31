package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonUniDriverMod {
  
  trait ToggleButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getLabelPlacement(): js.Promise[String]
    
    def getLabelValue(): js.Promise[String]
    
    def getSkin(): js.Promise[String | Null]
    
    var isButtonDisabled: js.Function0[js.Promise[Boolean]]
    
    def isButtonSelected(): js.Promise[Boolean]
  }
  object ToggleButtonUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getLabelPlacement: () => js.Promise[String],
      getLabelValue: () => js.Promise[String],
      getSkin: () => js.Promise[String | Null],
      isButtonDisabled: () => js.Promise[Boolean],
      isButtonSelected: () => js.Promise[Boolean]
    ): ToggleButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getLabelPlacement = js.Any.fromFunction0(getLabelPlacement), getLabelValue = js.Any.fromFunction0(getLabelValue), getSkin = js.Any.fromFunction0(getSkin), isButtonDisabled = js.Any.fromFunction0(isButtonDisabled), isButtonSelected = js.Any.fromFunction0(isButtonSelected))
      __obj.asInstanceOf[ToggleButtonUniDriver]
    }
    
    @scala.inline
    implicit class ToggleButtonUniDriverMutableBuilder[Self <: ToggleButtonUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLabelPlacement(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelPlacement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelValue(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSkin(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isButtonDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsButtonSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isButtonSelected", js.Any.fromFunction0(value))
    }
  }
}

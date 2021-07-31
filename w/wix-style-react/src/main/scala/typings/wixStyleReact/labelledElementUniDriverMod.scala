package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelledElementUniDriverMod {
  
  trait LabelledElementUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getChildrenDriver(): BaseUniDriver
    
    def getLabelForAttribute(): js.Promise[String]
    
    def getLabelText(): js.Promise[String]
    
    def isLabelAtTop(): js.Promise[Boolean]
  }
  object LabelledElementUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getChildrenDriver: () => BaseUniDriver,
      getLabelForAttribute: () => js.Promise[String],
      getLabelText: () => js.Promise[String],
      isLabelAtTop: () => js.Promise[Boolean]
    ): LabelledElementUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildrenDriver = js.Any.fromFunction0(getChildrenDriver), getLabelForAttribute = js.Any.fromFunction0(getLabelForAttribute), getLabelText = js.Any.fromFunction0(getLabelText), isLabelAtTop = js.Any.fromFunction0(isLabelAtTop))
      __obj.asInstanceOf[LabelledElementUniDriver]
    }
    
    @scala.inline
    implicit class LabelledElementUniDriverMutableBuilder[Self <: LabelledElementUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetChildrenDriver(value: () => BaseUniDriver): Self = StObject.set(x, "getChildrenDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelForAttribute(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelForAttribute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelText(value: () => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLabelAtTop(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLabelAtTop", js.Any.fromFunction0(value))
    }
  }
}

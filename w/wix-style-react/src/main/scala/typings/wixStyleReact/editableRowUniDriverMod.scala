package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableRowUniDriverMod {
  
  trait EditableRowUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickApprove(): js.Promise[Unit]
    
    def clickCancel(): js.Promise[Unit]
    
    def getText(): js.Promise[String]
    
    def isApproveDisabled(): js.Promise[Boolean]
    
    def isInputFocused(): js.Promise[Boolean]
    
    def keyDown(keyCode: Double): js.Promise[Unit]
    
    def setText(text: String): js.Promise[Unit]
  }
  object EditableRowUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickApprove: () => js.Promise[Unit],
      clickCancel: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getText: () => js.Promise[String],
      isApproveDisabled: () => js.Promise[Boolean],
      isInputFocused: () => js.Promise[Boolean],
      keyDown: Double => js.Promise[Unit],
      setText: String => js.Promise[Unit]
    ): EditableRowUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickApprove = js.Any.fromFunction0(clickApprove), clickCancel = js.Any.fromFunction0(clickCancel), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getText = js.Any.fromFunction0(getText), isApproveDisabled = js.Any.fromFunction0(isApproveDisabled), isInputFocused = js.Any.fromFunction0(isInputFocused), keyDown = js.Any.fromFunction1(keyDown), setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[EditableRowUniDriver]
    }
    
    @scala.inline
    implicit class EditableRowUniDriverMutableBuilder[Self <: EditableRowUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickApprove(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickApprove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsApproveDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isApproveDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsInputFocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isInputFocused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeyDown(value: Double => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetText(value: String => js.Promise[Unit]): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
}

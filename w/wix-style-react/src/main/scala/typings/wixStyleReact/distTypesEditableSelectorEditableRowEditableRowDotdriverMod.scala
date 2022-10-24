package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorEditableRowEditableRowDotdriverMod {
  
  trait EditableRowDriver
    extends StObject
       with BaseDriver {
    
    def clickApprove(): Unit
    
    def clickCancel(): Unit
    
    def getText(): String
    
    def isApproveDisabled(): Boolean
    
    def isInputFocused(): Boolean
    
    def keyDown(keyCode: Double): Unit
    
    def setText(text: String): Unit
  }
  object EditableRowDriver {
    
    inline def apply(
      clickApprove: () => Unit,
      clickCancel: () => Unit,
      exists: () => Boolean,
      getText: () => String,
      isApproveDisabled: () => Boolean,
      isInputFocused: () => Boolean,
      keyDown: Double => Unit,
      setText: String => Unit
    ): EditableRowDriver = {
      val __obj = js.Dynamic.literal(clickApprove = js.Any.fromFunction0(clickApprove), clickCancel = js.Any.fromFunction0(clickCancel), exists = js.Any.fromFunction0(exists), getText = js.Any.fromFunction0(getText), isApproveDisabled = js.Any.fromFunction0(isApproveDisabled), isInputFocused = js.Any.fromFunction0(isInputFocused), keyDown = js.Any.fromFunction1(keyDown), setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[EditableRowDriver]
    }
    
    extension [Self <: EditableRowDriver](x: Self) {
      
      inline def setClickApprove(value: () => Unit): Self = StObject.set(x, "clickApprove", js.Any.fromFunction0(value))
      
      inline def setClickCancel(value: () => Unit): Self = StObject.set(x, "clickCancel", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setIsApproveDisabled(value: () => Boolean): Self = StObject.set(x, "isApproveDisabled", js.Any.fromFunction0(value))
      
      inline def setIsInputFocused(value: () => Boolean): Self = StObject.set(x, "isInputFocused", js.Any.fromFunction0(value))
      
      inline def setKeyDown(value: Double => Unit): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
}

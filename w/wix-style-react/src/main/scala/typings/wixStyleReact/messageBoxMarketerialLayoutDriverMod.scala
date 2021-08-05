package typings.wixStyleReact

import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBoxMarketerialLayoutDriverMod {
  
  trait MessageBoxMarketerialLayoutDriver
    extends StObject
       with BaseDriver {
    
    def clickOnPrimaryButton(): Unit
    
    def clickOnSecondaryButton(): Unit
    
    def closeMessageBox(): Unit
    
    def getContentBySelector(selector: String): HTMLElement | Null
    
    def getHeaderCloseButton(): HTMLButtonElement
    
    def getImageSrc(): String
    
    def getPrimaryButton(): HTMLButtonElement
    
    def getPrimaryButtonNode(): HTMLElement | Null
    
    def getPrimaryButtonText(): String
    
    def getSecondaryButton(): HTMLElement
    
    def getSecondaryButtonText(): String
    
    def getTitle(): String
  }
  object MessageBoxMarketerialLayoutDriver {
    
    inline def apply(
      clickOnPrimaryButton: () => Unit,
      clickOnSecondaryButton: () => Unit,
      closeMessageBox: () => Unit,
      exists: () => Boolean,
      getContentBySelector: String => HTMLElement | Null,
      getHeaderCloseButton: () => HTMLButtonElement,
      getImageSrc: () => String,
      getPrimaryButton: () => HTMLButtonElement,
      getPrimaryButtonNode: () => HTMLElement | Null,
      getPrimaryButtonText: () => String,
      getSecondaryButton: () => HTMLElement,
      getSecondaryButtonText: () => String,
      getTitle: () => String
    ): MessageBoxMarketerialLayoutDriver = {
      val __obj = js.Dynamic.literal(clickOnPrimaryButton = js.Any.fromFunction0(clickOnPrimaryButton), clickOnSecondaryButton = js.Any.fromFunction0(clickOnSecondaryButton), closeMessageBox = js.Any.fromFunction0(closeMessageBox), exists = js.Any.fromFunction0(exists), getContentBySelector = js.Any.fromFunction1(getContentBySelector), getHeaderCloseButton = js.Any.fromFunction0(getHeaderCloseButton), getImageSrc = js.Any.fromFunction0(getImageSrc), getPrimaryButton = js.Any.fromFunction0(getPrimaryButton), getPrimaryButtonNode = js.Any.fromFunction0(getPrimaryButtonNode), getPrimaryButtonText = js.Any.fromFunction0(getPrimaryButtonText), getSecondaryButton = js.Any.fromFunction0(getSecondaryButton), getSecondaryButtonText = js.Any.fromFunction0(getSecondaryButtonText), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[MessageBoxMarketerialLayoutDriver]
    }
    
    extension [Self <: MessageBoxMarketerialLayoutDriver](x: Self) {
      
      inline def setClickOnPrimaryButton(value: () => Unit): Self = StObject.set(x, "clickOnPrimaryButton", js.Any.fromFunction0(value))
      
      inline def setClickOnSecondaryButton(value: () => Unit): Self = StObject.set(x, "clickOnSecondaryButton", js.Any.fromFunction0(value))
      
      inline def setCloseMessageBox(value: () => Unit): Self = StObject.set(x, "closeMessageBox", js.Any.fromFunction0(value))
      
      inline def setGetContentBySelector(value: String => HTMLElement | Null): Self = StObject.set(x, "getContentBySelector", js.Any.fromFunction1(value))
      
      inline def setGetHeaderCloseButton(value: () => HTMLButtonElement): Self = StObject.set(x, "getHeaderCloseButton", js.Any.fromFunction0(value))
      
      inline def setGetImageSrc(value: () => String): Self = StObject.set(x, "getImageSrc", js.Any.fromFunction0(value))
      
      inline def setGetPrimaryButton(value: () => HTMLButtonElement): Self = StObject.set(x, "getPrimaryButton", js.Any.fromFunction0(value))
      
      inline def setGetPrimaryButtonNode(value: () => HTMLElement | Null): Self = StObject.set(x, "getPrimaryButtonNode", js.Any.fromFunction0(value))
      
      inline def setGetPrimaryButtonText(value: () => String): Self = StObject.set(x, "getPrimaryButtonText", js.Any.fromFunction0(value))
      
      inline def setGetSecondaryButton(value: () => HTMLElement): Self = StObject.set(x, "getSecondaryButton", js.Any.fromFunction0(value))
      
      inline def setGetSecondaryButtonText(value: () => String): Self = StObject.set(x, "getSecondaryButtonText", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}

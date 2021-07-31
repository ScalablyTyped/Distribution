package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBoxMarketerialLayoutUniDriverMod {
  
  trait MessageBoxMarketerialLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnPrimaryButton(): Unit
    
    def clickOnSecondaryButton(): Unit
    
    def closeMessageBox(): Unit
    
    def getContentBySelector(selector: String): js.Promise[UniDriver[js.Any] | Null]
    
    def getHeaderCloseButton(): js.Promise[UniDriver[js.Any] | Null]
    
    def getImageSrc(): js.Promise[String | Null]
    
    def getPrimaryButton(): js.Promise[UniDriver[js.Any] | Null]
    
    def getPrimaryButtonNode(): js.Promise[UniDriver[js.Any] | Null]
    
    def getPrimaryButtonText(): js.Promise[String]
    
    def getSecondaryButton(): js.Promise[UniDriver[js.Any] | Null]
    
    def getSecondaryButtonText(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object MessageBoxMarketerialLayoutUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickOnPrimaryButton: () => Unit,
      clickOnSecondaryButton: () => Unit,
      closeMessageBox: () => Unit,
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContentBySelector: String => js.Promise[UniDriver[js.Any] | Null],
      getHeaderCloseButton: () => js.Promise[UniDriver[js.Any] | Null],
      getImageSrc: () => js.Promise[String | Null],
      getPrimaryButton: () => js.Promise[UniDriver[js.Any] | Null],
      getPrimaryButtonNode: () => js.Promise[UniDriver[js.Any] | Null],
      getPrimaryButtonText: () => js.Promise[String],
      getSecondaryButton: () => js.Promise[UniDriver[js.Any] | Null],
      getSecondaryButtonText: () => js.Promise[String],
      getTitle: () => js.Promise[String]
    ): MessageBoxMarketerialLayoutUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnPrimaryButton = js.Any.fromFunction0(clickOnPrimaryButton), clickOnSecondaryButton = js.Any.fromFunction0(clickOnSecondaryButton), closeMessageBox = js.Any.fromFunction0(closeMessageBox), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContentBySelector = js.Any.fromFunction1(getContentBySelector), getHeaderCloseButton = js.Any.fromFunction0(getHeaderCloseButton), getImageSrc = js.Any.fromFunction0(getImageSrc), getPrimaryButton = js.Any.fromFunction0(getPrimaryButton), getPrimaryButtonNode = js.Any.fromFunction0(getPrimaryButtonNode), getPrimaryButtonText = js.Any.fromFunction0(getPrimaryButtonText), getSecondaryButton = js.Any.fromFunction0(getSecondaryButton), getSecondaryButtonText = js.Any.fromFunction0(getSecondaryButtonText), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[MessageBoxMarketerialLayoutUniDriver]
    }
    
    @scala.inline
    implicit class MessageBoxMarketerialLayoutUniDriverMutableBuilder[Self <: MessageBoxMarketerialLayoutUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickOnPrimaryButton(value: () => Unit): Self = StObject.set(x, "clickOnPrimaryButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnSecondaryButton(value: () => Unit): Self = StObject.set(x, "clickOnSecondaryButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseMessageBox(value: () => Unit): Self = StObject.set(x, "closeMessageBox", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentBySelector(value: String => js.Promise[UniDriver[js.Any] | Null]): Self = StObject.set(x, "getContentBySelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHeaderCloseButton(value: () => js.Promise[UniDriver[js.Any] | Null]): Self = StObject.set(x, "getHeaderCloseButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetImageSrc(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getImageSrc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrimaryButton(value: () => js.Promise[UniDriver[js.Any] | Null]): Self = StObject.set(x, "getPrimaryButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrimaryButtonNode(value: () => js.Promise[UniDriver[js.Any] | Null]): Self = StObject.set(x, "getPrimaryButtonNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrimaryButtonText(value: () => js.Promise[String]): Self = StObject.set(x, "getPrimaryButtonText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSecondaryButton(value: () => js.Promise[UniDriver[js.Any] | Null]): Self = StObject.set(x, "getSecondaryButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSecondaryButtonText(value: () => js.Promise[String]): Self = StObject.set(x, "getSecondaryButtonText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}

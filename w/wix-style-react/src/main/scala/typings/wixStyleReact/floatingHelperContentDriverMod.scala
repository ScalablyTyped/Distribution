package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingHelperContentDriverMod {
  
  trait FloatingHelperContentDriver
    extends StObject
       with BaseDriver {
    
    def clickActionButton(): Unit
    
    def getActionButtonText(): String
    
    def getBodyContent(): String
    
    def getFooter(): HTMLElement
    
    def getImage(): HTMLElement
    
    def getTitleContent(): String
    
    def hasActionButton(): Boolean
    
    def hasBody(): Boolean
    
    def hasFooter(): Boolean
    
    def hasImage(): Boolean
    
    def hasTitle(): Boolean
    
    def matchesActionButtonClassName(className: String): Boolean
  }
  object FloatingHelperContentDriver {
    
    @scala.inline
    def apply(
      clickActionButton: () => Unit,
      exists: () => Boolean,
      getActionButtonText: () => String,
      getBodyContent: () => String,
      getFooter: () => HTMLElement,
      getImage: () => HTMLElement,
      getTitleContent: () => String,
      hasActionButton: () => Boolean,
      hasBody: () => Boolean,
      hasFooter: () => Boolean,
      hasImage: () => Boolean,
      hasTitle: () => Boolean,
      matchesActionButtonClassName: String => Boolean
    ): FloatingHelperContentDriver = {
      val __obj = js.Dynamic.literal(clickActionButton = js.Any.fromFunction0(clickActionButton), exists = js.Any.fromFunction0(exists), getActionButtonText = js.Any.fromFunction0(getActionButtonText), getBodyContent = js.Any.fromFunction0(getBodyContent), getFooter = js.Any.fromFunction0(getFooter), getImage = js.Any.fromFunction0(getImage), getTitleContent = js.Any.fromFunction0(getTitleContent), hasActionButton = js.Any.fromFunction0(hasActionButton), hasBody = js.Any.fromFunction0(hasBody), hasFooter = js.Any.fromFunction0(hasFooter), hasImage = js.Any.fromFunction0(hasImage), hasTitle = js.Any.fromFunction0(hasTitle), matchesActionButtonClassName = js.Any.fromFunction1(matchesActionButtonClassName))
      __obj.asInstanceOf[FloatingHelperContentDriver]
    }
    
    @scala.inline
    implicit class FloatingHelperContentDriverMutableBuilder[Self <: FloatingHelperContentDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickActionButton(value: () => Unit): Self = StObject.set(x, "clickActionButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActionButtonText(value: () => String): Self = StObject.set(x, "getActionButtonText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBodyContent(value: () => String): Self = StObject.set(x, "getBodyContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFooter(value: () => HTMLElement): Self = StObject.set(x, "getFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetImage(value: () => HTMLElement): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleContent(value: () => String): Self = StObject.set(x, "getTitleContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasActionButton(value: () => Boolean): Self = StObject.set(x, "hasActionButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasBody(value: () => Boolean): Self = StObject.set(x, "hasBody", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasFooter(value: () => Boolean): Self = StObject.set(x, "hasFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasImage(value: () => Boolean): Self = StObject.set(x, "hasImage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasTitle(value: () => Boolean): Self = StObject.set(x, "hasTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMatchesActionButtonClassName(value: String => Boolean): Self = StObject.set(x, "matchesActionButtonClassName", js.Any.fromFunction1(value))
    }
  }
}

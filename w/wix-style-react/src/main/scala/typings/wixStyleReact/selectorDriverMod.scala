package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.textDriverMod.TextDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorDriverMod {
  
  trait SelectorDriver
    extends StObject
       with BaseDriver {
    
    def getExtraNode(): HTMLElement
    
    def getImage(): HTMLElement
    
    def hasExtraNode(): Boolean
    
    def hasImage(): Boolean
    
    def isChecked(): Boolean
    
    def isDisabled(): Boolean
    
    def isImageCinema(): Boolean
    
    def isImageCircle(): Boolean
    
    def isImageLarge(): Boolean
    
    def isImagePortrait(): Boolean
    
    def isImageRectangular(): Boolean
    
    def isImageSmall(): Boolean
    
    def isImageTiny(): Boolean
    
    def subtitleTextDriver(): TextDriver
    
    def titleTextDriver(): TextDriver
    
    def toggle(): Unit
    
    def toggleType(): String
  }
  object SelectorDriver {
    
    @scala.inline
    def apply(
      exists: () => Boolean,
      getExtraNode: () => HTMLElement,
      getImage: () => HTMLElement,
      hasExtraNode: () => Boolean,
      hasImage: () => Boolean,
      isChecked: () => Boolean,
      isDisabled: () => Boolean,
      isImageCinema: () => Boolean,
      isImageCircle: () => Boolean,
      isImageLarge: () => Boolean,
      isImagePortrait: () => Boolean,
      isImageRectangular: () => Boolean,
      isImageSmall: () => Boolean,
      isImageTiny: () => Boolean,
      subtitleTextDriver: () => TextDriver,
      titleTextDriver: () => TextDriver,
      toggle: () => Unit,
      toggleType: () => String
    ): SelectorDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getExtraNode = js.Any.fromFunction0(getExtraNode), getImage = js.Any.fromFunction0(getImage), hasExtraNode = js.Any.fromFunction0(hasExtraNode), hasImage = js.Any.fromFunction0(hasImage), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), isImageCinema = js.Any.fromFunction0(isImageCinema), isImageCircle = js.Any.fromFunction0(isImageCircle), isImageLarge = js.Any.fromFunction0(isImageLarge), isImagePortrait = js.Any.fromFunction0(isImagePortrait), isImageRectangular = js.Any.fromFunction0(isImageRectangular), isImageSmall = js.Any.fromFunction0(isImageSmall), isImageTiny = js.Any.fromFunction0(isImageTiny), subtitleTextDriver = js.Any.fromFunction0(subtitleTextDriver), titleTextDriver = js.Any.fromFunction0(titleTextDriver), toggle = js.Any.fromFunction0(toggle), toggleType = js.Any.fromFunction0(toggleType))
      __obj.asInstanceOf[SelectorDriver]
    }
    
    @scala.inline
    implicit class SelectorDriverMutableBuilder[Self <: SelectorDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetExtraNode(value: () => HTMLElement): Self = StObject.set(x, "getExtraNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetImage(value: () => HTMLElement): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasExtraNode(value: () => Boolean): Self = StObject.set(x, "hasExtraNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasImage(value: () => Boolean): Self = StObject.set(x, "hasImage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageCinema(value: () => Boolean): Self = StObject.set(x, "isImageCinema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageCircle(value: () => Boolean): Self = StObject.set(x, "isImageCircle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageLarge(value: () => Boolean): Self = StObject.set(x, "isImageLarge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImagePortrait(value: () => Boolean): Self = StObject.set(x, "isImagePortrait", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageRectangular(value: () => Boolean): Self = StObject.set(x, "isImageRectangular", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageSmall(value: () => Boolean): Self = StObject.set(x, "isImageSmall", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageTiny(value: () => Boolean): Self = StObject.set(x, "isImageTiny", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtitleTextDriver(value: () => TextDriver): Self = StObject.set(x, "subtitleTextDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleTextDriver(value: () => TextDriver): Self = StObject.set(x, "titleTextDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggleType(value: () => String): Self = StObject.set(x, "toggleType", js.Any.fromFunction0(value))
    }
  }
}

package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesTextTextDotuniDotdriverMod.TextUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorSelectorDotuniDotdriverMod {
  
  trait SelectorUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getExtraNode(): js.Promise[HTMLElement]
    
    def getImage(): js.Promise[HTMLElement]
    
    def hasExtraNode(): js.Promise[Boolean]
    
    def hasImage(): js.Promise[Boolean]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isImageCinema(): js.Promise[Boolean]
    
    def isImageCircle(): js.Promise[Boolean]
    
    def isImageLarge(): js.Promise[Boolean]
    
    def isImagePortrait(): js.Promise[Boolean]
    
    def isImageRectangular(): js.Promise[Boolean]
    
    def isImageSmall(): js.Promise[Boolean]
    
    def isImageTiny(): js.Promise[Boolean]
    
    def isIndeterminate(): js.Promise[Boolean]
    
    def subtitleTextDriver(): TextUniDriver
    
    def titleTextDriver(): TextUniDriver
    
    def toggle(): js.Promise[Unit]
    
    def toggleType(): js.Promise[String]
  }
  object SelectorUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getExtraNode: () => js.Promise[HTMLElement],
      getImage: () => js.Promise[HTMLElement],
      hasExtraNode: () => js.Promise[Boolean],
      hasImage: () => js.Promise[Boolean],
      isChecked: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      isImageCinema: () => js.Promise[Boolean],
      isImageCircle: () => js.Promise[Boolean],
      isImageLarge: () => js.Promise[Boolean],
      isImagePortrait: () => js.Promise[Boolean],
      isImageRectangular: () => js.Promise[Boolean],
      isImageSmall: () => js.Promise[Boolean],
      isImageTiny: () => js.Promise[Boolean],
      isIndeterminate: () => js.Promise[Boolean],
      subtitleTextDriver: () => TextUniDriver,
      titleTextDriver: () => TextUniDriver,
      toggle: () => js.Promise[Unit],
      toggleType: () => js.Promise[String]
    ): SelectorUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getExtraNode = js.Any.fromFunction0(getExtraNode), getImage = js.Any.fromFunction0(getImage), hasExtraNode = js.Any.fromFunction0(hasExtraNode), hasImage = js.Any.fromFunction0(hasImage), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), isImageCinema = js.Any.fromFunction0(isImageCinema), isImageCircle = js.Any.fromFunction0(isImageCircle), isImageLarge = js.Any.fromFunction0(isImageLarge), isImagePortrait = js.Any.fromFunction0(isImagePortrait), isImageRectangular = js.Any.fromFunction0(isImageRectangular), isImageSmall = js.Any.fromFunction0(isImageSmall), isImageTiny = js.Any.fromFunction0(isImageTiny), isIndeterminate = js.Any.fromFunction0(isIndeterminate), subtitleTextDriver = js.Any.fromFunction0(subtitleTextDriver), titleTextDriver = js.Any.fromFunction0(titleTextDriver), toggle = js.Any.fromFunction0(toggle), toggleType = js.Any.fromFunction0(toggleType))
      __obj.asInstanceOf[SelectorUniDriver]
    }
    
    extension [Self <: SelectorUniDriver](x: Self) {
      
      inline def setGetExtraNode(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getExtraNode", js.Any.fromFunction0(value))
      
      inline def setGetImage(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
      
      inline def setHasExtraNode(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasExtraNode", js.Any.fromFunction0(value))
      
      inline def setHasImage(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasImage", js.Any.fromFunction0(value))
      
      inline def setIsChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsImageCinema(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageCinema", js.Any.fromFunction0(value))
      
      inline def setIsImageCircle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageCircle", js.Any.fromFunction0(value))
      
      inline def setIsImageLarge(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageLarge", js.Any.fromFunction0(value))
      
      inline def setIsImagePortrait(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImagePortrait", js.Any.fromFunction0(value))
      
      inline def setIsImageRectangular(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageRectangular", js.Any.fromFunction0(value))
      
      inline def setIsImageSmall(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageSmall", js.Any.fromFunction0(value))
      
      inline def setIsImageTiny(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageTiny", js.Any.fromFunction0(value))
      
      inline def setIsIndeterminate(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isIndeterminate", js.Any.fromFunction0(value))
      
      inline def setSubtitleTextDriver(value: () => TextUniDriver): Self = StObject.set(x, "subtitleTextDriver", js.Any.fromFunction0(value))
      
      inline def setTitleTextDriver(value: () => TextUniDriver): Self = StObject.set(x, "titleTextDriver", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => js.Promise[Unit]): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      inline def setToggleType(value: () => js.Promise[String]): Self = StObject.set(x, "toggleType", js.Any.fromFunction0(value))
    }
  }
}

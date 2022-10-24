package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriverList
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselCarouselDotuniDotdriverMod {
  
  trait CarouselUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickNext(): js.Promise[Unit]
    
    def clickPrevious(): js.Promise[Unit]
    
    def getChildren(): UniDriverList[Any]
    
    def getImages(): js.Array[js.Promise[String | Null]]
    
    def isLoading(): js.Promise[Boolean]
  }
  object CarouselUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickNext: () => js.Promise[Unit],
      clickPrevious: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getChildren: () => UniDriverList[Any],
      getImages: () => js.Array[js.Promise[String | Null]],
      isLoading: () => js.Promise[Boolean]
    ): CarouselUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickNext = js.Any.fromFunction0(clickNext), clickPrevious = js.Any.fromFunction0(clickPrevious), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getImages = js.Any.fromFunction0(getImages), isLoading = js.Any.fromFunction0(isLoading))
      __obj.asInstanceOf[CarouselUniDriver]
    }
    
    extension [Self <: CarouselUniDriver](x: Self) {
      
      inline def setClickNext(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickNext", js.Any.fromFunction0(value))
      
      inline def setClickPrevious(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickPrevious", js.Any.fromFunction0(value))
      
      inline def setGetChildren(value: () => UniDriverList[Any]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetImages(value: () => js.Array[js.Promise[String | Null]]): Self = StObject.set(x, "getImages", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    }
  }
}

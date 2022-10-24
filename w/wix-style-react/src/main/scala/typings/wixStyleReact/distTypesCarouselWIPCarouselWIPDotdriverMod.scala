package typings.wixStyleReact

import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselWIPCarouselWIPDotdriverMod {
  
  trait CarouselWIPDriver
    extends StObject
       with BaseDriver {
    
    def clickNext(): js.Promise[Unit]
    
    def clickPrevious(): js.Promise[Unit]
    
    def getChildren(): NodeListOf[HTMLElement]
    
    def getImages(): js.Array[String]
    
    def isLoading(): Boolean
  }
  object CarouselWIPDriver {
    
    inline def apply(
      clickNext: () => js.Promise[Unit],
      clickPrevious: () => js.Promise[Unit],
      exists: () => Boolean,
      getChildren: () => NodeListOf[HTMLElement],
      getImages: () => js.Array[String],
      isLoading: () => Boolean
    ): CarouselWIPDriver = {
      val __obj = js.Dynamic.literal(clickNext = js.Any.fromFunction0(clickNext), clickPrevious = js.Any.fromFunction0(clickPrevious), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getImages = js.Any.fromFunction0(getImages), isLoading = js.Any.fromFunction0(isLoading))
      __obj.asInstanceOf[CarouselWIPDriver]
    }
    
    extension [Self <: CarouselWIPDriver](x: Self) {
      
      inline def setClickNext(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickNext", js.Any.fromFunction0(value))
      
      inline def setClickPrevious(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickPrevious", js.Any.fromFunction0(value))
      
      inline def setGetChildren(value: () => NodeListOf[HTMLElement]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetImages(value: () => js.Array[String]): Self = StObject.set(x, "getImages", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    }
  }
}

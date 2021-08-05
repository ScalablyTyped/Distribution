package typings.wixStyleReact

import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselDriverMod {
  
  trait CarouselDriver
    extends StObject
       with BaseDriver {
    
    def getChildren(): NodeListOf[HTMLElement]
    
    def getImages(): js.Array[String]
    
    def isLoading(): Boolean
  }
  object CarouselDriver {
    
    inline def apply(
      exists: () => Boolean,
      getChildren: () => NodeListOf[HTMLElement],
      getImages: () => js.Array[String],
      isLoading: () => Boolean
    ): CarouselDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getImages = js.Any.fromFunction0(getImages), isLoading = js.Any.fromFunction0(isLoading))
      __obj.asInstanceOf[CarouselDriver]
    }
    
    extension [Self <: CarouselDriver](x: Self) {
      
      inline def setGetChildren(value: () => NodeListOf[HTMLElement]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetImages(value: () => js.Array[String]): Self = StObject.set(x, "getImages", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    }
  }
}

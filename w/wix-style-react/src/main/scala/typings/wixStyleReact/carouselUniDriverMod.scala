package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriverList
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselUniDriverMod {
  
  trait CarouselUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getChildren(): UniDriverList[js.Any]
    
    def getImages(): js.Array[js.Promise[String | Null]]
    
    def isLoading(): js.Promise[Boolean]
  }
  object CarouselUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getChildren: () => UniDriverList[js.Any],
      getImages: () => js.Array[js.Promise[String | Null]],
      isLoading: () => js.Promise[Boolean]
    ): CarouselUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), getImages = js.Any.fromFunction0(getImages), isLoading = js.Any.fromFunction0(isLoading))
      __obj.asInstanceOf[CarouselUniDriver]
    }
    
    extension [Self <: CarouselUniDriver](x: Self) {
      
      inline def setGetChildren(value: () => UniDriverList[js.Any]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetImages(value: () => js.Array[js.Promise[String | Null]]): Self = StObject.set(x, "getImages", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    }
  }
}

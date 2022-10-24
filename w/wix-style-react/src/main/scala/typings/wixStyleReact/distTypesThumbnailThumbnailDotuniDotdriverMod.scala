package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThumbnailThumbnailDotuniDotdriverMod {
  
  trait ThumbnailUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getBackgroundImage(): UniDriver[Any]
    
    def getDescription(): js.Promise[String]
    
    def getHeight(): js.Promise[String]
    
    def getImage(): UniDriver[Any]
    
    def getSelectedIcon(): UniDriver[Any]
    
    def getTitle(): js.Promise[String]
    
    def getWidth(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isSelected(): js.Promise[Boolean]
  }
  object ThumbnailUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getBackgroundImage: () => UniDriver[Any],
      getDescription: () => js.Promise[String],
      getHeight: () => js.Promise[String],
      getImage: () => UniDriver[Any],
      getSelectedIcon: () => UniDriver[Any],
      getTitle: () => js.Promise[String],
      getWidth: () => js.Promise[String],
      isDisabled: () => js.Promise[Boolean],
      isSelected: () => js.Promise[Boolean]
    ): ThumbnailUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getBackgroundImage = js.Any.fromFunction0(getBackgroundImage), getDescription = js.Any.fromFunction0(getDescription), getHeight = js.Any.fromFunction0(getHeight), getImage = js.Any.fromFunction0(getImage), getSelectedIcon = js.Any.fromFunction0(getSelectedIcon), getTitle = js.Any.fromFunction0(getTitle), getWidth = js.Any.fromFunction0(getWidth), isDisabled = js.Any.fromFunction0(isDisabled), isSelected = js.Any.fromFunction0(isSelected))
      __obj.asInstanceOf[ThumbnailUniDriver]
    }
    
    extension [Self <: ThumbnailUniDriver](x: Self) {
      
      inline def setGetBackgroundImage(value: () => UniDriver[Any]): Self = StObject.set(x, "getBackgroundImage", js.Any.fromFunction0(value))
      
      inline def setGetDescription(value: () => js.Promise[String]): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
      
      inline def setGetHeight(value: () => js.Promise[String]): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetImage(value: () => UniDriver[Any]): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
      
      inline def setGetSelectedIcon(value: () => UniDriver[Any]): Self = StObject.set(x, "getSelectedIcon", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => js.Promise[String]): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    }
  }
}

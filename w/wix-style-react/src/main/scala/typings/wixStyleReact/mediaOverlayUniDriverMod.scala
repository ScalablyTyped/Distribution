package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaOverlayUniDriverMod {
  
  trait MediaOverlayUniDriver[T]
    extends StObject
       with BaseUniDriver {
    
    def getHoverSkin(): js.Promise[String | Null]
    
    def getMediaNode(): js.Promise[T]
    
    def getMediaUrl(): js.Promise[String | Null]
    
    def getSkin(): js.Promise[String | Null]
    
    def hover(): js.Promise[Unit]
  }
  object MediaOverlayUniDriver {
    
    inline def apply[T](
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getHoverSkin: () => js.Promise[String | Null],
      getMediaNode: () => js.Promise[T],
      getMediaUrl: () => js.Promise[String | Null],
      getSkin: () => js.Promise[String | Null],
      hover: () => js.Promise[Unit]
    ): MediaOverlayUniDriver[T] = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getHoverSkin = js.Any.fromFunction0(getHoverSkin), getMediaNode = js.Any.fromFunction0(getMediaNode), getMediaUrl = js.Any.fromFunction0(getMediaUrl), getSkin = js.Any.fromFunction0(getSkin), hover = js.Any.fromFunction0(hover))
      __obj.asInstanceOf[MediaOverlayUniDriver[T]]
    }
    
    extension [Self <: MediaOverlayUniDriver[?], T](x: Self & MediaOverlayUniDriver[T]) {
      
      inline def setGetHoverSkin(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getHoverSkin", js.Any.fromFunction0(value))
      
      inline def setGetMediaNode(value: () => js.Promise[T]): Self = StObject.set(x, "getMediaNode", js.Any.fromFunction0(value))
      
      inline def setGetMediaUrl(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getMediaUrl", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setHover(value: () => js.Promise[Unit]): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
    }
  }
}

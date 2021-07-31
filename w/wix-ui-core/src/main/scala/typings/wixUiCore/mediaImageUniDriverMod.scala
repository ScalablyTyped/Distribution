package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.imageUniDriverMod.ImageDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaImageUniDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/media-image/media-image.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mediaImageDriverFactory(base: UniDriver[js.Any]): MediaImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaImageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MediaImageDriver]
  
  trait MediaImageDriver
    extends StObject
       with ImageDriver {
    
    def isError(): js.Promise[Boolean]
    
    def isLoaded(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
  }
  object MediaImageDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getAlt: () => js.Promise[String],
      getLoadStatus: () => js.Promise[String],
      getSrc: () => js.Promise[String | Null],
      isError: () => js.Promise[Boolean],
      isLoaded: () => js.Promise[Boolean],
      isLoading: () => js.Promise[Boolean]
    ): MediaImageDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAlt = js.Any.fromFunction0(getAlt), getLoadStatus = js.Any.fromFunction0(getLoadStatus), getSrc = js.Any.fromFunction0(getSrc), isError = js.Any.fromFunction0(isError), isLoaded = js.Any.fromFunction0(isLoaded), isLoading = js.Any.fromFunction0(isLoading))
      __obj.asInstanceOf[MediaImageDriver]
    }
    
    @scala.inline
    implicit class MediaImageDriverMutableBuilder[Self <: MediaImageDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsError(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLoaded(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLoading(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    }
  }
}

package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageUniDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/image/image.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def imageDriverFactory(base: UniDriver[js.Any]): ImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ImageDriver]
  
  trait ImageDriver
    extends StObject
       with BaseUniDriver {
    
    def getAlt(): js.Promise[String]
    
    def getLoadStatus(): js.Promise[String]
    
    def getSrc(): js.Promise[String | Null]
  }
  object ImageDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getAlt: () => js.Promise[String],
      getLoadStatus: () => js.Promise[String],
      getSrc: () => js.Promise[String | Null]
    ): ImageDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAlt = js.Any.fromFunction0(getAlt), getLoadStatus = js.Any.fromFunction0(getLoadStatus), getSrc = js.Any.fromFunction0(getSrc))
      __obj.asInstanceOf[ImageDriver]
    }
    
    @scala.inline
    implicit class ImageDriverMutableBuilder[Self <: ImageDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAlt(value: () => js.Promise[String]): Self = StObject.set(x, "getAlt", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLoadStatus(value: () => js.Promise[String]): Self = StObject.set(x, "getLoadStatus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSrc(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getSrc", js.Any.fromFunction0(value))
    }
  }
}

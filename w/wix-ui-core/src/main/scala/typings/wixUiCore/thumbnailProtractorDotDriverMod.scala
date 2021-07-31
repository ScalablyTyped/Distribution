package typings.wixUiCore

import typings.protractor.mod.ElementFinder
import typings.wixUiCore.commonBaseDriverProtractorMod.BaseDriver
import typings.wixUiCore.commonBaseDriverProtractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbnailProtractorDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/thumbnail/Thumbnail.protractor.driver", "thumbnailDriverFactory")
  @js.native
  val thumbnailDriverFactory: DriverFactory[ThumbnailDriver] = js.native
  
  trait ThumbnailDriver
    extends StObject
       with BaseDriver {
    
    def click(): js.Promise[Unit]
    
    def mouseEnter(): js.Promise[Unit]
  }
  object ThumbnailDriver {
    
    @scala.inline
    def apply(click: () => js.Promise[Unit], element: () => ElementFinder, mouseEnter: () => js.Promise[Unit]): ThumbnailDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), mouseEnter = js.Any.fromFunction0(mouseEnter))
      __obj.asInstanceOf[ThumbnailDriver]
    }
    
    @scala.inline
    implicit class ThumbnailDriverMutableBuilder[Self <: ThumbnailDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMouseEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    }
  }
}

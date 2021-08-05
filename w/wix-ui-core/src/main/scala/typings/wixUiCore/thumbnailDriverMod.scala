package typings.wixUiCore

import typings.std.HTMLElement
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbnailDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/thumbnail/Thumbnail.driver", "thumbnailDriverFactory")
  @js.native
  val thumbnailDriverFactory: DriverFactory[ThumbnailDriver] = js.native
  
  trait ThumbnailDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getContent(): HTMLElement
    
    def getSelectedIcon(): HTMLElement
    
    def hasSelectedIcon(): Boolean
    
    def isDisabled(): Boolean
    
    def isSelected(): Boolean
  }
  object ThumbnailDriver {
    
    inline def apply(
      click: () => Unit,
      exists: () => Boolean,
      getContent: () => HTMLElement,
      getSelectedIcon: () => HTMLElement,
      hasSelectedIcon: () => Boolean,
      isDisabled: () => Boolean,
      isSelected: () => Boolean
    ): ThumbnailDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getSelectedIcon = js.Any.fromFunction0(getSelectedIcon), hasSelectedIcon = js.Any.fromFunction0(hasSelectedIcon), isDisabled = js.Any.fromFunction0(isDisabled), isSelected = js.Any.fromFunction0(isSelected))
      __obj.asInstanceOf[ThumbnailDriver]
    }
    
    extension [Self <: ThumbnailDriver](x: Self) {
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setGetContent(value: () => HTMLElement): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetSelectedIcon(value: () => HTMLElement): Self = StObject.set(x, "getSelectedIcon", js.Any.fromFunction0(value))
      
      inline def setHasSelectedIcon(value: () => Boolean): Self = StObject.set(x, "hasSelectedIcon", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsSelected(value: () => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    }
  }
}

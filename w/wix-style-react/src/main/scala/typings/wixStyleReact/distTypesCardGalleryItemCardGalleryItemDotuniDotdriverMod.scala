package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardGalleryItemCardGalleryItemDotuniDotdriverMod {
  
  trait CardGalleryItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnPrimaryAction(): js.Promise[Unit]
    
    def clickOnSecondaryAction(): js.Promise[Unit]
    
    def getBackgroundImageNode(): js.Promise[Any]
    
    def getBackgroundImageUrl(): js.Promise[String | Null]
    
    def getBadge(): js.Promise[Any]
    
    def getPrimaryActionLabel(): js.Promise[String]
    
    def getSecondaryActionLabel(): js.Promise[String]
    
    def getSettingsMenu(): js.Promise[Any]
    
    def getSubtitle(): js.Promise[String | Null]
    
    def getTitle(): js.Promise[String | Null]
    
    def hover(): js.Promise[Unit]
    
    def isPrimaryActionDisabled(): js.Promise[Boolean]
  }
  object CardGalleryItemUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickOnPrimaryAction: () => js.Promise[Unit],
      clickOnSecondaryAction: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getBackgroundImageNode: () => js.Promise[Any],
      getBackgroundImageUrl: () => js.Promise[String | Null],
      getBadge: () => js.Promise[Any],
      getPrimaryActionLabel: () => js.Promise[String],
      getSecondaryActionLabel: () => js.Promise[String],
      getSettingsMenu: () => js.Promise[Any],
      getSubtitle: () => js.Promise[String | Null],
      getTitle: () => js.Promise[String | Null],
      hover: () => js.Promise[Unit],
      isPrimaryActionDisabled: () => js.Promise[Boolean]
    ): CardGalleryItemUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnPrimaryAction = js.Any.fromFunction0(clickOnPrimaryAction), clickOnSecondaryAction = js.Any.fromFunction0(clickOnSecondaryAction), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getBackgroundImageNode = js.Any.fromFunction0(getBackgroundImageNode), getBackgroundImageUrl = js.Any.fromFunction0(getBackgroundImageUrl), getBadge = js.Any.fromFunction0(getBadge), getPrimaryActionLabel = js.Any.fromFunction0(getPrimaryActionLabel), getSecondaryActionLabel = js.Any.fromFunction0(getSecondaryActionLabel), getSettingsMenu = js.Any.fromFunction0(getSettingsMenu), getSubtitle = js.Any.fromFunction0(getSubtitle), getTitle = js.Any.fromFunction0(getTitle), hover = js.Any.fromFunction0(hover), isPrimaryActionDisabled = js.Any.fromFunction0(isPrimaryActionDisabled))
      __obj.asInstanceOf[CardGalleryItemUniDriver]
    }
    
    extension [Self <: CardGalleryItemUniDriver](x: Self) {
      
      inline def setClickOnPrimaryAction(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnPrimaryAction", js.Any.fromFunction0(value))
      
      inline def setClickOnSecondaryAction(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnSecondaryAction", js.Any.fromFunction0(value))
      
      inline def setGetBackgroundImageNode(value: () => js.Promise[Any]): Self = StObject.set(x, "getBackgroundImageNode", js.Any.fromFunction0(value))
      
      inline def setGetBackgroundImageUrl(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getBackgroundImageUrl", js.Any.fromFunction0(value))
      
      inline def setGetBadge(value: () => js.Promise[Any]): Self = StObject.set(x, "getBadge", js.Any.fromFunction0(value))
      
      inline def setGetPrimaryActionLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getPrimaryActionLabel", js.Any.fromFunction0(value))
      
      inline def setGetSecondaryActionLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getSecondaryActionLabel", js.Any.fromFunction0(value))
      
      inline def setGetSettingsMenu(value: () => js.Promise[Any]): Self = StObject.set(x, "getSettingsMenu", js.Any.fromFunction0(value))
      
      inline def setGetSubtitle(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getSubtitle", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setHover(value: () => js.Promise[Unit]): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
      
      inline def setIsPrimaryActionDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPrimaryActionDisabled", js.Any.fromFunction0(value))
    }
  }
}

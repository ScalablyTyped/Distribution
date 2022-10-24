package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.light
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.neutral
import typings.wixStyleReact.wixStyleReactStrings.none_
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.standard
import typings.wixStyleReact.wixStyleReactStrings.tiny
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAccordionAccordionDotuniDotdriverMod {
  
  trait AccordionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickItemAt(idx: Double): js.Promise[Unit]
    
    def clickToggleButtonAt(idx: Double): js.Promise[Unit]
    
    def getHorizontalPadding(): js.Promise[js.UndefOr[none_ | tiny | small | medium | large]]
    
    def getItemSubtitleAt(idx: Double): js.Promise[String]
    
    def getItemTitleAt(idx: Double): js.Promise[String]
    
    def getSkin(): js.Promise[js.UndefOr[light | standard | neutral]]
    
    def getToggleButtonLabelAt(idx: Double): js.Promise[String]
    
    def getTransitionSpeed(): js.Promise[String]
    
    def isIconExistsAt(idx: Double): js.Promise[Boolean]
    
    def isItemExpandedAt(idx: Double): js.Promise[Boolean]
  }
  object AccordionUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickItemAt: Double => js.Promise[Unit],
      clickToggleButtonAt: Double => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getHorizontalPadding: () => js.Promise[js.UndefOr[none_ | tiny | small | medium | large]],
      getItemSubtitleAt: Double => js.Promise[String],
      getItemTitleAt: Double => js.Promise[String],
      getSkin: () => js.Promise[js.UndefOr[light | standard | neutral]],
      getToggleButtonLabelAt: Double => js.Promise[String],
      getTransitionSpeed: () => js.Promise[String],
      isIconExistsAt: Double => js.Promise[Boolean],
      isItemExpandedAt: Double => js.Promise[Boolean]
    ): AccordionUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickItemAt = js.Any.fromFunction1(clickItemAt), clickToggleButtonAt = js.Any.fromFunction1(clickToggleButtonAt), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getHorizontalPadding = js.Any.fromFunction0(getHorizontalPadding), getItemSubtitleAt = js.Any.fromFunction1(getItemSubtitleAt), getItemTitleAt = js.Any.fromFunction1(getItemTitleAt), getSkin = js.Any.fromFunction0(getSkin), getToggleButtonLabelAt = js.Any.fromFunction1(getToggleButtonLabelAt), getTransitionSpeed = js.Any.fromFunction0(getTransitionSpeed), isIconExistsAt = js.Any.fromFunction1(isIconExistsAt), isItemExpandedAt = js.Any.fromFunction1(isItemExpandedAt))
      __obj.asInstanceOf[AccordionUniDriver]
    }
    
    extension [Self <: AccordionUniDriver](x: Self) {
      
      inline def setClickItemAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickItemAt", js.Any.fromFunction1(value))
      
      inline def setClickToggleButtonAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickToggleButtonAt", js.Any.fromFunction1(value))
      
      inline def setGetHorizontalPadding(value: () => js.Promise[js.UndefOr[none_ | tiny | small | medium | large]]): Self = StObject.set(x, "getHorizontalPadding", js.Any.fromFunction0(value))
      
      inline def setGetItemSubtitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemSubtitleAt", js.Any.fromFunction1(value))
      
      inline def setGetItemTitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemTitleAt", js.Any.fromFunction1(value))
      
      inline def setGetSkin(value: () => js.Promise[js.UndefOr[light | standard | neutral]]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetToggleButtonLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getToggleButtonLabelAt", js.Any.fromFunction1(value))
      
      inline def setGetTransitionSpeed(value: () => js.Promise[String]): Self = StObject.set(x, "getTransitionSpeed", js.Any.fromFunction0(value))
      
      inline def setIsIconExistsAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isIconExistsAt", js.Any.fromFunction1(value))
      
      inline def setIsItemExpandedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isItemExpandedAt", js.Any.fromFunction1(value))
    }
  }
}

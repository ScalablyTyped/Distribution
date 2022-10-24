package typings.wixStyleReact

import typings.wixStyleReact.distTypesBadgeMod.BadgeSize
import typings.wixStyleReact.distTypesBadgeMod.BadgeSkin
import typings.wixStyleReact.distTypesBadgeMod.BadgeType
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectBadgeSelectDotuniDotdriverMod {
  
  trait BadgeSelectUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickAtOption(index: Double): js.Promise[Unit]
    
    def getSize(): js.Promise[BadgeSize]
    
    def getSkin(): js.Promise[BadgeSkin]
    
    def getType(): js.Promise[BadgeType]
    
    def hasClickCursor(): js.Promise[Boolean]
    
    def isUppercase(): js.Promise[Boolean]
    
    def text(): js.Promise[String]
  }
  object BadgeSelectUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickAtOption: Double => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSize: () => js.Promise[BadgeSize],
      getSkin: () => js.Promise[BadgeSkin],
      getType: () => js.Promise[BadgeType],
      hasClickCursor: () => js.Promise[Boolean],
      isUppercase: () => js.Promise[Boolean],
      text: () => js.Promise[String]
    ): BadgeSelectUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickAtOption = js.Any.fromFunction1(clickAtOption), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin), getType = js.Any.fromFunction0(getType), hasClickCursor = js.Any.fromFunction0(hasClickCursor), isUppercase = js.Any.fromFunction0(isUppercase), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[BadgeSelectUniDriver]
    }
    
    extension [Self <: BadgeSelectUniDriver](x: Self) {
      
      inline def setClickAtOption(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
      
      inline def setGetSize(value: () => js.Promise[BadgeSize]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[BadgeSkin]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => js.Promise[BadgeType]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setHasClickCursor(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasClickCursor", js.Any.fromFunction0(value))
      
      inline def setIsUppercase(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isUppercase", js.Any.fromFunction0(value))
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}

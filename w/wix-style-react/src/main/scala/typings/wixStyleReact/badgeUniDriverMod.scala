package typings.wixStyleReact

import typings.wixStyleReact.badgeMod.BadgeSize
import typings.wixStyleReact.badgeMod.BadgeSkin
import typings.wixStyleReact.badgeMod.BadgeType
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeUniDriverMod {
  
  trait BadgeUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getContent(): js.Promise[String]
    
    def getSize(): js.Promise[BadgeSize]
    
    def getSkin(): js.Promise[BadgeSkin]
    
    def getType(): js.Promise[BadgeType]
    
    def hasClickCursor(): js.Promise[Boolean]
    
    def isUppercase(): js.Promise[Boolean]
    
    def text(): js.Promise[String]
  }
  object BadgeUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContent: () => js.Promise[String],
      getSize: () => js.Promise[BadgeSize],
      getSkin: () => js.Promise[BadgeSkin],
      getType: () => js.Promise[BadgeType],
      hasClickCursor: () => js.Promise[Boolean],
      isUppercase: () => js.Promise[Boolean],
      text: () => js.Promise[String]
    ): BadgeUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContent = js.Any.fromFunction0(getContent), getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin), getType = js.Any.fromFunction0(getType), hasClickCursor = js.Any.fromFunction0(hasClickCursor), isUppercase = js.Any.fromFunction0(isUppercase), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[BadgeUniDriver]
    }
    
    extension [Self <: BadgeUniDriver](x: Self) {
      
      inline def setGetContent(value: () => js.Promise[String]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => js.Promise[BadgeSize]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[BadgeSkin]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => js.Promise[BadgeType]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setHasClickCursor(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasClickCursor", js.Any.fromFunction0(value))
      
      inline def setIsUppercase(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isUppercase", js.Any.fromFunction0(value))
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}

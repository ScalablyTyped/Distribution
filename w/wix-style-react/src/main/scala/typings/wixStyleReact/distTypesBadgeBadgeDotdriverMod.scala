package typings.wixStyleReact

import typings.wixStyleReact.distTypesBadgeMod.BadgeSize
import typings.wixStyleReact.distTypesBadgeMod.BadgeSkin
import typings.wixStyleReact.distTypesBadgeMod.BadgeType
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeBadgeDotdriverMod {
  
  trait BadgeDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getSize(): BadgeSize
    
    def getSkin(): BadgeSkin
    
    def getType(): BadgeType
    
    def hasClickCursor(): Boolean
    
    def isUppercase(): Boolean
    
    def text(): String
  }
  object BadgeDriver {
    
    inline def apply(
      click: () => Unit,
      exists: () => Boolean,
      getSize: () => BadgeSize,
      getSkin: () => BadgeSkin,
      getType: () => BadgeType,
      hasClickCursor: () => Boolean,
      isUppercase: () => Boolean,
      text: () => String
    ): BadgeDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin), getType = js.Any.fromFunction0(getType), hasClickCursor = js.Any.fromFunction0(hasClickCursor), isUppercase = js.Any.fromFunction0(isUppercase), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[BadgeDriver]
    }
    
    extension [Self <: BadgeDriver](x: Self) {
      
      inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => BadgeSize): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => BadgeSkin): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => BadgeType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setHasClickCursor(value: () => Boolean): Self = StObject.set(x, "hasClickCursor", js.Any.fromFunction0(value))
      
      inline def setIsUppercase(value: () => Boolean): Self = StObject.set(x, "isUppercase", js.Any.fromFunction0(value))
      
      inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}

package typings.wixStyleReact

import typings.wixStyleReact.distTypesTextMod.TextSize
import typings.wixStyleReact.distTypesTextMod.TextSkin
import typings.wixStyleReact.distTypesTextMod.TextWeight
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextTextDotdriverMod {
  
  trait TextDriver
    extends StObject
       with BaseDriver {
    
    def getId(): String
    
    def getSize(): TextSize
    
    def getSkin(): TextSkin
    
    def getTagName(): String
    
    def getText(): String
    
    def getWeight(): TextWeight
    
    def isLight(): Boolean
    
    def isMasked(): Boolean
    
    def isSecondary(): Boolean
  }
  object TextDriver {
    
    inline def apply(
      exists: () => Boolean,
      getId: () => String,
      getSize: () => TextSize,
      getSkin: () => TextSkin,
      getTagName: () => String,
      getText: () => String,
      getWeight: () => TextWeight,
      isLight: () => Boolean,
      isMasked: () => Boolean,
      isSecondary: () => Boolean
    ): TextDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getId = js.Any.fromFunction0(getId), getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin), getTagName = js.Any.fromFunction0(getTagName), getText = js.Any.fromFunction0(getText), getWeight = js.Any.fromFunction0(getWeight), isLight = js.Any.fromFunction0(isLight), isMasked = js.Any.fromFunction0(isMasked), isSecondary = js.Any.fromFunction0(isSecondary))
      __obj.asInstanceOf[TextDriver]
    }
    
    extension [Self <: TextDriver](x: Self) {
      
      inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => TextSize): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => TextSkin): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetTagName(value: () => String): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setGetWeight(value: () => TextWeight): Self = StObject.set(x, "getWeight", js.Any.fromFunction0(value))
      
      inline def setIsLight(value: () => Boolean): Self = StObject.set(x, "isLight", js.Any.fromFunction0(value))
      
      inline def setIsMasked(value: () => Boolean): Self = StObject.set(x, "isMasked", js.Any.fromFunction0(value))
      
      inline def setIsSecondary(value: () => Boolean): Self = StObject.set(x, "isSecondary", js.Any.fromFunction0(value))
    }
  }
}

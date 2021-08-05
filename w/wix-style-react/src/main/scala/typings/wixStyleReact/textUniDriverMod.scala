package typings.wixStyleReact

import typings.wixStyleReact.textMod.TextSize
import typings.wixStyleReact.textMod.TextSkin
import typings.wixStyleReact.textMod.TextWeight
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textUniDriverMod {
  
  trait TextUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSize(): js.Promise[TextSize]
    
    def getSkin(): js.Promise[TextSkin]
    
    def getTagName(): js.Promise[String]
    
    def getText(): js.Promise[String]
    
    def getWeight(): js.Promise[TextWeight]
    
    def isLight(): js.Promise[Boolean]
    
    def isSecondary(): js.Promise[Boolean]
  }
  object TextUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getSize: () => js.Promise[TextSize],
      getSkin: () => js.Promise[TextSkin],
      getTagName: () => js.Promise[String],
      getText: () => js.Promise[String],
      getWeight: () => js.Promise[TextWeight],
      isLight: () => js.Promise[Boolean],
      isSecondary: () => js.Promise[Boolean]
    ): TextUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSize = js.Any.fromFunction0(getSize), getSkin = js.Any.fromFunction0(getSkin), getTagName = js.Any.fromFunction0(getTagName), getText = js.Any.fromFunction0(getText), getWeight = js.Any.fromFunction0(getWeight), isLight = js.Any.fromFunction0(isLight), isSecondary = js.Any.fromFunction0(isSecondary))
      __obj.asInstanceOf[TextUniDriver]
    }
    
    extension [Self <: TextUniDriver](x: Self) {
      
      inline def setGetSize(value: () => js.Promise[TextSize]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[TextSkin]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetTagName(value: () => js.Promise[String]): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setGetWeight(value: () => js.Promise[TextWeight]): Self = StObject.set(x, "getWeight", js.Any.fromFunction0(value))
      
      inline def setIsLight(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLight", js.Any.fromFunction0(value))
      
      inline def setIsSecondary(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSecondary", js.Any.fromFunction0(value))
    }
  }
}

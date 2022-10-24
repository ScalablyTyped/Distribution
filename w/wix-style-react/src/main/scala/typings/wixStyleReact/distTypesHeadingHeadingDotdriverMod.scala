package typings.wixStyleReact

import typings.wixStyleReact.distTypesHeadingMod.HeadingAppearance
import typings.wixStyleReact.distTypesHeadingMod.Size
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeadingHeadingDotdriverMod {
  
  trait HeadingDriver
    extends StObject
       with BaseDriver {
    
    def getAppearance(): HeadingAppearance | Null
    
    def getSize(): Size | Null
    
    def getTagName(): /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wixStyleReact.wixStyleReactStrings.a, typings.wixStyleReact.wixStyleReactStrings.abbr, typings.wixStyleReact.wixStyleReactStrings.address */ Any
    
    def getText(): String
    
    def isLight(): Boolean
    
    def isMasked(): Boolean
  }
  object HeadingDriver {
    
    inline def apply(
      exists: () => Boolean,
      getAppearance: () => HeadingAppearance | Null,
      getSize: () => Size | Null,
      getTagName: () => /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wixStyleReact.wixStyleReactStrings.a, typings.wixStyleReact.wixStyleReactStrings.abbr, typings.wixStyleReact.wixStyleReactStrings.address */ Any,
      getText: () => String,
      isLight: () => Boolean,
      isMasked: () => Boolean
    ): HeadingDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getAppearance = js.Any.fromFunction0(getAppearance), getSize = js.Any.fromFunction0(getSize), getTagName = js.Any.fromFunction0(getTagName), getText = js.Any.fromFunction0(getText), isLight = js.Any.fromFunction0(isLight), isMasked = js.Any.fromFunction0(isMasked))
      __obj.asInstanceOf[HeadingDriver]
    }
    
    extension [Self <: HeadingDriver](x: Self) {
      
      inline def setGetAppearance(value: () => HeadingAppearance | Null): Self = StObject.set(x, "getAppearance", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => Size | Null): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetTagName(
        value: () => /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wixStyleReact.wixStyleReactStrings.a, typings.wixStyleReact.wixStyleReactStrings.abbr, typings.wixStyleReact.wixStyleReactStrings.address */ Any
      ): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setIsLight(value: () => Boolean): Self = StObject.set(x, "isLight", js.Any.fromFunction0(value))
      
      inline def setIsMasked(value: () => Boolean): Self = StObject.set(x, "isMasked", js.Any.fromFunction0(value))
    }
  }
}

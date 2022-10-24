package typings.wixStyleReact

import typings.wixStyleReact.distTypesHeadingMod.HeadingAppearance
import typings.wixStyleReact.distTypesHeadingMod.Size
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeadingHeadingDotuniDotdriverMod {
  
  trait HeadingUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAppearance(): js.Promise[HeadingAppearance | Null]
    
    def getSize(): js.Promise[Size | Null]
    
    def getTagName(): js.Promise[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wixStyleReact.wixStyleReactStrings.a, typings.wixStyleReact.wixStyleReactStrings.abbr, typings.wixStyleReact.wixStyleReactStrings.address */ Any
      ]
    
    def getText(): js.Promise[String]
    
    def isLight(): js.Promise[Boolean]
    
    def isMasked(): js.Promise[Boolean]
  }
  object HeadingUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getAppearance: () => js.Promise[HeadingAppearance | Null],
      getSize: () => js.Promise[Size | Null],
      getTagName: () => js.Promise[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wixStyleReact.wixStyleReactStrings.a, typings.wixStyleReact.wixStyleReactStrings.abbr, typings.wixStyleReact.wixStyleReactStrings.address */ Any
        ],
      getText: () => js.Promise[String],
      isLight: () => js.Promise[Boolean],
      isMasked: () => js.Promise[Boolean]
    ): HeadingUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAppearance = js.Any.fromFunction0(getAppearance), getSize = js.Any.fromFunction0(getSize), getTagName = js.Any.fromFunction0(getTagName), getText = js.Any.fromFunction0(getText), isLight = js.Any.fromFunction0(isLight), isMasked = js.Any.fromFunction0(isMasked))
      __obj.asInstanceOf[HeadingUniDriver]
    }
    
    extension [Self <: HeadingUniDriver](x: Self) {
      
      inline def setGetAppearance(value: () => js.Promise[HeadingAppearance | Null]): Self = StObject.set(x, "getAppearance", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => js.Promise[Size | Null]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetTagName(
        value: () => js.Promise[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.wixStyleReact.wixStyleReactStrings.a, typings.wixStyleReact.wixStyleReactStrings.abbr, typings.wixStyleReact.wixStyleReactStrings.address */ Any
            ]
      ): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setIsLight(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLight", js.Any.fromFunction0(value))
      
      inline def setIsMasked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMasked", js.Any.fromFunction0(value))
    }
  }
}

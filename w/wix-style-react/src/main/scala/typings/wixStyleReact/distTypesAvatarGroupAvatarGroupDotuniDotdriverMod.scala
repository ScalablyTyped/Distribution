package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarGroupAvatarGroupDotuniDotdriverMod {
  
  trait AvatarGroupUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getMoreIndicatorContent(): js.Promise[String]
    
    def getVisibleAvatarTextContentByIndex(index: Double): js.Promise[String]
    
    def getVisibleAvatarsCount(): js.Promise[Double]
    
    def isMoreIndicatorExist(): js.Promise[Boolean]
  }
  object AvatarGroupUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getMoreIndicatorContent: () => js.Promise[String],
      getVisibleAvatarTextContentByIndex: Double => js.Promise[String],
      getVisibleAvatarsCount: () => js.Promise[Double],
      isMoreIndicatorExist: () => js.Promise[Boolean]
    ): AvatarGroupUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getMoreIndicatorContent = js.Any.fromFunction0(getMoreIndicatorContent), getVisibleAvatarTextContentByIndex = js.Any.fromFunction1(getVisibleAvatarTextContentByIndex), getVisibleAvatarsCount = js.Any.fromFunction0(getVisibleAvatarsCount), isMoreIndicatorExist = js.Any.fromFunction0(isMoreIndicatorExist))
      __obj.asInstanceOf[AvatarGroupUniDriver]
    }
    
    extension [Self <: AvatarGroupUniDriver](x: Self) {
      
      inline def setGetMoreIndicatorContent(value: () => js.Promise[String]): Self = StObject.set(x, "getMoreIndicatorContent", js.Any.fromFunction0(value))
      
      inline def setGetVisibleAvatarTextContentByIndex(value: Double => js.Promise[String]): Self = StObject.set(x, "getVisibleAvatarTextContentByIndex", js.Any.fromFunction1(value))
      
      inline def setGetVisibleAvatarsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getVisibleAvatarsCount", js.Any.fromFunction0(value))
      
      inline def setIsMoreIndicatorExist(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMoreIndicatorExist", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.text
    - typings.wixStyleReact.wixStyleReactStrings.placeholder
    - typings.wixStyleReact.wixStyleReactStrings.image
  */
  trait contentType extends StObject
  object contentType {
    
    inline def image: typings.wixStyleReact.wixStyleReactStrings.image = "image".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.image]
    
    inline def placeholder: typings.wixStyleReact.wixStyleReactStrings.placeholder = "placeholder".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.placeholder]
    
    inline def text: typings.wixStyleReact.wixStyleReactStrings.text = "text".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.text]
  }
}

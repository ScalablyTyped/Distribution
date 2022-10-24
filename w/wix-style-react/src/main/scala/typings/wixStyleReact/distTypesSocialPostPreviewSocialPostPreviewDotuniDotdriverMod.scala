package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactStrings.facebook
import typings.wixStyleReact.wixStyleReactStrings.instagram
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialPostPreviewSocialPostPreviewDotuniDotdriverMod {
  
  trait SocialPostPreviewUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getCaption(): js.Promise[String]
    
    def getProfileImageSrc(): js.Promise[String]
    
    def getProfileName(): js.Promise[String]
    
    def getSkin(): js.Promise[instagram | facebook]
  }
  object SocialPostPreviewUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getCaption: () => js.Promise[String],
      getProfileImageSrc: () => js.Promise[String],
      getProfileName: () => js.Promise[String],
      getSkin: () => js.Promise[instagram | facebook]
    ): SocialPostPreviewUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCaption = js.Any.fromFunction0(getCaption), getProfileImageSrc = js.Any.fromFunction0(getProfileImageSrc), getProfileName = js.Any.fromFunction0(getProfileName), getSkin = js.Any.fromFunction0(getSkin))
      __obj.asInstanceOf[SocialPostPreviewUniDriver]
    }
    
    extension [Self <: SocialPostPreviewUniDriver](x: Self) {
      
      inline def setGetCaption(value: () => js.Promise[String]): Self = StObject.set(x, "getCaption", js.Any.fromFunction0(value))
      
      inline def setGetProfileImageSrc(value: () => js.Promise[String]): Self = StObject.set(x, "getProfileImageSrc", js.Any.fromFunction0(value))
      
      inline def setGetProfileName(value: () => js.Promise[String]): Self = StObject.set(x, "getProfileName", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[instagram | facebook]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    }
  }
}

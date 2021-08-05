package typings.wixStyleReact

import typings.wixUiCore.avatarTypesMod.ContentType
import typings.wixUiCore.avatarUniDriverMod.AvatarDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarUniDriverMod {
  
  trait AvatarUniDriver
    extends StObject
       with AvatarDriver {
    
    def clickCustomIndication(): js.Promise[Unit]
    
    def clickIndication(): js.Promise[Unit]
    
    def customIndicationExists(): js.Promise[Boolean]
    
    def indicationExists(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
  }
  object AvatarUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickCustomIndication: () => js.Promise[Unit],
      clickIndication: () => js.Promise[Unit],
      customIndicationExists: () => js.Promise[Boolean],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContentType: () => js.Promise[ContentType],
      getTextContent: () => js.Promise[String],
      indicationExists: () => js.Promise[Boolean],
      isImageLoaded: () => js.Promise[Boolean],
      isLoading: () => js.Promise[Boolean]
    ): AvatarUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickCustomIndication = js.Any.fromFunction0(clickCustomIndication), clickIndication = js.Any.fromFunction0(clickIndication), customIndicationExists = js.Any.fromFunction0(customIndicationExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContentType = js.Any.fromFunction0(getContentType), getTextContent = js.Any.fromFunction0(getTextContent), indicationExists = js.Any.fromFunction0(indicationExists), isImageLoaded = js.Any.fromFunction0(isImageLoaded), isLoading = js.Any.fromFunction0(isLoading))
      __obj.asInstanceOf[AvatarUniDriver]
    }
    
    extension [Self <: AvatarUniDriver](x: Self) {
      
      inline def setClickCustomIndication(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickCustomIndication", js.Any.fromFunction0(value))
      
      inline def setClickIndication(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickIndication", js.Any.fromFunction0(value))
      
      inline def setCustomIndicationExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "customIndicationExists", js.Any.fromFunction0(value))
      
      inline def setIndicationExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "indicationExists", js.Any.fromFunction0(value))
      
      inline def setIsLoading(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    }
  }
}

package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialPreviewUniDriverMod {
  
  trait SocialPreviewUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDescription(): js.Promise[String]
    
    def getPreviewUrl(): js.Promise[String]
    
    def getTitle(): js.Promise[String]
  }
  object SocialPreviewUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getDescription: () => js.Promise[String],
      getPreviewUrl: () => js.Promise[String],
      getTitle: () => js.Promise[String]
    ): SocialPreviewUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDescription = js.Any.fromFunction0(getDescription), getPreviewUrl = js.Any.fromFunction0(getPreviewUrl), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[SocialPreviewUniDriver]
    }
    
    extension [Self <: SocialPreviewUniDriver](x: Self) {
      
      inline def setGetDescription(value: () => js.Promise[String]): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
      
      inline def setGetPreviewUrl(value: () => js.Promise[String]): Self = StObject.set(x, "getPreviewUrl", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}

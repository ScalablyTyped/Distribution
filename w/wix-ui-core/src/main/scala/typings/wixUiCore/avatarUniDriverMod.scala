package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.avatarTypesMod.ContentType
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarUniDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/avatar/avatar.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def avatarDriverFactory(base: UniDriver[js.Any]): AvatarDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("avatarDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AvatarDriver]
  
  trait AvatarDriver
    extends StObject
       with BaseUniDriver {
    
    /** Get the currently displayed type. Types are: 'text', 'icon', 'image'. It could be that the resolved type is 'image' but the currently displayed one is `text`. */
    def getContentType(): js.Promise[ContentType]
    
    /** Get the text content (generated initials) */
    def getTextContent(): js.Promise[String]
    
    /** Wether the image wass loaded */
    def isImageLoaded(): js.Promise[Boolean]
  }
  object AvatarDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getContentType: () => js.Promise[ContentType],
      getTextContent: () => js.Promise[String],
      isImageLoaded: () => js.Promise[Boolean]
    ): AvatarDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getContentType = js.Any.fromFunction0(getContentType), getTextContent = js.Any.fromFunction0(getTextContent), isImageLoaded = js.Any.fromFunction0(isImageLoaded))
      __obj.asInstanceOf[AvatarDriver]
    }
    
    @scala.inline
    implicit class AvatarDriverMutableBuilder[Self <: AvatarDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContentType(value: () => js.Promise[ContentType]): Self = StObject.set(x, "getContentType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTextContent(value: () => js.Promise[String]): Self = StObject.set(x, "getTextContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageLoaded(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageLoaded", js.Any.fromFunction0(value))
    }
  }
}

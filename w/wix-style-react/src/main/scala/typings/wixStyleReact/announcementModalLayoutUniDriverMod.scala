package typings.wixStyleReact

import typings.wixStyleReact.baseModalLayoutUniDriverMod.BaseModalLayoutUniDriver
import typings.wixStyleReact.buttonUniDriverMod.ButtonUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object announcementModalLayoutUniDriverMod {
  
  @JSImport("wix-style-react/dist/es/src/AnnouncementModalLayout/AnnouncementModalLayout.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def announcementModalLayoutDriverFactory(base: BaseUniDriver): AnnouncementModalLayoutUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("announcementModalLayoutDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AnnouncementModalLayoutUniDriver]
  
  trait AnnouncementModalLayoutUniDriver
    extends StObject
       with BaseModalLayoutUniDriver
       with LinkBlockUniDriver {
    
    /** returns true if component exists */
    /* InferMemberOverrides */
    override def exists(): js.Promise[Boolean]
  }
  object AnnouncementModalLayoutUniDriver {
    
    @scala.inline
    def apply(
      childExists: String => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickCloseButton: () => js.Promise[Unit],
      clickHelpButton: () => js.Promise[Unit],
      clickLink: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getIllustrationSrc: () => js.Promise[String],
      getLinkText: () => js.Promise[String],
      getPrimaryButtonDriver: () => js.Promise[ButtonUniDriver],
      getSecondaryButtonDriver: () => js.Promise[ButtonUniDriver],
      getSubtitleText: () => js.Promise[String],
      getTheme: () => js.Promise[String],
      getTitleText: () => js.Promise[String]
    ): AnnouncementModalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = js.Any.fromFunction0(click), clickCloseButton = js.Any.fromFunction0(clickCloseButton), clickHelpButton = js.Any.fromFunction0(clickHelpButton), clickLink = js.Any.fromFunction0(clickLink), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getIllustrationSrc = js.Any.fromFunction0(getIllustrationSrc), getLinkText = js.Any.fromFunction0(getLinkText), getPrimaryButtonDriver = js.Any.fromFunction0(getPrimaryButtonDriver), getSecondaryButtonDriver = js.Any.fromFunction0(getSecondaryButtonDriver), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTheme = js.Any.fromFunction0(getTheme), getTitleText = js.Any.fromFunction0(getTitleText))
      __obj.asInstanceOf[AnnouncementModalLayoutUniDriver]
    }
    
    @scala.inline
    implicit class AnnouncementModalLayoutUniDriverMutableBuilder[Self <: AnnouncementModalLayoutUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    }
  }
  
  trait LinkBlockUniDriver extends StObject {
    
    def clickLink(): js.Promise[Unit]
    
    def exists(): js.Promise[Boolean]
    
    def getLinkText(): js.Promise[String]
  }
  object LinkBlockUniDriver {
    
    @scala.inline
    def apply(
      clickLink: () => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getLinkText: () => js.Promise[String]
    ): LinkBlockUniDriver = {
      val __obj = js.Dynamic.literal(clickLink = js.Any.fromFunction0(clickLink), exists = js.Any.fromFunction0(exists), getLinkText = js.Any.fromFunction0(getLinkText))
      __obj.asInstanceOf[LinkBlockUniDriver]
    }
    
    @scala.inline
    implicit class LinkBlockUniDriverMutableBuilder[Self <: LinkBlockUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickLink(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickLink", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLinkText(value: () => js.Promise[String]): Self = StObject.set(x, "getLinkText", js.Any.fromFunction0(value))
    }
  }
}

package typings.wixStyleReact

import typings.wixStyleReact.distTypesBaseModalLayoutBaseModalLayoutDotuniDotdriverMod.BaseModalLayoutUniDriver
import typings.wixStyleReact.distTypesButtonButtonDotuniDotdriverMod.ButtonUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnnouncementModalLayoutAnnouncementModalLayoutDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/AnnouncementModalLayout/AnnouncementModalLayout.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def announcementModalLayoutDriverFactory(base: BaseUniDriver): AnnouncementModalLayoutUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("announcementModalLayoutDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AnnouncementModalLayoutUniDriver]
  
  trait AnnouncementModalLayoutUniDriver
    extends StObject
       with BaseModalLayoutUniDriver
       with LinkBlockUniDriver {
    
    /** returns true if component exists */
    /* InferMemberOverrides */
    override def exists(): js.Promise[Boolean]
  }
  object AnnouncementModalLayoutUniDriver {
    
    inline def apply(
      childExists: String => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickCloseButton: () => js.Promise[Unit],
      clickHelpButton: () => js.Promise[Unit],
      clickLink: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getIllustrationSrc: () => js.Promise[String],
      getLinkText: () => js.Promise[String],
      getPrimaryButtonDriver: () => js.Promise[ButtonUniDriver],
      getPrimaryButtonTooltipContent: () => js.Promise[String],
      getSecondaryButtonDriver: () => js.Promise[ButtonUniDriver],
      getSubtitleText: () => js.Promise[String],
      getTheme: () => js.Promise[String],
      getTitleText: () => js.Promise[String]
    ): AnnouncementModalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = js.Any.fromFunction0(click), clickCloseButton = js.Any.fromFunction0(clickCloseButton), clickHelpButton = js.Any.fromFunction0(clickHelpButton), clickLink = js.Any.fromFunction0(clickLink), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getIllustrationSrc = js.Any.fromFunction0(getIllustrationSrc), getLinkText = js.Any.fromFunction0(getLinkText), getPrimaryButtonDriver = js.Any.fromFunction0(getPrimaryButtonDriver), getPrimaryButtonTooltipContent = js.Any.fromFunction0(getPrimaryButtonTooltipContent), getSecondaryButtonDriver = js.Any.fromFunction0(getSecondaryButtonDriver), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTheme = js.Any.fromFunction0(getTheme), getTitleText = js.Any.fromFunction0(getTitleText))
      __obj.asInstanceOf[AnnouncementModalLayoutUniDriver]
    }
    
    extension [Self <: AnnouncementModalLayoutUniDriver](x: Self) {
      
      inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    }
  }
  
  trait LinkBlockUniDriver extends StObject {
    
    def clickLink(): js.Promise[Unit]
    
    def exists(): js.Promise[Boolean]
    
    def getLinkText(): js.Promise[String]
  }
  object LinkBlockUniDriver {
    
    inline def apply(
      clickLink: () => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      getLinkText: () => js.Promise[String]
    ): LinkBlockUniDriver = {
      val __obj = js.Dynamic.literal(clickLink = js.Any.fromFunction0(clickLink), exists = js.Any.fromFunction0(exists), getLinkText = js.Any.fromFunction0(getLinkText))
      __obj.asInstanceOf[LinkBlockUniDriver]
    }
    
    extension [Self <: LinkBlockUniDriver](x: Self) {
      
      inline def setClickLink(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickLink", js.Any.fromFunction0(value))
      
      inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      inline def setGetLinkText(value: () => js.Promise[String]): Self = StObject.set(x, "getLinkText", js.Any.fromFunction0(value))
    }
  }
}

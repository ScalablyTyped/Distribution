package typings.wixStyleReact

import typings.wixStyleReact.baseModalLayoutUniDriverMod.BaseModalLayoutUniDriver
import typings.wixStyleReact.buttonUniDriverMod.ButtonUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customModalLayoutUniDriverMod {
  
  @JSImport("wix-style-react/dist/es/src/CustomModalLayout/CustomModalLayout.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def customModalLayoutDriverFactory(base: BaseUniDriver): CustomModalLayoutUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("customModalLayoutDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CustomModalLayoutUniDriver]
  
  trait CustomModalLayoutUniDriver
    extends StObject
       with BaseModalLayoutUniDriver {
    
    def hasContentPadding(): js.Promise[Boolean]
  }
  object CustomModalLayoutUniDriver {
    
    inline def apply(
      childExists: String => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickCloseButton: () => js.Promise[Unit],
      clickHelpButton: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getIllustrationSrc: () => js.Promise[String],
      getPrimaryButtonDriver: () => js.Promise[ButtonUniDriver],
      getSecondaryButtonDriver: () => js.Promise[ButtonUniDriver],
      getSubtitleText: () => js.Promise[String],
      getTheme: () => js.Promise[String],
      getTitleText: () => js.Promise[String],
      hasContentPadding: () => js.Promise[Boolean]
    ): CustomModalLayoutUniDriver = {
      val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = js.Any.fromFunction0(click), clickCloseButton = js.Any.fromFunction0(clickCloseButton), clickHelpButton = js.Any.fromFunction0(clickHelpButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getIllustrationSrc = js.Any.fromFunction0(getIllustrationSrc), getPrimaryButtonDriver = js.Any.fromFunction0(getPrimaryButtonDriver), getSecondaryButtonDriver = js.Any.fromFunction0(getSecondaryButtonDriver), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTheme = js.Any.fromFunction0(getTheme), getTitleText = js.Any.fromFunction0(getTitleText), hasContentPadding = js.Any.fromFunction0(hasContentPadding))
      __obj.asInstanceOf[CustomModalLayoutUniDriver]
    }
    
    extension [Self <: CustomModalLayoutUniDriver](x: Self) {
      
      inline def setHasContentPadding(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasContentPadding", js.Any.fromFunction0(value))
    }
  }
}

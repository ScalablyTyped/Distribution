package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.videoDotUniDriverMod.IVideoDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoDotDriverPrivateMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.driver.private", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def videoPrivateDriverFactory(base: UniDriver[js.Any]): IVideoPrivateDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("videoPrivateDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[IVideoPrivateDriver]
  
  trait IVideoPrivateDriver
    extends StObject
       with IVideoDriver {
    
    def getHeightDataAttr(): js.Promise[String]
    
    def getLogoSrc(): js.Promise[String]
    
    def getNative(): js.Promise[js.Any]
    
    def getTitle(): js.Promise[String]
    
    def getWidthDataAttr(): js.Promise[String]
    
    def hasCover(): js.Promise[Boolean]
    
    def hasPlayButton(): js.Promise[Boolean]
    
    def hasTitle(): js.Promise[Boolean]
  }
  object IVideoPrivateDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getHeightDataAttr: () => js.Promise[String],
      getLogoSrc: () => js.Promise[String],
      getNative: () => js.Promise[js.Any],
      getPlayerName: () => js.Promise[String],
      getTitle: () => js.Promise[String],
      getWidthDataAttr: () => js.Promise[String],
      hasCover: () => js.Promise[Boolean],
      hasPlayButton: () => js.Promise[Boolean],
      hasTitle: () => js.Promise[Boolean]
    ): IVideoPrivateDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getHeightDataAttr = js.Any.fromFunction0(getHeightDataAttr), getLogoSrc = js.Any.fromFunction0(getLogoSrc), getNative = js.Any.fromFunction0(getNative), getPlayerName = js.Any.fromFunction0(getPlayerName), getTitle = js.Any.fromFunction0(getTitle), getWidthDataAttr = js.Any.fromFunction0(getWidthDataAttr), hasCover = js.Any.fromFunction0(hasCover), hasPlayButton = js.Any.fromFunction0(hasPlayButton), hasTitle = js.Any.fromFunction0(hasTitle))
      __obj.asInstanceOf[IVideoPrivateDriver]
    }
    
    @scala.inline
    implicit class IVideoPrivateDriverMutableBuilder[Self <: IVideoPrivateDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetHeightDataAttr(value: () => js.Promise[String]): Self = StObject.set(x, "getHeightDataAttr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLogoSrc(value: () => js.Promise[String]): Self = StObject.set(x, "getLogoSrc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNative(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidthDataAttr(value: () => js.Promise[String]): Self = StObject.set(x, "getWidthDataAttr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasCover(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasCover", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasPlayButton(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasPlayButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasTitle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTitle", js.Any.fromFunction0(value))
    }
  }
}

package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoDotUniDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def videoDriverFactory(base: UniDriver[js.Any]): IVideoDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("videoDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[IVideoDriver]
  
  trait IVideoDriver
    extends StObject
       with BaseUniDriver {
    
    /** returns player name */
    def getPlayerName(): js.Promise[String]
  }
  object IVideoDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getPlayerName: () => js.Promise[String]
    ): IVideoDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getPlayerName = js.Any.fromFunction0(getPlayerName))
      __obj.asInstanceOf[IVideoDriver]
    }
    
    extension [Self <: IVideoDriver](x: Self) {
      
      inline def setGetPlayerName(value: () => js.Promise[String]): Self = StObject.set(x, "getPlayerName", js.Any.fromFunction0(value))
    }
  }
}

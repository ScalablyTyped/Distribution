package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.videoUniDriverMod.IVideoDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/video/Video.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def videoDriverFactory(base: UniDriver[js.Any]): IVideoDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("videoDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[IVideoDriver]
}

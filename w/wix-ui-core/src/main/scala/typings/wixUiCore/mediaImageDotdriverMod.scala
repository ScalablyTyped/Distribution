package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.mediaImageDotUniDriverMod.MediaImageDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaImageDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/media-image/media-image.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mediaImageDriverFactory(base: UniDriver[js.Any]): MediaImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaImageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MediaImageDriver]
}

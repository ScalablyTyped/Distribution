package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.mediaImageUniDriverMod.MediaImageDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaImageDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/media-image/media-image.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mediaImageDriverFactory(base: UniDriver[js.Any]): MediaImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaImageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MediaImageDriver]
}

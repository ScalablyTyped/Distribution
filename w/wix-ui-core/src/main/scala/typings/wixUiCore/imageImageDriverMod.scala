package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.imageUniDotDriverMod.ImageDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageImageDriverMod {
  
  @JSImport("wix-ui-core/src/components/image/image.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imageDriverFactory(base: UniDriver[js.Any]): ImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ImageDriver]
}

package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.imageUniDriverMod.ImageDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/image/image.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def imageDriverFactory(base: UniDriver[js.Any]): ImageDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("imageDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ImageDriver]
}

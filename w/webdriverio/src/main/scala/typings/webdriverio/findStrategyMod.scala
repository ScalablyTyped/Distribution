package typings.webdriverio

import typings.webdriverio.anon.Using
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findStrategyMod {
  
  @JSImport("webdriverio/build/utils/findStrategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findStrategy(selector: String, isW3C: Boolean, isMobile: Boolean): Using = (^.asInstanceOf[js.Dynamic].applyDynamic("findStrategy")(selector.asInstanceOf[js.Any], isW3C.asInstanceOf[js.Any], isMobile.asInstanceOf[js.Any])).asInstanceOf[Using]
}

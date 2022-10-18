package typings.webdriverio

import typings.webdriverio.anon.Args
import typings.webdriverio.anon.Using
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsFindStrategyMod {
  
  @JSImport("webdriverio/build/utils/findStrategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findStrategy(selector: SelectorStrategy): Using = ^.asInstanceOf[js.Dynamic].applyDynamic("findStrategy")(selector.asInstanceOf[js.Any]).asInstanceOf[Using]
  inline def findStrategy(selector: SelectorStrategy, isW3C: Boolean): Using = (^.asInstanceOf[js.Dynamic].applyDynamic("findStrategy")(selector.asInstanceOf[js.Any], isW3C.asInstanceOf[js.Any])).asInstanceOf[Using]
  inline def findStrategy(selector: SelectorStrategy, isW3C: Boolean, isMobile: Boolean): Using = (^.asInstanceOf[js.Dynamic].applyDynamic("findStrategy")(selector.asInstanceOf[js.Any], isW3C.asInstanceOf[js.Any], isMobile.asInstanceOf[js.Any])).asInstanceOf[Using]
  inline def findStrategy(selector: SelectorStrategy, isW3C: Unit, isMobile: Boolean): Using = (^.asInstanceOf[js.Dynamic].applyDynamic("findStrategy")(selector.asInstanceOf[js.Any], isW3C.asInstanceOf[js.Any], isMobile.asInstanceOf[js.Any])).asInstanceOf[Using]
  
  type SelectorStrategy = String | Args
}

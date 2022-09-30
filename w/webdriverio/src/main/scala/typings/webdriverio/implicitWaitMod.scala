package typings.webdriverio

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implicitWaitMod {
  
  @JSImport("webdriverio/build/utils/implicitWait", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(currentElement: Element, commandName: String): js.Promise[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(currentElement.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Element]]
}

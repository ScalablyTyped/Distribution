package typings.webdriverio

import typings.webdriverio.implicitWaitMod.CurrentElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refetchElementMod {
  
  @JSImport("webdriverio/build/utils/refetchElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(currentElement: CurrentElement, commandName: String): js.Promise[CurrentElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(currentElement.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CurrentElement]]
}

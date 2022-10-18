package typings.testcafe.mod.global

import typings.testcafe.testcafeStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BrowserOption extends StObject
object _BrowserOption {
  
  inline def BrowserConnection(once: (ready, js.Function) => Unit, url: String): typings.testcafe.mod.global.BrowserConnection = {
    val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.testcafe.mod.global.BrowserConnection]
  }
  
  inline def BrowserDescriptor(path: String): typings.testcafe.mod.global.BrowserDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.testcafe.mod.global.BrowserDescriptor]
  }
}

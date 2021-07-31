package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementArray
  extends StObject
     with Array[Element] {
  
  var foundWith: String = js.native
  
  var parent: Element | BrowserObject = js.native
  
  var props: js.Array[js.Any] = js.native
  
  var selector: String | js.Function = js.native
}

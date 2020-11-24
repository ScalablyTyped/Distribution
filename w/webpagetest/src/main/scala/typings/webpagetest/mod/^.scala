package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpagetest", JSImport.Namespace)
@js.native
/**
  * @param server The host of the WebPagetest server. Defaults to 'www.webpagetest.org'.
  * @param key The API Key used for the instance. Can be left empty for public API.
  */
class ^ () extends WebPageTest {
  def this(server: String) = this()
  def this(server: js.UndefOr[scala.Nothing], key: String) = this()
  def this(server: String, key: String) = this()
}
@JSImport("webpagetest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var defaultListenPort: Double = js.native
  
  var defaultServer: String = js.native
  
  var defaultWaitResultsPort: Double = js.native
  
  def scriptToString(script: TestScript): String = js.native
  
  var version: String = js.native
}

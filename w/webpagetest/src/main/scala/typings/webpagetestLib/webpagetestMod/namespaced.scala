package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpagetest", JSImport.Namespace)
@js.native
class namespaced () extends WebPageTest {
  /**
     * @param server The host of the WebPagetest server. Defaults to 'www.webpagetest.org'.
     * @param key The API Key used for the instance. Can be left empty for public API.
     */
  def this(server: java.lang.String) = this()
  /**
     * @param server The host of the WebPagetest server. Defaults to 'www.webpagetest.org'.
     * @param key The API Key used for the instance. Can be left empty for public API.
     */
  def this(server: java.lang.String, key: java.lang.String) = this()
}

@JSImport("webpagetest", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var defaultListenPort: scala.Double = js.native
  var defaultServer: java.lang.String = js.native
  var defaultWaitResultsPort: scala.Double = js.native
  var version: java.lang.String = js.native
  def scriptToString(script: webpagetestLib.TestScript): java.lang.String = js.native
}


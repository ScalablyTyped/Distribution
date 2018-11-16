package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HttpsProxyOptions extends ProxyOptions {
  var ca: js.UndefOr[js.Array[nodeLib.Buffer]] = js.undefined
  var cert: js.UndefOr[nodeLib.Buffer] = js.undefined
  var key: js.UndefOr[nodeLib.Buffer] = js.undefined
  var servername: js.UndefOr[java.lang.String] = js.undefined
}


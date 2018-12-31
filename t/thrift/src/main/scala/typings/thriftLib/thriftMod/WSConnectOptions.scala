package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WSConnectOptions extends js.Object {
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
  var wsOptions: js.UndefOr[WSOptions] = js.undefined
}


package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectOptions extends js.Object {
  var connect_timeout: js.UndefOr[scala.Double] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var https: js.UndefOr[scala.Boolean] = js.undefined
  var max_attempts: js.UndefOr[scala.Double] = js.undefined
  var nodeOptions: js.UndefOr[nodeLib.httpMod.RequestOptions | nodeLib.httpsMod.RequestOptions] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  var retry_max_delay: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
}


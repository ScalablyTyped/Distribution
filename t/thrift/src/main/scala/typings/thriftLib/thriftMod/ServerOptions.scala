package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerOptions[TProcessor, THandler] extends ServiceOptions[TProcessor, THandler] {
  var cors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var files: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var services: js.UndefOr[ServiceMap[TProcessor, THandler]] = js.undefined
  var tls: js.UndefOr[nodeLib.tlsMod.TlsOptions] = js.undefined
}


package typings
package winstonLib.libWinstonTransportsMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpTransportOptions
  extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var auth: js.UndefOr[winstonLib.Anon_Password] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var ssl: js.UndefOr[js.Any] = js.undefined
}


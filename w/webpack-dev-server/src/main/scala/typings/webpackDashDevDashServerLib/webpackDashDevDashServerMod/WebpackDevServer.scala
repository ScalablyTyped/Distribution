package typings
package webpackDashDevDashServerLib.webpackDashDevDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackDevServer extends js.Object {
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def listen(port: scala.Double): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String): nodeLib.httpMod.Server = js.native
  def listen(
    port: scala.Double,
    hostname: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): nodeLib.httpMod.Server = js.native
}


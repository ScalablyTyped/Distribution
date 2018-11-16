package typings
package winstonDashTransportLib.winstonDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportStream
  extends nodeLib.streamMod.Writable {
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var format: js.UndefOr[logformLib.logformMod.Format] = js.native
  var handleExceptions: js.UndefOr[scala.Boolean] = js.native
  var level: js.UndefOr[java.lang.String] = js.native
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _]] = js.native
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[scala.Unit], _]] = js.native
  var silent: js.UndefOr[scala.Boolean] = js.native
}


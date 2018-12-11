package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsReport extends js.Object {
  def forEach(
    callbackfn: js.Function3[/* value */ js.Any, /* key */ java.lang.String, /* parent */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ js.Any, /* key */ java.lang.String, /* parent */ this.type, scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
}

@JSGlobal("RTCStatsReport")
@js.native
object RTCStatsReport
  extends ScalablyTyped.runtime.Instantiable0[RTCStatsReport]


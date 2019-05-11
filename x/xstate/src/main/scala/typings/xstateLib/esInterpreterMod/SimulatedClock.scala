package typings
package xstateLib.esInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/interpreter", "SimulatedClock")
@js.native
class SimulatedClock () extends Clock {
  var _id: js.Any = js.native
  var _now: js.Any = js.native
  var flushTimeouts: js.Any = js.native
  var getId: js.Any = js.native
  var timeouts: js.Any = js.native
  /* CompleteClass */
  override def clearTimeout(id: js.Any): scala.Unit = js.native
  def clearTimeout(id: scala.Double): scala.Unit = js.native
  def increment(ms: scala.Double): scala.Unit = js.native
  def now(): scala.Double = js.native
  def set(ms: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setTimeout(fn: js.Function1[/* repeated */ js.Any, scala.Unit], timeout: scala.Double): js.Any = js.native
  def start(speed: scala.Double): scala.Unit = js.native
}


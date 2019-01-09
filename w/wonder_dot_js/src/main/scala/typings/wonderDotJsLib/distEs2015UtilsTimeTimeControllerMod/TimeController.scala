package typings
package wonderDotJsLib.distEs2015UtilsTimeTimeControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/time/TimeController", "TimeController")
@js.native
abstract class TimeController () extends js.Object {
  var elapsed: scala.Double = js.native
  var pauseElapsed: scala.Double = js.native
  var pauseTime: scala.Double = js.native
  var startTime: scala.Double = js.native
  def computeElapseTime(time: scala.Double): scala.Double = js.native
  /* protected */ def getNow(): js.Any = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}


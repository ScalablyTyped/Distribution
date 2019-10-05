package typings.wonderDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/time/TimeController", JSImport.Namespace)
@js.native
object distEs2015UtilsTimeTimeControllerMod extends js.Object {
  @js.native
  abstract class TimeController () extends js.Object {
    var elapsed: Double = js.native
    var pauseElapsed: Double = js.native
    var pauseTime: Double = js.native
    var startTime: Double = js.native
    def computeElapseTime(time: Double): Double = js.native
    /* protected */ def getNow(): js.Any = js.native
    def pause(): Unit = js.native
    def resume(): Unit = js.native
    def start(): Unit = js.native
    def stop(): Unit = js.native
  }
  
}


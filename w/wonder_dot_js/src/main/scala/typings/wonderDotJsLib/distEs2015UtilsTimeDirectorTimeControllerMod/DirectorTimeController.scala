package typings
package wonderDotJsLib.distEs2015UtilsTimeDirectorTimeControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/time/DirectorTimeController", "DirectorTimeController")
@js.native
class DirectorTimeController ()
  extends wonderDotJsLib.distEs2015UtilsTimeTimeControllerMod.TimeController {
  var deltaTime: scala.Double = js.native
  var fps: scala.Double = js.native
  var gameTime: scala.Double = js.native
  var isTimeChange: scala.Boolean = js.native
  def tick(time: scala.Double): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/utils/time/DirectorTimeController", "DirectorTimeController")
@js.native
object DirectorTimeController extends js.Object {
  def create(): wonderDotJsLib.distEs2015UtilsTimeDirectorTimeControllerMod.DirectorTimeController = js.native
}


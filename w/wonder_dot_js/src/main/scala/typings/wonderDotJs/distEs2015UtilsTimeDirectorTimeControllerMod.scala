package typings.wonderDotJs

import typings.wonderDotJs.distEs2015UtilsTimeTimeControllerMod.TimeController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/time/DirectorTimeController", JSImport.Namespace)
@js.native
object distEs2015UtilsTimeDirectorTimeControllerMod extends js.Object {
  @js.native
  class DirectorTimeController () extends TimeController {
    var deltaTime: Double = js.native
    var fps: Double = js.native
    var gameTime: Double = js.native
    var isTimeChange: Boolean = js.native
    def tick(time: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object DirectorTimeController extends js.Object {
    def create(): DirectorTimeController = js.native
  }
  
}


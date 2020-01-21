package typings.wonderJs

import typings.wonderJs.timeControllerMod.TimeController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/time/CommonTimeController", JSImport.Namespace)
@js.native
object commonTimeControllerMod extends js.Object {
  @js.native
  class CommonTimeController () extends TimeController
  
  /* static members */
  @js.native
  object CommonTimeController extends js.Object {
    def create(): CommonTimeController = js.native
  }
  
}


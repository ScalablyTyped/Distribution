package typings
package typedocLib.distLibUtilsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentHost extends js.Object {
  val application: typedocLib.distLibApplicationMod.Application
}

object ComponentHost {
  @scala.inline
  def apply(application: typedocLib.distLibApplicationMod.Application): ComponentHost = {
    val __obj = js.Dynamic.literal(application = application)
  
    __obj.asInstanceOf[ComponentHost]
  }
}


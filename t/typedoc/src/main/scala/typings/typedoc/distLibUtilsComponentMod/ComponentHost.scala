package typings.typedoc.distLibUtilsComponentMod

import typings.typedoc.distLibApplicationMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentHost extends js.Object {
  val application: Application
}

object ComponentHost {
  @scala.inline
  def apply(application: Application): ComponentHost = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentHost]
  }
}


package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** DeleteModelResult. */
trait DeleteModelResult extends js.Object {
  /** "OK" indicates that the model was successfully deleted. */
  var status: String
}

object DeleteModelResult {
  @scala.inline
  def apply(status: String): DeleteModelResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelResult]
  }
}


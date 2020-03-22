package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertiesAnonVisibilities extends js.Object {
  var properties: AnonVisibilities
  var `type`: String
}

object AnonPropertiesAnonVisibilities {
  @scala.inline
  def apply(properties: AnonVisibilities, `type`: String): AnonPropertiesAnonVisibilities = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertiesAnonVisibilities]
  }
}


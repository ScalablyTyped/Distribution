package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertiesType extends js.Object {
  var properties: AnonTags
  var `type`: String
}

object AnonPropertiesType {
  @scala.inline
  def apply(properties: AnonTags, `type`: String): AnonPropertiesType = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertiesType]
  }
}


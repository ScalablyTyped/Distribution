package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesType extends js.Object {
  var properties: Tags
  var `type`: String
}

object PropertiesType {
  @scala.inline
  def apply(properties: Tags, `type`: String): PropertiesType = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesType]
  }
}


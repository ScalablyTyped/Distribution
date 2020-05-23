package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesVisibilities extends js.Object {
  var properties: Visibilities
  var `type`: String
}

object PropertiesVisibilities {
  @scala.inline
  def apply(properties: Visibilities, `type`: String): PropertiesVisibilities = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesVisibilities]
  }
}


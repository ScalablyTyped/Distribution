package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesLocations extends js.Object {
  var properties: Locations
  var `type`: String
}

object PropertiesLocations {
  @scala.inline
  def apply(properties: Locations, `type`: String): PropertiesLocations = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesLocations]
  }
}


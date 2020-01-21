package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertiesTypeAnonLocations extends js.Object {
  var properties: AnonLocations
  var `type`: String
}

object AnonPropertiesTypeAnonLocations {
  @scala.inline
  def apply(properties: AnonLocations, `type`: String): AnonPropertiesTypeAnonLocations = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertiesTypeAnonLocations]
  }
}


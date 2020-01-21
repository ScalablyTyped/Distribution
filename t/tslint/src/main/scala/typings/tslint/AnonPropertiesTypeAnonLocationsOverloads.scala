package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertiesTypeAnonLocationsOverloads extends js.Object {
  var properties: AnonLocationsOverloads
  var `type`: String
}

object AnonPropertiesTypeAnonLocationsOverloads {
  @scala.inline
  def apply(properties: AnonLocationsOverloads, `type`: String): AnonPropertiesTypeAnonLocationsOverloads = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertiesTypeAnonLocationsOverloads]
  }
}


package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropertiesTypeAnonLocationsOverloads extends js.Object {
  var properties: Anon_LocationsOverloads
  var `type`: String
}

object Anon_PropertiesTypeAnonLocationsOverloads {
  @scala.inline
  def apply(properties: Anon_LocationsOverloads, `type`: String): Anon_PropertiesTypeAnonLocationsOverloads = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PropertiesTypeAnonLocationsOverloads]
  }
}


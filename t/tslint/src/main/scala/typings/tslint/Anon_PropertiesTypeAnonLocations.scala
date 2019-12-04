package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropertiesTypeAnonLocations extends js.Object {
  var properties: Anon_Locations
  var `type`: String
}

object Anon_PropertiesTypeAnonLocations {
  @scala.inline
  def apply(properties: Anon_Locations, `type`: String): Anon_PropertiesTypeAnonLocations = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PropertiesTypeAnonLocations]
  }
}


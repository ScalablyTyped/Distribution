package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesOverloads extends js.Object {
  var properties: Overloads
  var `type`: String
}

object PropertiesOverloads {
  @scala.inline
  def apply(properties: Overloads, `type`: String): PropertiesOverloads = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesOverloads]
  }
}


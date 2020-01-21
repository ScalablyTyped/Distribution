package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertiesTypeAnonOverloads extends js.Object {
  var properties: AnonOverloads
  var `type`: String
}

object AnonPropertiesTypeAnonOverloads {
  @scala.inline
  def apply(properties: AnonOverloads, `type`: String): AnonPropertiesTypeAnonOverloads = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertiesTypeAnonOverloads]
  }
}


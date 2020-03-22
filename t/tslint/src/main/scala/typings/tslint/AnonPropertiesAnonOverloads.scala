package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropertiesAnonOverloads extends js.Object {
  var properties: AnonOverloads
  var `type`: String
}

object AnonPropertiesAnonOverloads {
  @scala.inline
  def apply(properties: AnonOverloads, `type`: String): AnonPropertiesAnonOverloads = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPropertiesAnonOverloads]
  }
}


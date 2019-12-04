package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropertiesTypeAnonOverloads extends js.Object {
  var properties: Anon_Overloads
  var `type`: String
}

object Anon_PropertiesTypeAnonOverloads {
  @scala.inline
  def apply(properties: Anon_Overloads, `type`: String): Anon_PropertiesTypeAnonOverloads = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PropertiesTypeAnonOverloads]
  }
}


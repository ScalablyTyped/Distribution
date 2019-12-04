package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropertiesType extends js.Object {
  var properties: Anon_Tags
  var `type`: String
}

object Anon_PropertiesType {
  @scala.inline
  def apply(properties: Anon_Tags, `type`: String): Anon_PropertiesType = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PropertiesType]
  }
}


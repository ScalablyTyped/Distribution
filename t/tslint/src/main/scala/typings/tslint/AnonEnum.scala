package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnum extends js.Object {
  var enum: js.Array[String]
  var `type`: String
}

object AnonEnum {
  @scala.inline
  def apply(enum: js.Array[String], `type`: String): AnonEnum = {
    val __obj = js.Dynamic.literal(enum = enum.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnum]
  }
}


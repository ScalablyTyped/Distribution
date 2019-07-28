package typings.webgme.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeSchema extends js.Object {
  /** array of possible/allowed values */
  var enum: js.Array[String]
  /** integer, float, asset, string */
  var `type`: String
}

object AttributeSchema {
  @scala.inline
  def apply(enum: js.Array[String], `type`: String): AttributeSchema = {
    val __obj = js.Dynamic.literal(enum = enum)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttributeSchema]
  }
}


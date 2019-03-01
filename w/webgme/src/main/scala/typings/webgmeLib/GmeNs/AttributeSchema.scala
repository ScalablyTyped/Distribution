package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeSchema extends js.Object {
  /** array of possible/allowed values */
  var enum: js.Array[java.lang.String]
  /** integer, float, asset, string */
  var `type`: java.lang.String
}

object AttributeSchema {
  @scala.inline
  def apply(enum: js.Array[java.lang.String], `type`: java.lang.String): AttributeSchema = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("enum")(enum)
    __obj.asInstanceOf[AttributeSchema]
  }
}


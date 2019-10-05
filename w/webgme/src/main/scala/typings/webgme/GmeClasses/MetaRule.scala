package typings.webgme.GmeClasses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaRule extends js.Object {
  var enum: js.Array[String]
  var `type`: String | Double | Boolean
}

object MetaRule {
  @scala.inline
  def apply(enum: js.Array[String], `type`: String | Double | Boolean): MetaRule = {
    val __obj = js.Dynamic.literal(enum = enum)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaRule]
  }
}


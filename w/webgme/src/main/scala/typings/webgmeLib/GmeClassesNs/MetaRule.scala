package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaRule extends js.Object {
  var enum: js.Array[java.lang.String]
  var `type`: java.lang.String | scala.Double | scala.Boolean
}

object MetaRule {
  @scala.inline
  def apply(enum: js.Array[java.lang.String], `type`: java.lang.String | scala.Double | scala.Boolean): MetaRule = {
    val __obj = js.Dynamic.literal(enum = enum)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaRule]
  }
}


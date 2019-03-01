package typings
package tsDashNodeLib.tsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeInfo extends js.Object {
  var comment: java.lang.String
  var name: java.lang.String
}

object TypeInfo {
  @scala.inline
  def apply(comment: java.lang.String, name: java.lang.String): TypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TypeInfo]
  }
}


package typings
package yaysonLib.yaysonMod.yNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var attributes: js.Any
  var id: js.Any
  var relationships: js.Any
  var `type`: java.lang.String
}

object Record {
  @scala.inline
  def apply(attributes: js.Any, id: js.Any, relationships: js.Any, `type`: java.lang.String): Record = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[Record]
  }
}


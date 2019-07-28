package typings.yayson.yaysonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var attributes: js.Any
  var id: js.Any
  var relationships: js.Any
  var `type`: String
}

object Record {
  @scala.inline
  def apply(attributes: js.Any, id: js.Any, relationships: js.Any, `type`: String): Record = {
    val __obj = js.Dynamic.literal(attributes = attributes, id = id, relationships = relationships)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Record]
  }
}


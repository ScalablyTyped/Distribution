package typings.yayson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
  var attributes: js.Any = js.native
  var id: js.Any = js.native
  var relationships: js.Any = js.native
  var `type`: String = js.native
}

object Record {
  @scala.inline
  def apply(attributes: js.Any, id: js.Any, relationships: js.Any, `type`: String): Record = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelationships(value: js.Any): Self = this.set("relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


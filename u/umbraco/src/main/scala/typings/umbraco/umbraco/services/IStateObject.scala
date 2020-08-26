package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * State Object
  */
@js.native
trait IStateObject extends js.Object {
  var id: Double = js.native
  var name: String = js.native
  var parentId: Double = js.native
}

object IStateObject {
  @scala.inline
  def apply(id: Double, name: String, parentId: Double): IStateObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateObject]
  }
  @scala.inline
  implicit class IStateObjectOps[Self <: IStateObject] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: Double): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
  
}


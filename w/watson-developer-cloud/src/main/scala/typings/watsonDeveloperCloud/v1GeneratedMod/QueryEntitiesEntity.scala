package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A text string that appears within the entity text field. */
@js.native
trait QueryEntitiesEntity extends js.Object {
  /** Entity text content. */
  var text: js.UndefOr[String] = js.native
  /** The type of the specified entity. */
  var `type`: js.UndefOr[String] = js.native
}

object QueryEntitiesEntity {
  @scala.inline
  def apply(): QueryEntitiesEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesEntity]
  }
  @scala.inline
  implicit class QueryEntitiesEntityOps[Self <: QueryEntitiesEntity] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


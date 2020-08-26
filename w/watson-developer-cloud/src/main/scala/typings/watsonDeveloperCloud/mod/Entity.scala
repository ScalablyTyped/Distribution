package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Entity. */
@js.native
trait Entity extends js.Object {
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.native
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.native
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It must be no longer than 64 characters. If you specify an entity name beginning with the reserved prefix `sys-`, it must be the name of a system entity that you want to enable. (Any entity content specified with the request is ignored.). */
  var entity: String = js.native
  /** Whether to use fuzzy matching for the entity. */
  var fuzzy_match: js.UndefOr[Boolean] = js.native
  /** Any metadata related to the entity. */
  var metadata: js.UndefOr[js.Object] = js.native
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.native
  /** An array of objects describing the entity values. */
  var values: js.UndefOr[js.Array[Value]] = js.native
}

object Entity {
  @scala.inline
  def apply(entity: String): Entity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  @scala.inline
  implicit class EntityOps[Self <: Entity] (val x: Self) extends AnyVal {
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
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFuzzy_match(value: Boolean): Self = this.set("fuzzy_match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuzzy_match: Self = this.set("fuzzy_match", js.undefined)
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Value*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Value]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}


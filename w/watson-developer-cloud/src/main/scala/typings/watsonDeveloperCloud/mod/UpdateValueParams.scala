package typings.watsonDeveloperCloud.mod

import typings.watsonDeveloperCloud.mod.UpdateValueConstants.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateValue` operation. */
@js.native
trait UpdateValueParams extends js.Object {
  /** The name of the entity. */
  var entity: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** Any metadata related to the entity value. */
  var new_metadata: js.UndefOr[js.Object] = js.native
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var new_patterns: js.UndefOr[js.Array[String]] = js.native
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_synonyms: js.UndefOr[js.Array[String]] = js.native
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_value: js.UndefOr[String] = js.native
  /** Specifies the type of entity value. */
  var new_value_type: js.UndefOr[ValueType | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The text of the entity value. */
  var value: String = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object UpdateValueParams {
  @scala.inline
  def apply(entity: String, value: String, workspace_id: String): UpdateValueParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValueParams]
  }
  @scala.inline
  implicit class UpdateValueParamsOps[Self <: UpdateValueParams] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setNew_metadata(value: js.Object): Self = this.set("new_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_metadata: Self = this.set("new_metadata", js.undefined)
    @scala.inline
    def setNew_patternsVarargs(value: String*): Self = this.set("new_patterns", js.Array(value :_*))
    @scala.inline
    def setNew_patterns(value: js.Array[String]): Self = this.set("new_patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_patterns: Self = this.set("new_patterns", js.undefined)
    @scala.inline
    def setNew_synonymsVarargs(value: String*): Self = this.set("new_synonyms", js.Array(value :_*))
    @scala.inline
    def setNew_synonyms(value: js.Array[String]): Self = this.set("new_synonyms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_synonyms: Self = this.set("new_synonyms", js.undefined)
    @scala.inline
    def setNew_value(value: String): Self = this.set("new_value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_value: Self = this.set("new_value", js.undefined)
    @scala.inline
    def setNew_value_type(value: ValueType | String): Self = this.set("new_value_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_value_type: Self = this.set("new_value_type", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}


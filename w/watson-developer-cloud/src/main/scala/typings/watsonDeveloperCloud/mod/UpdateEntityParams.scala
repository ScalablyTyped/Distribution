package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateEntity` operation. */
@js.native
trait UpdateEntityParams extends js.Object {
  
  /** The name of the entity. */
  var entity: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.native
  
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 64 characters. */
  var new_entity: js.UndefOr[String] = js.native
  
  /** Whether to use fuzzy matching for the entity. */
  var new_fuzzy_match: js.UndefOr[Boolean] = js.native
  
  /** Any metadata related to the entity. */
  var new_metadata: js.UndefOr[js.Object] = js.native
  
  /** An array of objects describing the entity values. */
  var new_values: js.UndefOr[js.Array[CreateValue]] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object UpdateEntityParams {
  
  @scala.inline
  def apply(entity: String, workspace_id: String): UpdateEntityParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityParams]
  }
  
  @scala.inline
  implicit class UpdateEntityParamsOps[Self <: UpdateEntityParams] (val x: Self) extends AnyVal {
    
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
    def setWorkspace_id(value: String): Self = this.set("workspace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setNew_description(value: String): Self = this.set("new_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_description: Self = this.set("new_description", js.undefined)
    
    @scala.inline
    def setNew_entity(value: String): Self = this.set("new_entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_entity: Self = this.set("new_entity", js.undefined)
    
    @scala.inline
    def setNew_fuzzy_match(value: Boolean): Self = this.set("new_fuzzy_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_fuzzy_match: Self = this.set("new_fuzzy_match", js.undefined)
    
    @scala.inline
    def setNew_metadata(value: js.Object): Self = this.set("new_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_metadata: Self = this.set("new_metadata", js.undefined)
    
    @scala.inline
    def setNew_valuesVarargs(value: CreateValue*): Self = this.set("new_values", js.Array(value :_*))
    
    @scala.inline
    def setNew_values(value: js.Array[CreateValue]): Self = this.set("new_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_values: Self = this.set("new_values", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
}

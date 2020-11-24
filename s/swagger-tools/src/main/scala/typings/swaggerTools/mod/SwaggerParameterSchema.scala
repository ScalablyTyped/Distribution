package typings.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwaggerParameterSchema extends js.Object {
  
  var allowMultiple: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var in: js.UndefOr[String] = js.native
  
  var maximum: js.UndefOr[String] = js.native
  
  var minimum: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var paramType: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var `type`: String = js.native
}
object SwaggerParameterSchema {
  
  @scala.inline
  def apply(name: String, `type`: String): SwaggerParameterSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerParameterSchema]
  }
  
  @scala.inline
  implicit class SwaggerParameterSchemaOps[Self <: SwaggerParameterSchema] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIn(value: String): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setMaximum(value: String): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: String): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setParamType(value: String): Self = this.set("paramType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamType: Self = this.set("paramType", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}

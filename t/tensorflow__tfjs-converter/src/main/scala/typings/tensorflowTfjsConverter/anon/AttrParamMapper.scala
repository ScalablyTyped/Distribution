package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrParamMapper extends js.Object {
  
  var AttrParamMapper: Required = js.native
  
  var Category: Enum = js.native
  
  var InputParamMapper: Properties = js.native
  
  var OpExecutor: AdditionalPropertiesType = js.native
  
  var OpMapper: AdditionalProperties = js.native
  
  var ParamTypes: Enum = js.native
}
object AttrParamMapper {
  
  @scala.inline
  def apply(
    AttrParamMapper: Required,
    Category: Enum,
    InputParamMapper: Properties,
    OpExecutor: AdditionalPropertiesType,
    OpMapper: AdditionalProperties,
    ParamTypes: Enum
  ): AttrParamMapper = {
    val __obj = js.Dynamic.literal(AttrParamMapper = AttrParamMapper.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], InputParamMapper = InputParamMapper.asInstanceOf[js.Any], OpExecutor = OpExecutor.asInstanceOf[js.Any], OpMapper = OpMapper.asInstanceOf[js.Any], ParamTypes = ParamTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrParamMapper]
  }
  
  @scala.inline
  implicit class AttrParamMapperOps[Self <: AttrParamMapper] (val x: Self) extends AnyVal {
    
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
    def setAttrParamMapper(value: Required): Self = this.set("AttrParamMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: Enum): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParamMapper(value: Properties): Self = this.set("InputParamMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpExecutor(value: AdditionalPropertiesType): Self = this.set("OpExecutor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpMapper(value: AdditionalProperties): Self = this.set("OpMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamTypes(value: Enum): Self = this.set("ParamTypes", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrParamMapper extends StObject {
  
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
  implicit class AttrParamMapperMutableBuilder[Self <: AttrParamMapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrParamMapper(value: Required): Self = StObject.set(x, "AttrParamMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: Enum): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParamMapper(value: Properties): Self = StObject.set(x, "InputParamMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpExecutor(value: AdditionalPropertiesType): Self = StObject.set(x, "OpExecutor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpMapper(value: AdditionalProperties): Self = StObject.set(x, "OpMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamTypes(value: Enum): Self = StObject.set(x, "ParamTypes", value.asInstanceOf[js.Any])
  }
}

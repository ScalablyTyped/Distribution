package typings.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrParamMapper extends js.Object {
  var AttrParamMapper: AnonAdditionalPropertiesPropertiesRequired
  var Category: AnonEnum
  var InputParamMapper: AnonAdditionalPropertiesProperties
  var OpExecutor: AnonAdditionalPropertiesType
  var OpMapper: AnonAdditionalProperties
  var ParamTypes: AnonEnum
}

object AnonAttrParamMapper {
  @scala.inline
  def apply(
    AttrParamMapper: AnonAdditionalPropertiesPropertiesRequired,
    Category: AnonEnum,
    InputParamMapper: AnonAdditionalPropertiesProperties,
    OpExecutor: AnonAdditionalPropertiesType,
    OpMapper: AnonAdditionalProperties,
    ParamTypes: AnonEnum
  ): AnonAttrParamMapper = {
    val __obj = js.Dynamic.literal(AttrParamMapper = AttrParamMapper.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], InputParamMapper = InputParamMapper.asInstanceOf[js.Any], OpExecutor = OpExecutor.asInstanceOf[js.Any], OpMapper = OpMapper.asInstanceOf[js.Any], ParamTypes = ParamTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttrParamMapper]
  }
}


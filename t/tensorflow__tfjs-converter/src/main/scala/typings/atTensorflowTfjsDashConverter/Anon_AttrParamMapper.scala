package typings.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrParamMapper extends js.Object {
  var AttrParamMapper: Anon_AdditionalPropertiesPropertiesRequired
  var Category: Anon_Enum
  var InputParamMapper: Anon_AdditionalPropertiesProperties
  var OpExecutor: Anon_AdditionalPropertiesType
  var OpMapper: Anon_AdditionalProperties
  var ParamTypes: Anon_Enum
}

object Anon_AttrParamMapper {
  @scala.inline
  def apply(
    AttrParamMapper: Anon_AdditionalPropertiesPropertiesRequired,
    Category: Anon_Enum,
    InputParamMapper: Anon_AdditionalPropertiesProperties,
    OpExecutor: Anon_AdditionalPropertiesType,
    OpMapper: Anon_AdditionalProperties,
    ParamTypes: Anon_Enum
  ): Anon_AttrParamMapper = {
    val __obj = js.Dynamic.literal(AttrParamMapper = AttrParamMapper.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], InputParamMapper = InputParamMapper.asInstanceOf[js.Any], OpExecutor = OpExecutor.asInstanceOf[js.Any], OpMapper = OpMapper.asInstanceOf[js.Any], ParamTypes = ParamTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AttrParamMapper]
  }
}


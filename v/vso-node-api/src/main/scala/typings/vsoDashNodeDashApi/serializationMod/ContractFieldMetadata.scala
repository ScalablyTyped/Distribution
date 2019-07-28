package typings.vsoDashNodeDashApi.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractFieldMetadata extends js.Object {
  var dictionaryKeyEnumType: js.UndefOr[ContractEnumMetadata] = js.undefined
  var dictionaryKeyIsDate: js.UndefOr[Boolean] = js.undefined
  var dictionaryValueEnumType: js.UndefOr[ContractEnumMetadata] = js.undefined
  var dictionaryValueFieldInfo: js.UndefOr[ContractFieldMetadata] = js.undefined
  var dictionaryValueIsDate: js.UndefOr[Boolean] = js.undefined
  var dictionaryValueTypeInfo: js.UndefOr[ContractMetadata] = js.undefined
  var enumType: js.UndefOr[ContractEnumMetadata] = js.undefined
  var isArray: js.UndefOr[Boolean] = js.undefined
  var isDate: js.UndefOr[Boolean] = js.undefined
  var isDictionary: js.UndefOr[Boolean] = js.undefined
  var typeInfo: js.UndefOr[ContractMetadata] = js.undefined
}

object ContractFieldMetadata {
  @scala.inline
  def apply(
    dictionaryKeyEnumType: ContractEnumMetadata = null,
    dictionaryKeyIsDate: js.UndefOr[Boolean] = js.undefined,
    dictionaryValueEnumType: ContractEnumMetadata = null,
    dictionaryValueFieldInfo: ContractFieldMetadata = null,
    dictionaryValueIsDate: js.UndefOr[Boolean] = js.undefined,
    dictionaryValueTypeInfo: ContractMetadata = null,
    enumType: ContractEnumMetadata = null,
    isArray: js.UndefOr[Boolean] = js.undefined,
    isDate: js.UndefOr[Boolean] = js.undefined,
    isDictionary: js.UndefOr[Boolean] = js.undefined,
    typeInfo: ContractMetadata = null
  ): ContractFieldMetadata = {
    val __obj = js.Dynamic.literal()
    if (dictionaryKeyEnumType != null) __obj.updateDynamic("dictionaryKeyEnumType")(dictionaryKeyEnumType)
    if (!js.isUndefined(dictionaryKeyIsDate)) __obj.updateDynamic("dictionaryKeyIsDate")(dictionaryKeyIsDate)
    if (dictionaryValueEnumType != null) __obj.updateDynamic("dictionaryValueEnumType")(dictionaryValueEnumType)
    if (dictionaryValueFieldInfo != null) __obj.updateDynamic("dictionaryValueFieldInfo")(dictionaryValueFieldInfo)
    if (!js.isUndefined(dictionaryValueIsDate)) __obj.updateDynamic("dictionaryValueIsDate")(dictionaryValueIsDate)
    if (dictionaryValueTypeInfo != null) __obj.updateDynamic("dictionaryValueTypeInfo")(dictionaryValueTypeInfo)
    if (enumType != null) __obj.updateDynamic("enumType")(enumType)
    if (!js.isUndefined(isArray)) __obj.updateDynamic("isArray")(isArray)
    if (!js.isUndefined(isDate)) __obj.updateDynamic("isDate")(isDate)
    if (!js.isUndefined(isDictionary)) __obj.updateDynamic("isDictionary")(isDictionary)
    if (typeInfo != null) __obj.updateDynamic("typeInfo")(typeInfo)
    __obj.asInstanceOf[ContractFieldMetadata]
  }
}


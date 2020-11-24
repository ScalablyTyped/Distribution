package typings.vsoNodeApi.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContractFieldMetadata extends js.Object {
  
  var dictionaryKeyEnumType: js.UndefOr[ContractEnumMetadata] = js.native
  
  var dictionaryKeyIsDate: js.UndefOr[Boolean] = js.native
  
  var dictionaryValueEnumType: js.UndefOr[ContractEnumMetadata] = js.native
  
  var dictionaryValueFieldInfo: js.UndefOr[ContractFieldMetadata] = js.native
  
  var dictionaryValueIsDate: js.UndefOr[Boolean] = js.native
  
  var dictionaryValueTypeInfo: js.UndefOr[ContractMetadata] = js.native
  
  var enumType: js.UndefOr[ContractEnumMetadata] = js.native
  
  var isArray: js.UndefOr[Boolean] = js.native
  
  var isDate: js.UndefOr[Boolean] = js.native
  
  var isDictionary: js.UndefOr[Boolean] = js.native
  
  var typeInfo: js.UndefOr[ContractMetadata] = js.native
}
object ContractFieldMetadata {
  
  @scala.inline
  def apply(): ContractFieldMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractFieldMetadata]
  }
  
  @scala.inline
  implicit class ContractFieldMetadataOps[Self <: ContractFieldMetadata] (val x: Self) extends AnyVal {
    
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
    def setDictionaryKeyEnumType(value: ContractEnumMetadata): Self = this.set("dictionaryKeyEnumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionaryKeyEnumType: Self = this.set("dictionaryKeyEnumType", js.undefined)
    
    @scala.inline
    def setDictionaryKeyIsDate(value: Boolean): Self = this.set("dictionaryKeyIsDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionaryKeyIsDate: Self = this.set("dictionaryKeyIsDate", js.undefined)
    
    @scala.inline
    def setDictionaryValueEnumType(value: ContractEnumMetadata): Self = this.set("dictionaryValueEnumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionaryValueEnumType: Self = this.set("dictionaryValueEnumType", js.undefined)
    
    @scala.inline
    def setDictionaryValueFieldInfo(value: ContractFieldMetadata): Self = this.set("dictionaryValueFieldInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionaryValueFieldInfo: Self = this.set("dictionaryValueFieldInfo", js.undefined)
    
    @scala.inline
    def setDictionaryValueIsDate(value: Boolean): Self = this.set("dictionaryValueIsDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionaryValueIsDate: Self = this.set("dictionaryValueIsDate", js.undefined)
    
    @scala.inline
    def setDictionaryValueTypeInfo(value: ContractMetadata): Self = this.set("dictionaryValueTypeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionaryValueTypeInfo: Self = this.set("dictionaryValueTypeInfo", js.undefined)
    
    @scala.inline
    def setEnumType(value: ContractEnumMetadata): Self = this.set("enumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumType: Self = this.set("enumType", js.undefined)
    
    @scala.inline
    def setIsArray(value: Boolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArray: Self = this.set("isArray", js.undefined)
    
    @scala.inline
    def setIsDate(value: Boolean): Self = this.set("isDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDate: Self = this.set("isDate", js.undefined)
    
    @scala.inline
    def setIsDictionary(value: Boolean): Self = this.set("isDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDictionary: Self = this.set("isDictionary", js.undefined)
    
    @scala.inline
    def setTypeInfo(value: ContractMetadata): Self = this.set("typeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeInfo: Self = this.set("typeInfo", js.undefined)
  }
}

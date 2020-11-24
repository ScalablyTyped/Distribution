package typings.swaggerSchemaOfficial.anon

import typings.swaggerSchemaOfficial.mod.ParameterCollectionFormat
import typings.swaggerSchemaOfficial.mod.ParameterType
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.file
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.formData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionFormat extends js.Object {
  
  var allowEmptyValue: js.UndefOr[Boolean] = js.native
  
  var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.native
  
  var in: formData = js.native
  
  var `type`: ParameterType | file = js.native
}
object CollectionFormat {
  
  @scala.inline
  def apply(in: formData, `type`: ParameterType | file): CollectionFormat = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFormat]
  }
  
  @scala.inline
  implicit class CollectionFormatOps[Self <: CollectionFormat] (val x: Self) extends AnyVal {
    
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
    def setIn(value: formData): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ParameterType | file): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyValue(value: Boolean): Self = this.set("allowEmptyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmptyValue: Self = this.set("allowEmptyValue", js.undefined)
    
    @scala.inline
    def setCollectionFormat(value: ParameterCollectionFormat): Self = this.set("collectionFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionFormat: Self = this.set("collectionFormat", js.undefined)
  }
}

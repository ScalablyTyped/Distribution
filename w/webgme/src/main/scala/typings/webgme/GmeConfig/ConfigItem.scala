package typings.webgme.GmeConfig

import typings.std.RegExp
import typings.webgme.GmeCommon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigItem extends js.Object {
  
  // a detailed description fo the item
  var description: String = js.native
  
  // a human comprehensible name
  var displayName: String = js.native
  
  // a unique name for the configuration item
  var name: Name = js.native
  
  // can the value be changed?
  var readOnly: js.UndefOr[Boolean] = js.native
  
  // a regular expression limiting the values allowed.
  // e.g. '^[a-zA-Z]+$'
  var regex: js.UndefOr[RegExp] = js.native
  
  // a description of the regex grammar
  // e.g. 'Name can only contain English characters!'
  var regexMessage: js.UndefOr[String] = js.native
  
  // the value of the item: if valueItem is provided it must be one of those values.
  var value: String = js.native
  
  // an enumeration of the allowed values for the value field
  var valueItems: js.UndefOr[js.Array[String]] = js.native
  
  // the datatype of the value: 'string', 'integer', ...
  var valueType: String = js.native
}
object ConfigItem {
  
  @scala.inline
  def apply(description: String, displayName: String, name: Name, value: String, valueType: String): ConfigItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
  
  @scala.inline
  implicit class ConfigItemOps[Self <: ConfigItem] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setRegexMessage(value: String): Self = this.set("regexMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexMessage: Self = this.set("regexMessage", js.undefined)
    
    @scala.inline
    def setValueItemsVarargs(value: String*): Self = this.set("valueItems", js.Array(value :_*))
    
    @scala.inline
    def setValueItems(value: js.Array[String]): Self = this.set("valueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueItems: Self = this.set("valueItems", js.undefined)
  }
}

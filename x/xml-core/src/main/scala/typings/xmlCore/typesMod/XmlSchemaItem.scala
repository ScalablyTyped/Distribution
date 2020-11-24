package typings.xmlCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlSchemaItem[T] extends XmlSchemaItemBase {
  
  /**
    * Custom converter for item value
    *
    * @type {IConverter<T>}
    * @memberOf XmlAttributeType
    */
  var converter: js.UndefOr[IConverter[T]] = js.native
  
  /**
    * Default value for item
    *
    * @type {(T |)}
    * @memberOf XmlSchemaItem
    */
  var defaultValue: js.UndefOr[T | Null] = js.native
  
  /**
    * Determine where item is required
    *
    * @type {boolean}
    * @memberOf XmlSchemaItem
    */
  var required: js.UndefOr[Boolean] = js.native
}
object XmlSchemaItem {
  
  @scala.inline
  def apply[T](): XmlSchemaItem[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlSchemaItem[T]]
  }
  
  @scala.inline
  implicit class XmlSchemaItemOps[Self <: XmlSchemaItem[_], T] (val x: Self with XmlSchemaItem[T]) extends AnyVal {
    
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
    def setConverter(value: IConverter[T]): Self = this.set("converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: T): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}

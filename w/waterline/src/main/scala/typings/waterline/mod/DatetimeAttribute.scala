package typings.waterline.mod

import typings.std.Date
import typings.waterline.waterlineStrings.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined waterline.waterline.BaseAttribute<std.Date> & {  type :'datetime'} */
@js.native
trait DatetimeAttribute extends _Attribute {
  
  var allowNull: js.UndefOr[Boolean] = js.native
  
  var autoCreatedAt: js.UndefOr[Boolean] = js.native
  
  var autoUpdatedAt: js.UndefOr[Boolean] = js.native
  
  var columnName: js.UndefOr[String] = js.native
  
  var defaultsTo: js.UndefOr[Date | DefaultsToFn[Date]] = js.native
  
  var enum: js.UndefOr[js.Array[Date]] = js.native
  
  var index: js.UndefOr[Boolean] = js.native
  
  var primaryKey: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] with datetime = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
  
  var validations: js.UndefOr[AttributeValidations] = js.native
}
object DatetimeAttribute {
  
  @scala.inline
  def apply(`type`: js.UndefOr[String] with datetime): DatetimeAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimeAttribute]
  }
  
  @scala.inline
  implicit class DatetimeAttributeOps[Self <: DatetimeAttribute] (val x: Self) extends AnyVal {
    
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
    def setType(value: js.UndefOr[String] with datetime): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNull(value: Boolean): Self = this.set("allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNull: Self = this.set("allowNull", js.undefined)
    
    @scala.inline
    def setAutoCreatedAt(value: Boolean): Self = this.set("autoCreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreatedAt: Self = this.set("autoCreatedAt", js.undefined)
    
    @scala.inline
    def setAutoUpdatedAt(value: Boolean): Self = this.set("autoUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdatedAt: Self = this.set("autoUpdatedAt", js.undefined)
    
    @scala.inline
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    
    @scala.inline
    def setDefaultsToFunction0(value: () => Date): Self = this.set("defaultsTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultsTo(value: Date | DefaultsToFn[Date]): Self = this.set("defaultsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultsTo: Self = this.set("defaultsTo", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: Date*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[Date]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setIndex(value: Boolean): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setValidations(value: AttributeValidations): Self = this.set("validations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidations: Self = this.set("validations", js.undefined)
  }
}

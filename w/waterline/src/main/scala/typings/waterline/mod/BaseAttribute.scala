package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAttribute[T] extends StObject {
  
  var allowNull: js.UndefOr[Boolean] = js.undefined
  
  var autoCreatedAt: js.UndefOr[Boolean] = js.undefined
  
  var autoUpdatedAt: js.UndefOr[Boolean] = js.undefined
  
  var columnName: js.UndefOr[String] = js.undefined
  
  var defaultsTo: js.UndefOr[T | DefaultsToFn[T]] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[T]] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var unique: js.UndefOr[Boolean] = js.undefined
  
  var validations: js.UndefOr[AttributeValidations] = js.undefined
}
object BaseAttribute {
  
  @scala.inline
  def apply[T](): BaseAttribute[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAttribute[T]]
  }
  
  @scala.inline
  implicit class BaseAttributeMutableBuilder[Self <: BaseAttribute[?], T] (val x: Self & BaseAttribute[T]) extends AnyVal {
    
    @scala.inline
    def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
    
    @scala.inline
    def setAutoCreatedAt(value: Boolean): Self = StObject.set(x, "autoCreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreatedAtUndefined: Self = StObject.set(x, "autoCreatedAt", js.undefined)
    
    @scala.inline
    def setAutoUpdatedAt(value: Boolean): Self = StObject.set(x, "autoUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdatedAtUndefined: Self = StObject.set(x, "autoUpdatedAt", js.undefined)
    
    @scala.inline
    def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    @scala.inline
    def setDefaultsTo(value: T | DefaultsToFn[T]): Self = StObject.set(x, "defaultsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsToFunction0(value: () => T): Self = StObject.set(x, "defaultsTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultsToUndefined: Self = StObject.set(x, "defaultsTo", js.undefined)
    
    @scala.inline
    def setEnum(value: js.Array[T]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: T*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    @scala.inline
    def setValidations(value: AttributeValidations): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}

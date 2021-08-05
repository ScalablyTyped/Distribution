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
  
  inline def apply[T](): BaseAttribute[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAttribute[T]]
  }
  
  extension [Self <: BaseAttribute[?], T](x: Self & BaseAttribute[T]) {
    
    inline def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
    
    inline def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
    
    inline def setAutoCreatedAt(value: Boolean): Self = StObject.set(x, "autoCreatedAt", value.asInstanceOf[js.Any])
    
    inline def setAutoCreatedAtUndefined: Self = StObject.set(x, "autoCreatedAt", js.undefined)
    
    inline def setAutoUpdatedAt(value: Boolean): Self = StObject.set(x, "autoUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdatedAtUndefined: Self = StObject.set(x, "autoUpdatedAt", js.undefined)
    
    inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    inline def setDefaultsTo(value: T | DefaultsToFn[T]): Self = StObject.set(x, "defaultsTo", value.asInstanceOf[js.Any])
    
    inline def setDefaultsToFunction0(value: () => T): Self = StObject.set(x, "defaultsTo", js.Any.fromFunction0(value))
    
    inline def setDefaultsToUndefined: Self = StObject.set(x, "defaultsTo", js.undefined)
    
    inline def setEnum(value: js.Array[T]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: T*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    inline def setValidations(value: AttributeValidations): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}

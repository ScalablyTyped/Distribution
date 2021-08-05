package typings.typeorm

import typings.typeorm.optionsValueTransformerMod.ValueTransformer
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsColumnCommonOptionsMod {
  
  trait ColumnCommonOptions extends StObject {
    
    /**
      * Default database value.
      * Note that default value is not supported when column type is 'json' of mysql.
      */
    var default: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Indicates if this column is an array.
      * Can be simply set to true or array length can be specified.
      * Supported only by postgres.
      */
    var array: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column comment. Not supported by all database types.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies if this column will use auto increment (sequence, generated identity, rowid).
      * Note that in some databases only one column in entity can be marked as generated, and it must be a primary column.
      */
    var generated: js.UndefOr[Boolean | increment | uuid | rowid] = js.undefined
    
    /**
      * Column name in the database.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if column's value can be set to NULL.
      */
    var nullable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ON UPDATE trigger. Works only for MySQL.
      */
    var onUpdate: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if this column is a primary key.
      * Same can be achieved when @PrimaryColumn decorator is used.
      */
    var primary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if column is always selected by QueryBuilder and find operations.
      * Default value is "true".
      */
    var select: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a value transformer that is to be used to (un)marshal
      * this column when reading or writing to the database.
      */
    var transformer: js.UndefOr[ValueTransformer | js.Array[ValueTransformer]] = js.undefined
    
    /**
      * Specifies if column's value must be unique or not.
      */
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnCommonOptions {
    
    inline def apply(): ColumnCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnCommonOptions]
    }
    
    extension [Self <: ColumnCommonOptions](x: Self) {
      
      inline def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setGenerated(value: Boolean | increment | uuid | rowid): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setGeneratedUndefined: Self = StObject.set(x, "generated", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      inline def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTransformer(value: ValueTransformer | js.Array[ValueTransformer]): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      
      inline def setTransformerVarargs(value: ValueTransformer*): Self = StObject.set(x, "transformer", js.Array(value :_*))
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
}

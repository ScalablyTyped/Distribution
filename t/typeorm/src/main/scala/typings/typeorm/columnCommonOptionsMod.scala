package typings.typeorm

import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import typings.typeorm.valueTransformerMod.ValueTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnCommonOptionsMod {
  
  @js.native
  trait ColumnCommonOptions extends StObject {
    
    /**
      * Default database value.
      * Note that default value is not supported when column type is 'json' of mysql.
      */
    var default: js.UndefOr[js.Any] = js.native
    
    /**
      * Indicates if this column is an array.
      * Can be simply set to true or array length can be specified.
      * Supported only by postgres.
      */
    var array: js.UndefOr[Boolean] = js.native
    
    /**
      * Column comment. Not supported by all database types.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * Specifies if this column will use auto increment (sequence, generated identity, rowid).
      * Note that in some databases only one column in entity can be marked as generated, and it must be a primary column.
      */
    var generated: js.UndefOr[Boolean | increment | uuid | rowid] = js.native
    
    /**
      * Column name in the database.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Indicates if column's value can be set to NULL.
      */
    var nullable: js.UndefOr[Boolean] = js.native
    
    /**
      * ON UPDATE trigger. Works only for MySQL.
      */
    var onUpdate: js.UndefOr[String] = js.native
    
    /**
      * Indicates if this column is a primary key.
      * Same can be achieved when @PrimaryColumn decorator is used.
      */
    var primary: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if column is always selected by QueryBuilder and find operations.
      * Default value is "true".
      */
    var select: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies a value transformer that is to be used to (un)marshal
      * this column when reading or writing to the database.
      */
    var transformer: js.UndefOr[ValueTransformer | js.Array[ValueTransformer]] = js.native
    
    /**
      * Specifies if column's value must be unique or not.
      */
    var unique: js.UndefOr[Boolean] = js.native
  }
  object ColumnCommonOptions {
    
    @scala.inline
    def apply(): ColumnCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnCommonOptions]
    }
    
    @scala.inline
    implicit class ColumnCommonOptionsMutableBuilder[Self <: ColumnCommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setGenerated(value: Boolean | increment | uuid | rowid): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedUndefined: Self = StObject.set(x, "generated", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setTransformer(value: ValueTransformer | js.Array[ValueTransformer]): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      
      @scala.inline
      def setTransformerVarargs(value: ValueTransformer*): Self = StObject.set(x, "transformer", js.Array(value :_*))
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
}

package typings.typeorm

import typings.typeorm.columnTypesMod.ColumnType
import typings.typeorm.spatialColumnOptionsMod.SpatialColumnOptions
import typings.typeorm.typeormBooleans.`true`
import typings.typeorm.typeormStrings.STORED
import typings.typeorm.typeormStrings.VIRTUAL
import typings.typeorm.typeormStrings.`object`
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.string
import typings.typeorm.typeormStrings.uuid
import typings.typeorm.valueTransformerMod.ValueTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySchemaColumnOptionsMod {
  
  trait EntitySchemaColumnOptions
    extends StObject
       with SpatialColumnOptions {
    
    /**
      * Default database value.
      */
    var default: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Indicates if this column is an array.
      * Can be simply set to true or array length can be specified.
      * Supported only by postgres.
      */
    var array: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generated column expression. Supports only in MySQL.
      */
    var asExpression: js.UndefOr[String] = js.undefined
    
    /**
      * Defines a column character set.
      * Not supported by all database types.
      */
    var charset: js.UndefOr[String] = js.undefined
    
    /**
      * Defines a column collation.
      */
    var collation: js.UndefOr[String] = js.undefined
    
    /**
      * Extra column definition. Should be used only in emergency situations. Note that if you'll use this property
      * auto schema generation will not work properly anymore. Avoid using it.
      */
    var columnDefinition: js.UndefOr[String] = js.undefined
    
    /**
      * Column comment.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if this column is a created date column.
      */
    var createDate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this column is a delete date column.
      */
    var deleteDate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of possible enumerated values.
      */
    var `enum`: js.UndefOr[js.Array[js.Any] | js.Object] = js.undefined
    
    /**
      * Specifies if this column will use AUTO_INCREMENT or not (e.g. generated number).
      */
    var generated: js.UndefOr[`true` | increment | uuid | rowid] = js.undefined
    
    /**
      * Generated column type. Supports only in MySQL.
      */
    var generatedType: js.UndefOr[VIRTUAL | STORED] = js.undefined
    
    /**
      * Return type of HSTORE column.
      * Returns value as string or as object.
      */
    var hstoreType: js.UndefOr[`object` | string] = js.undefined
    
    /**
      * Indicates if column is inserted by default.
      * Default value is "true".
      */
    var insert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column type's length. For example type = "string" and length = 100 means that ORM will create a column with
      * type varchar(100).
      */
    var length: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Column name in the database.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if column's value can be set to NULL.
      */
    var nullable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this column is of type ObjectID
      */
    var objectId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ON UPDATE trigger. Works only for MySQL.
      */
    var onUpdate: js.UndefOr[String] = js.undefined
    
    /**
      * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
      * number of digits that are stored for the values.
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates if this column is a primary column.
      */
    var primary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if column value is not updated by "save" operation.
      * It means you'll be able to write this value only when you first time insert the object.
      * Default value is "false".
      *
      * @deprecated Please use the `update` option instead.  Careful, it takes
      * the opposite value to readonly.
      *
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The scale for a decimal (exact numeric) column (applies only for decimal column), which represents the number
      * of digits to the right of the decimal point and must not be greater than precision.
      */
    var scale: js.UndefOr[Double] = js.undefined
    
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
      * Indicates if this column is a treeChildrenCount column.
      */
    var treeChildrenCount: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this column is a treeLevel column.
      */
    var treeLevel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column type. Must be one of the value from the ColumnTypes class.
      */
    var `type`: ColumnType
    
    /**
      * Specifies if column's value must be unique or not.
      */
    var unique: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if column value is updated by "save" operation.
      * If false you'll be able to write this value only when you first time insert the object.
      * Default value is "true".
      */
    var update: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this column is an update date column.
      */
    var updateDate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if this column is a version column.
      */
    var version: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column type's display width. Used only on some column types in MySQL.
      * For example, INT(4) specifies an INT with a display width of four digits.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to the column
      */
    var zerofill: js.UndefOr[Boolean] = js.undefined
  }
  object EntitySchemaColumnOptions {
    
    @scala.inline
    def apply(`type`: ColumnType): EntitySchemaColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntitySchemaColumnOptions]
    }
    
    @scala.inline
    implicit class EntitySchemaColumnOptionsMutableBuilder[Self <: EntitySchemaColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setAsExpression(value: String): Self = StObject.set(x, "asExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsExpressionUndefined: Self = StObject.set(x, "asExpression", js.undefined)
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      @scala.inline
      def setColumnDefinition(value: String): Self = StObject.set(x, "columnDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDefinitionUndefined: Self = StObject.set(x, "columnDefinition", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCreateDate(value: Boolean): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDateUndefined: Self = StObject.set(x, "createDate", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDeleteDate(value: Boolean): Self = StObject.set(x, "deleteDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteDateUndefined: Self = StObject.set(x, "deleteDate", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[js.Any] | js.Object): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setGenerated(value: `true` | increment | uuid | rowid): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedType(value: VIRTUAL | STORED): Self = StObject.set(x, "generatedType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedTypeUndefined: Self = StObject.set(x, "generatedType", js.undefined)
      
      @scala.inline
      def setGeneratedUndefined: Self = StObject.set(x, "generated", js.undefined)
      
      @scala.inline
      def setHstoreType(value: `object` | string): Self = StObject.set(x, "hstoreType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHstoreTypeUndefined: Self = StObject.set(x, "hstoreType", js.undefined)
      
      @scala.inline
      def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setLength(value: String | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      @scala.inline
      def setObjectId(value: Boolean): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
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
      def setTreeChildrenCount(value: Boolean): Self = StObject.set(x, "treeChildrenCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeChildrenCountUndefined: Self = StObject.set(x, "treeChildrenCount", js.undefined)
      
      @scala.inline
      def setTreeLevel(value: Boolean): Self = StObject.set(x, "treeLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLevelUndefined: Self = StObject.set(x, "treeLevel", js.undefined)
      
      @scala.inline
      def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      @scala.inline
      def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      @scala.inline
      def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDate(value: Boolean): Self = StObject.set(x, "updateDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDateUndefined: Self = StObject.set(x, "updateDate", js.undefined)
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZerofillUndefined: Self = StObject.set(x, "zerofill", js.undefined)
    }
  }
}

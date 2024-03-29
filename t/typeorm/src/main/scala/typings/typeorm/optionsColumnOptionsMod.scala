package typings.typeorm

import typings.typeorm.optionsColumnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.typeormStrings.STORED
import typings.typeorm.typeormStrings.VIRTUAL
import typings.typeorm.typeormStrings.`object`
import typings.typeorm.typeormStrings.string
import typings.typeorm.typesColumnTypesMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsColumnOptionsMod {
  
  trait ColumnOptions
    extends StObject
       with ColumnCommonOptions {
    
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
      * Array of possible enumerated values.
      */
    var `enum`: js.UndefOr[(js.Array[String | Double]) | js.Object] = js.undefined
    
    /**
      * Exact name of enum
      */
    var enumName: js.UndefOr[String] = js.undefined
    
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
      * Column type's length. Used only on some column types.
      * For example type = "string" and length = "100" means that ORM will create a column with type varchar(100).
      */
    var length: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
      * number of digits that are stored for the values.
      */
    var precision: js.UndefOr[Double | Null] = js.undefined
    
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
      * Spatial Feature Type (Geometry, Point, Polygon, etc.)
      */
    var spatialFeatureType: js.UndefOr[String] = js.undefined
    
    /**
      * SRID (Spatial Reference ID (EPSG code))
      */
    var srid: js.UndefOr[Double] = js.undefined
    
    /**
      * Column type. Must be one of the value from the ColumnTypes class.
      */
    var `type`: js.UndefOr[ColumnType] = js.undefined
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if column value is updated by "save" operation.
      * If false, you'll be able to write this value only when you first time insert the object.
      * Default value is "true".
      */
    var update: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column type's display width. Used only on some column types in MySQL.
      * For example, INT(4) specifies an INT with a display width of four digits.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to this column
      */
    var zerofill: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnOptions {
    
    inline def apply(): ColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnOptions]
    }
    
    extension [Self <: ColumnOptions](x: Self) {
      
      inline def setAsExpression(value: String): Self = StObject.set(x, "asExpression", value.asInstanceOf[js.Any])
      
      inline def setAsExpressionUndefined: Self = StObject.set(x, "asExpression", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      inline def setEnum(value: (js.Array[String | Double]) | js.Object): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumName(value: String): Self = StObject.set(x, "enumName", value.asInstanceOf[js.Any])
      
      inline def setEnumNameUndefined: Self = StObject.set(x, "enumName", js.undefined)
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: (String | Double)*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      inline def setGeneratedType(value: VIRTUAL | STORED): Self = StObject.set(x, "generatedType", value.asInstanceOf[js.Any])
      
      inline def setGeneratedTypeUndefined: Self = StObject.set(x, "generatedType", js.undefined)
      
      inline def setHstoreType(value: `object` | string): Self = StObject.set(x, "hstoreType", value.asInstanceOf[js.Any])
      
      inline def setHstoreTypeUndefined: Self = StObject.set(x, "hstoreType", js.undefined)
      
      inline def setInsert(value: Boolean): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setLength(value: String | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSpatialFeatureType(value: String): Self = StObject.set(x, "spatialFeatureType", value.asInstanceOf[js.Any])
      
      inline def setSpatialFeatureTypeUndefined: Self = StObject.set(x, "spatialFeatureType", js.undefined)
      
      inline def setSrid(value: Double): Self = StObject.set(x, "srid", value.asInstanceOf[js.Any])
      
      inline def setSridUndefined: Self = StObject.set(x, "srid", js.undefined)
      
      inline def setType(value: ColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
      
      inline def setZerofillUndefined: Self = StObject.set(x, "zerofill", js.undefined)
    }
  }
}

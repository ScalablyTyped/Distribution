package typings.typeorm

import typings.typeorm.typeormStrings.STORED
import typings.typeorm.typeormStrings.VIRTUAL
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableColumnOptionsMod {
  
  trait TableColumnOptions extends StObject {
    
    /**
      * Column's default value.
      */
    var default: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Generated column expression. Supports only in MySQL.
      */
    var asExpression: js.UndefOr[String] = js.undefined
    
    /**
      * Defines column character set.
      */
    var charset: js.UndefOr[String] = js.undefined
    
    /**
      * Defines column collation.
      */
    var collation: js.UndefOr[String] = js.undefined
    
    /**
      * Column's comment.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Array of possible enumerated values.
      */
    var `enum`: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Exact name of enum
      */
    var enumName: js.UndefOr[String] = js.undefined
    
    /**
      * Generated column type. Supports only in MySQL.
      */
    var generatedType: js.UndefOr[VIRTUAL | STORED] = js.undefined
    
    /**
      * Specifies generation strategy if this column will use auto increment.
      */
    var generationStrategy: js.UndefOr[uuid | increment | rowid] = js.undefined
    
    /**
      * Indicates if column stores array.
      */
    var isArray: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if column is auto-generated sequence.
      */
    var isGenerated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if column is NULL, or is NOT NULL in the database.
      */
    var isNullable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if column is a primary key.
      */
    var isPrimary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if column has unique value.
      */
    var isUnique: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column type's length. Used only on some column types.
      * For example type = "string" and length = "100" means that ORM will create a column with type varchar(100).
      */
    var length: js.UndefOr[String] = js.undefined
    
    /**
      * Column name.
      */
    var name: String
    
    /**
      * ON UPDATE trigger. Works only for MySQL.
      */
    var onUpdate: js.UndefOr[String] = js.undefined
    
    /**
      * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
      * number of digits that are stored for the values.
      */
    var precision: js.UndefOr[Double | Null] = js.undefined
    
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
      * Column type.
      */
    var `type`: String
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: js.UndefOr[Boolean] = js.undefined
    
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
  object TableColumnOptions {
    
    inline def apply(name: String, `type`: String): TableColumnOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableColumnOptions]
    }
    
    extension [Self <: TableColumnOptions](x: Self) {
      
      inline def setAsExpression(value: String): Self = StObject.set(x, "asExpression", value.asInstanceOf[js.Any])
      
      inline def setAsExpressionUndefined: Self = StObject.set(x, "asExpression", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumName(value: String): Self = StObject.set(x, "enumName", value.asInstanceOf[js.Any])
      
      inline def setEnumNameUndefined: Self = StObject.set(x, "enumName", js.undefined)
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      inline def setGeneratedType(value: VIRTUAL | STORED): Self = StObject.set(x, "generatedType", value.asInstanceOf[js.Any])
      
      inline def setGeneratedTypeUndefined: Self = StObject.set(x, "generatedType", js.undefined)
      
      inline def setGenerationStrategy(value: uuid | increment | rowid): Self = StObject.set(x, "generationStrategy", value.asInstanceOf[js.Any])
      
      inline def setGenerationStrategyUndefined: Self = StObject.set(x, "generationStrategy", js.undefined)
      
      inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      inline def setIsGenerated(value: Boolean): Self = StObject.set(x, "isGenerated", value.asInstanceOf[js.Any])
      
      inline def setIsGeneratedUndefined: Self = StObject.set(x, "isGenerated", js.undefined)
      
      inline def setIsNullable(value: Boolean): Self = StObject.set(x, "isNullable", value.asInstanceOf[js.Any])
      
      inline def setIsNullableUndefined: Self = StObject.set(x, "isNullable", js.undefined)
      
      inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
      
      inline def setIsUnique(value: Boolean): Self = StObject.set(x, "isUnique", value.asInstanceOf[js.Any])
      
      inline def setIsUniqueUndefined: Self = StObject.set(x, "isUnique", js.undefined)
      
      inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSpatialFeatureType(value: String): Self = StObject.set(x, "spatialFeatureType", value.asInstanceOf[js.Any])
      
      inline def setSpatialFeatureTypeUndefined: Self = StObject.set(x, "spatialFeatureType", js.undefined)
      
      inline def setSrid(value: Double): Self = StObject.set(x, "srid", value.asInstanceOf[js.Any])
      
      inline def setSridUndefined: Self = StObject.set(x, "srid", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZerofill(value: Boolean): Self = StObject.set(x, "zerofill", value.asInstanceOf[js.Any])
      
      inline def setZerofillUndefined: Self = StObject.set(x, "zerofill", js.undefined)
    }
  }
}

package typings.typeorm

import typings.typeorm.optionsTableColumnOptionsMod.TableColumnOptions
import typings.typeorm.typeormStrings.STORED
import typings.typeorm.typeormStrings.VIRTUAL
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableColumnMod {
  
  @JSImport("typeorm/schema-builder/table/TableColumn", "TableColumn")
  @js.native
  class TableColumn () extends StObject {
    def this(options: TableColumnOptions) = this()
    
    /**
      * Column's default value.
      */
    var default: js.UndefOr[js.Any] = js.native
    
    /**
      * Generated column expression. Supports only in MySQL.
      */
    var asExpression: js.UndefOr[String] = js.native
    
    /**
      * Defines column character set.
      */
    var charset: js.UndefOr[String] = js.native
    
    /**
      * Defines column collation.
      */
    var collation: js.UndefOr[String] = js.native
    
    /**
      * Column's comment.
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * Array of possible enumerated values.
      */
    var enum: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Exact name of enum
      */
    var enumName: js.UndefOr[String] = js.native
    
    /**
      * Generated column type. Supports only in MySQL.
      */
    var generatedType: js.UndefOr[VIRTUAL | STORED] = js.native
    
    /**
      * Specifies generation strategy if this column will use auto increment.
      * `rowid` option supported only in CockroachDB.
      */
    var generationStrategy: js.UndefOr[uuid | increment | rowid] = js.native
    
    /**
      * Indicates if column stores array.
      */
    var isArray: Boolean = js.native
    
    /**
      * Indicates if column is auto-generated sequence.
      */
    var isGenerated: Boolean = js.native
    
    /**
      * Indicates if column is NULL, or is NOT NULL in the database.
      */
    var isNullable: Boolean = js.native
    
    /**
      * Indicates if column is a primary key.
      */
    var isPrimary: Boolean = js.native
    
    /**
      * Indicates if column has unique value.
      */
    var isUnique: Boolean = js.native
    
    /**
      * Column type's length. Used only on some column types.
      * For example type = "string" and length = "100" means that ORM will create a column with type varchar(100).
      */
    var length: String = js.native
    
    /**
      * Column name.
      */
    var name: String = js.native
    
    /**
      * ON UPDATE trigger. Works only for MySQL.
      */
    var onUpdate: js.UndefOr[String] = js.native
    
    /**
      * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
      * number of digits that are stored for the values.
      */
    var precision: js.UndefOr[Double | Null] = js.native
    
    /**
      * The scale for a decimal (exact numeric) column (applies only for decimal column), which represents the number
      * of digits to the right of the decimal point and must not be greater than precision.
      */
    var scale: js.UndefOr[Double] = js.native
    
    /**
      * Spatial Feature Type (Geometry, Point, Polygon, etc.)
      */
    var spatialFeatureType: js.UndefOr[String] = js.native
    
    /**
      * SRID (Spatial Reference ID (EPSG code))
      */
    var srid: js.UndefOr[Double] = js.native
    
    /**
      * Column type.
      */
    var `type`: String = js.native
    
    /**
      * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
      */
    var unsigned: Boolean = js.native
    
    /**
      * Column type's display width. Used only on some column types in MySQL.
      * For example, INT(4) specifies an INT with a display width of four digits.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
      * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to the column
      */
    var zerofill: Boolean = js.native
  }
}

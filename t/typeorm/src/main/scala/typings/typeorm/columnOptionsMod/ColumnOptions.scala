package typings.typeorm.columnOptionsMod

import typings.typeorm.columnCommonOptionsMod.ColumnCommonOptions
import typings.typeorm.columnTypesMod.ColumnType
import typings.typeorm.typeormStrings.STORED
import typings.typeorm.typeormStrings.VIRTUAL
import typings.typeorm.typeormStrings.`object`
import typings.typeorm.typeormStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnOptions extends ColumnCommonOptions {
  
  /**
    * Generated column expression. Supports only in MySQL.
    */
  var asExpression: js.UndefOr[String] = js.native
  
  /**
    * Defines a column character set.
    * Not supported by all database types.
    */
  var charset: js.UndefOr[String] = js.native
  
  /**
    * Defines a column collation.
    */
  var collation: js.UndefOr[String] = js.native
  
  /**
    * Array of possible enumerated values.
    */
  var enum: js.UndefOr[(js.Array[String | Double]) | js.Object] = js.native
  
  /**
    * Exact name of enum
    */
  var enumName: js.UndefOr[String] = js.native
  
  /**
    * Generated column type. Supports only in MySQL.
    */
  var generatedType: js.UndefOr[VIRTUAL | STORED] = js.native
  
  /**
    * Return type of HSTORE column.
    * Returns value as string or as object.
    */
  var hstoreType: js.UndefOr[`object` | string] = js.native
  
  /**
    * Indicates if column is inserted by default.
    * Default value is "true".
    */
  var insert: js.UndefOr[Boolean] = js.native
  
  /**
    * Column type's length. Used only on some column types.
    * For example type = "string" and length = "100" means that ORM will create a column with type varchar(100).
    */
  var length: js.UndefOr[String | Double] = js.native
  
  /**
    * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
    * number of digits that are stored for the values.
    */
  var precision: js.UndefOr[Double | Null] = js.native
  
  /**
    * Indicates if column value is not updated by "save" operation.
    * It means you'll be able to write this value only when you first time insert the object.
    * Default value is "false".
    *
    * @deprecated Please use the `update` option instead.  Careful, it takes
    * the opposite value to readonly.
    *
    */
  var readonly: js.UndefOr[Boolean] = js.native
  
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
    * Column type. Must be one of the value from the ColumnTypes class.
    */
  var `type`: js.UndefOr[ColumnType] = js.native
  
  /**
    * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
    */
  var unsigned: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if column value is updated by "save" operation.
    * If false, you'll be able to write this value only when you first time insert the object.
    * Default value is "true".
    */
  var update: js.UndefOr[Boolean] = js.native
  
  /**
    * Column type's display width. Used only on some column types in MySQL.
    * For example, INT(4) specifies an INT with a display width of four digits.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
    * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to this column
    */
  var zerofill: js.UndefOr[Boolean] = js.native
}
object ColumnOptions {
  
  @scala.inline
  def apply(): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnOptions]
  }
  
  @scala.inline
  implicit class ColumnOptionsOps[Self <: ColumnOptions] (val x: Self) extends AnyVal {
    
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
    def setAsExpression(value: String): Self = this.set("asExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsExpression: Self = this.set("asExpression", js.undefined)
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setCollation(value: String): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: (String | Double)*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: (js.Array[String | Double]) | js.Object): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setEnumName(value: String): Self = this.set("enumName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumName: Self = this.set("enumName", js.undefined)
    
    @scala.inline
    def setGeneratedType(value: VIRTUAL | STORED): Self = this.set("generatedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratedType: Self = this.set("generatedType", js.undefined)
    
    @scala.inline
    def setHstoreType(value: `object` | string): Self = this.set("hstoreType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHstoreType: Self = this.set("hstoreType", js.undefined)
    
    @scala.inline
    def setInsert(value: Boolean): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setLength(value: String | Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPrecisionNull: Self = this.set("precision", null)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSpatialFeatureType(value: String): Self = this.set("spatialFeatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialFeatureType: Self = this.set("spatialFeatureType", js.undefined)
    
    @scala.inline
    def setSrid(value: Double): Self = this.set("srid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrid: Self = this.set("srid", js.undefined)
    
    @scala.inline
    def setType(value: ColumnType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnsigned(value: Boolean): Self = this.set("unsigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsigned: Self = this.set("unsigned", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZerofill(value: Boolean): Self = this.set("zerofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZerofill: Self = this.set("zerofill", js.undefined)
  }
}

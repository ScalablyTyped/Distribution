package typings.typeorm.optionsTableColumnOptionsMod

import typings.typeorm.typeormStrings.STORED
import typings.typeorm.typeormStrings.VIRTUAL
import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableColumnOptions extends js.Object {
  
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
    * Column's default value.
    */
  var default: js.UndefOr[js.Any] = js.native
  
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
    */
  var generationStrategy: js.UndefOr[uuid | increment | rowid] = js.native
  
  /**
    * Indicates if column stores array.
    */
  var isArray: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if column is auto-generated sequence.
    */
  var isGenerated: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if column is NULL, or is NOT NULL in the database.
    */
  var isNullable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if column is a primary key.
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if column has unique value.
    */
  var isUnique: js.UndefOr[Boolean] = js.native
  
  /**
    * Column type's length. Used only on some column types.
    * For example type = "string" and length = "100" means that ORM will create a column with type varchar(100).
    */
  var length: js.UndefOr[String] = js.native
  
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
  var unsigned: js.UndefOr[Boolean] = js.native
  
  /**
    * Column type's display width. Used only on some column types in MySQL.
    * For example, INT(4) specifies an INT with a display width of four digits.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
    * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to the column
    */
  var zerofill: js.UndefOr[Boolean] = js.native
}
object TableColumnOptions {
  
  @scala.inline
  def apply(name: String, `type`: String): TableColumnOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnOptions]
  }
  
  @scala.inline
  implicit class TableColumnOptionsOps[Self <: TableColumnOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
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
    def setGenerationStrategy(value: uuid | increment | rowid): Self = this.set("generationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerationStrategy: Self = this.set("generationStrategy", js.undefined)
    
    @scala.inline
    def setIsArray(value: Boolean): Self = this.set("isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArray: Self = this.set("isArray", js.undefined)
    
    @scala.inline
    def setIsGenerated(value: Boolean): Self = this.set("isGenerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGenerated: Self = this.set("isGenerated", js.undefined)
    
    @scala.inline
    def setIsNullable(value: Boolean): Self = this.set("isNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNullable: Self = this.set("isNullable", js.undefined)
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrimary: Self = this.set("isPrimary", js.undefined)
    
    @scala.inline
    def setIsUnique(value: Boolean): Self = this.set("isUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUnique: Self = this.set("isUnique", js.undefined)
    
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: String): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPrecisionNull: Self = this.set("precision", null)
    
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
    def setUnsigned(value: Boolean): Self = this.set("unsigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsigned: Self = this.set("unsigned", js.undefined)
    
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

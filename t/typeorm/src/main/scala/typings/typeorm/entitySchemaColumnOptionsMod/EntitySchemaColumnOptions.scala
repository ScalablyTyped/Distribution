package typings.typeorm.entitySchemaColumnOptionsMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySchemaColumnOptions extends SpatialColumnOptions {
  
  /**
    * Indicates if this column is an array.
    * Can be simply set to true or array length can be specified.
    * Supported only by postgres.
    */
  var array: js.UndefOr[Boolean] = js.native
  
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
    * Extra column definition. Should be used only in emergency situations. Note that if you'll use this property
    * auto schema generation will not work properly anymore. Avoid using it.
    */
  var columnDefinition: js.UndefOr[String] = js.native
  
  /**
    * Column comment.
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Indicates if this column is a created date column.
    */
  var createDate: js.UndefOr[Boolean] = js.native
  
  /**
    * Default database value.
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates if this column is a delete date column.
    */
  var deleteDate: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of possible enumerated values.
    */
  var enum: js.UndefOr[js.Array[_] | js.Object] = js.native
  
  /**
    * Specifies if this column will use AUTO_INCREMENT or not (e.g. generated number).
    */
  var generated: js.UndefOr[`true` | increment | uuid | rowid] = js.native
  
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
    * Column type's length. For example type = "string" and length = 100 means that ORM will create a column with
    * type varchar(100).
    */
  var length: js.UndefOr[String | Double] = js.native
  
  /**
    * Column name in the database.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Indicates if column's value can be set to NULL.
    */
  var nullable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this column is of type ObjectID
    */
  var objectId: js.UndefOr[Boolean] = js.native
  
  /**
    * ON UPDATE trigger. Works only for MySQL.
    */
  var onUpdate: js.UndefOr[String] = js.native
  
  /**
    * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
    * number of digits that are stored for the values.
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Indicates if this column is a primary column.
    */
  var primary: js.UndefOr[Boolean] = js.native
  
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
    * Indicates if this column is a treeChildrenCount column.
    */
  var treeChildrenCount: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this column is a treeLevel column.
    */
  var treeLevel: js.UndefOr[Boolean] = js.native
  
  /**
    * Column type. Must be one of the value from the ColumnTypes class.
    */
  var `type`: ColumnType = js.native
  
  /**
    * Specifies if column's value must be unique or not.
    */
  var unique: js.UndefOr[Boolean] = js.native
  
  /**
    * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
    */
  var unsigned: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if column value is updated by "save" operation.
    * If false you'll be able to write this value only when you first time insert the object.
    * Default value is "true".
    */
  var update: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this column is an update date column.
    */
  var updateDate: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this column is a version column.
    */
  var version: js.UndefOr[Boolean] = js.native
  
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
object EntitySchemaColumnOptions {
  
  @scala.inline
  def apply(`type`: ColumnType): EntitySchemaColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySchemaColumnOptions]
  }
  
  @scala.inline
  implicit class EntitySchemaColumnOptionsOps[Self <: EntitySchemaColumnOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: ColumnType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
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
    def setColumnDefinition(value: String): Self = this.set("columnDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnDefinition: Self = this.set("columnDefinition", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCreateDate(value: Boolean): Self = this.set("createDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("createDate", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDeleteDate(value: Boolean): Self = this.set("deleteDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteDate: Self = this.set("deleteDate", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[_] | js.Object): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setGenerated(value: `true` | increment | uuid | rowid): Self = this.set("generated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerated: Self = this.set("generated", js.undefined)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    
    @scala.inline
    def setObjectId(value: Boolean): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: String): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setTransformerVarargs(value: ValueTransformer*): Self = this.set("transformer", js.Array(value :_*))
    
    @scala.inline
    def setTransformer(value: ValueTransformer | js.Array[ValueTransformer]): Self = this.set("transformer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformer: Self = this.set("transformer", js.undefined)
    
    @scala.inline
    def setTreeChildrenCount(value: Boolean): Self = this.set("treeChildrenCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeChildrenCount: Self = this.set("treeChildrenCount", js.undefined)
    
    @scala.inline
    def setTreeLevel(value: Boolean): Self = this.set("treeLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeLevel: Self = this.set("treeLevel", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setUnsigned(value: Boolean): Self = this.set("unsigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsigned: Self = this.set("unsigned", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUpdateDate(value: Boolean): Self = this.set("updateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDate: Self = this.set("updateDate", js.undefined)
    
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
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

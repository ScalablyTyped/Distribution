package typings.typeorm.columnCommonOptionsMod

import typings.typeorm.typeormStrings.increment
import typings.typeorm.typeormStrings.rowid
import typings.typeorm.typeormStrings.uuid
import typings.typeorm.valueTransformerMod.ValueTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnCommonOptions extends js.Object {
  
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
    * Default database value.
    * Note that default value is not supported when column type is 'json' of mysql.
    */
  var default: js.UndefOr[js.Any] = js.native
  
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
  implicit class ColumnCommonOptionsOps[Self <: ColumnCommonOptions] (val x: Self) extends AnyVal {
    
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
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setGenerated(value: Boolean | increment | uuid | rowid): Self = this.set("generated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerated: Self = this.set("generated", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: String): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
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
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}

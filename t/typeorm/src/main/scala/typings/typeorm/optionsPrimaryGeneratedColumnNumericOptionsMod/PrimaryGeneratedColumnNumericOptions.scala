package typings.typeorm.optionsPrimaryGeneratedColumnNumericOptionsMod

import typings.typeorm.typesColumnTypesMod.PrimaryGeneratedColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryGeneratedColumnNumericOptions extends js.Object {
  
  /**
    * Column comment. Not supported by all database types.
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Column name in the database.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Column type. Must be one of the value from the ColumnTypes class.
    */
  var `type`: js.UndefOr[PrimaryGeneratedColumnType] = js.native
  
  /**
    * Puts UNSIGNED attribute on to numeric column. Works only for MySQL.
    */
  var unsigned: js.UndefOr[Boolean] = js.native
  
  /**
    * Puts ZEROFILL attribute on to numeric column. Works only for MySQL.
    * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to the column
    */
  var zerofill: js.UndefOr[Boolean] = js.native
}
object PrimaryGeneratedColumnNumericOptions {
  
  @scala.inline
  def apply(): PrimaryGeneratedColumnNumericOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryGeneratedColumnNumericOptions]
  }
  
  @scala.inline
  implicit class PrimaryGeneratedColumnNumericOptionsOps[Self <: PrimaryGeneratedColumnNumericOptions] (val x: Self) extends AnyVal {
    
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: PrimaryGeneratedColumnType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnsigned(value: Boolean): Self = this.set("unsigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsigned: Self = this.set("unsigned", js.undefined)
    
    @scala.inline
    def setZerofill(value: Boolean): Self = this.set("zerofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZerofill: Self = this.set("zerofill", js.undefined)
  }
}

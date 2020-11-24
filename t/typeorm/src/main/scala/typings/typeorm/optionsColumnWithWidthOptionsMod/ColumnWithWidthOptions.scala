package typings.typeorm.optionsColumnWithWidthOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnWithWidthOptions extends js.Object {
  
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
    * If you specify ZEROFILL for a numeric column, MySQL automatically adds the UNSIGNED attribute to this column
    */
  var zerofill: js.UndefOr[Boolean] = js.native
}
object ColumnWithWidthOptions {
  
  @scala.inline
  def apply(): ColumnWithWidthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnWithWidthOptions]
  }
  
  @scala.inline
  implicit class ColumnWithWidthOptionsOps[Self <: ColumnWithWidthOptions] (val x: Self) extends AnyVal {
    
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

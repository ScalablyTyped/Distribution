package typings.typeorm.columnNumericOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnNumericOptions extends js.Object {
  
  /**
    * The precision for a decimal (exact numeric) column (applies only for decimal column), which is the maximum
    * number of digits that are stored for the values.
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * The scale for a decimal (exact numeric) column (applies only for decimal column), which represents the number
    * of digits to the right of the decimal point and must not be greater than precision.
    */
  var scale: js.UndefOr[Double] = js.native
  
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
object ColumnNumericOptions {
  
  @scala.inline
  def apply(): ColumnNumericOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnNumericOptions]
  }
  
  @scala.inline
  implicit class ColumnNumericOptionsOps[Self <: ColumnNumericOptions] (val x: Self) extends AnyVal {
    
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
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
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

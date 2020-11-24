package typings.typeorm.columnWithLengthOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnWithLengthOptions extends js.Object {
  
  /**
    * Column type's length.
    * For example type = "varchar" and length = "100" means ORM will create a column with type varchar(100).
    */
  var length: js.UndefOr[String | Double] = js.native
}
object ColumnWithLengthOptions {
  
  @scala.inline
  def apply(): ColumnWithLengthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnWithLengthOptions]
  }
  
  @scala.inline
  implicit class ColumnWithLengthOptionsOps[Self <: ColumnWithLengthOptions] (val x: Self) extends AnyVal {
    
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
    def setLength(value: String | Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
}

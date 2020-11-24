package typings.typeorm.columnEnumOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnEnumOptions extends js.Object {
  
  /**
    * Array of possible enumerated values.
    */
  var enum: js.UndefOr[js.Array[_] | js.Object] = js.native
  
  /**
    * Exact name of enum
    */
  var enumName: js.UndefOr[String] = js.native
}
object ColumnEnumOptions {
  
  @scala.inline
  def apply(): ColumnEnumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnEnumOptions]
  }
  
  @scala.inline
  implicit class ColumnEnumOptionsOps[Self <: ColumnEnumOptions] (val x: Self) extends AnyVal {
    
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
    def setEnumVarargs(value: js.Any*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[_] | js.Object): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setEnumName(value: String): Self = this.set("enumName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumName: Self = this.set("enumName", js.undefined)
  }
}

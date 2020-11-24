package typings.typeorm.optionsJoinColumnOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinColumnOptions extends js.Object {
  
  /**
    * Name of the column.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Name of the column in the entity to which this column is referenced.
    */
  var referencedColumnName: js.UndefOr[String] = js.native
}
object JoinColumnOptions {
  
  @scala.inline
  def apply(): JoinColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinColumnOptions]
  }
  
  @scala.inline
  implicit class JoinColumnOptionsOps[Self <: JoinColumnOptions] (val x: Self) extends AnyVal {
    
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
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReferencedColumnName(value: String): Self = this.set("referencedColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencedColumnName: Self = this.set("referencedColumnName", js.undefined)
  }
}

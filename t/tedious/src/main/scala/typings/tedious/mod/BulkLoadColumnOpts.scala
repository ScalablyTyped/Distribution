package typings.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkLoadColumnOpts extends ParameterOptions {
  
  //  Indicates whether the column accepts NULL values.
  var nullable: Boolean = js.native
  
  //  If the name of the column is different from the name of the property found on rowObj arguments passed to , then you can use this option to specify the property name.
  var objName: js.UndefOr[String] = js.native
}
object BulkLoadColumnOpts {
  
  @scala.inline
  def apply(nullable: Boolean): BulkLoadColumnOpts = {
    val __obj = js.Dynamic.literal(nullable = nullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkLoadColumnOpts]
  }
  
  @scala.inline
  implicit class BulkLoadColumnOptsOps[Self <: BulkLoadColumnOpts] (val x: Self) extends AnyVal {
    
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
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjName(value: String): Self = this.set("objName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjName: Self = this.set("objName", js.undefined)
  }
}

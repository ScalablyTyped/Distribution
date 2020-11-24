package typings.typeorm.optionsColumnHstoreOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnHstoreOptions extends js.Object {
  
  /**
    * Return type of HSTORE column.
    * Returns value as string or as object.
    */
  var hstoreType: js.UndefOr[String] = js.native
}
object ColumnHstoreOptions {
  
  @scala.inline
  def apply(): ColumnHstoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHstoreOptions]
  }
  
  @scala.inline
  implicit class ColumnHstoreOptionsOps[Self <: ColumnHstoreOptions] (val x: Self) extends AnyVal {
    
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
    def setHstoreType(value: String): Self = this.set("hstoreType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHstoreType: Self = this.set("hstoreType", js.undefined)
  }
}

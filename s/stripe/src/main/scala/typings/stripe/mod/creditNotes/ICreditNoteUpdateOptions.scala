package typings.stripe.mod.creditNotes

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreditNoteUpdateOptions extends IDataOptionsWithMetadata {
  
  /**
    * Credit note memo. This can be unset by updating the value to nil and then saving.
    */
  var memo: js.UndefOr[String] = js.native
}
object ICreditNoteUpdateOptions {
  
  @scala.inline
  def apply(): ICreditNoteUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreditNoteUpdateOptions]
  }
  
  @scala.inline
  implicit class ICreditNoteUpdateOptionsOps[Self <: ICreditNoteUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setMemo(value: String): Self = this.set("memo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemo: Self = this.set("memo", js.undefined)
  }
}

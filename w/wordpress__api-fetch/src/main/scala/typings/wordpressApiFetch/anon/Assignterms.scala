package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assignterms extends js.Object {
  
  var assign_terms: String = js.native
  
  var delete_terms: String = js.native
  
  var edit_terms: String = js.native
  
  var manage_terms: String = js.native
}
object Assignterms {
  
  @scala.inline
  def apply(assign_terms: String, delete_terms: String, edit_terms: String, manage_terms: String): Assignterms = {
    val __obj = js.Dynamic.literal(assign_terms = assign_terms.asInstanceOf[js.Any], delete_terms = delete_terms.asInstanceOf[js.Any], edit_terms = edit_terms.asInstanceOf[js.Any], manage_terms = manage_terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignterms]
  }
  
  @scala.inline
  implicit class AssigntermsOps[Self <: Assignterms] (val x: Self) extends AnyVal {
    
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
    def setAssign_terms(value: String): Self = this.set("assign_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_terms(value: String): Self = this.set("delete_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_terms(value: String): Self = this.set("edit_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManage_terms(value: String): Self = this.set("manage_terms", value.asInstanceOf[js.Any])
  }
}

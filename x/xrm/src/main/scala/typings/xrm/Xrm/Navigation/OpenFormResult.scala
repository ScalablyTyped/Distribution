package typings.xrm.Xrm.Navigation

import typings.xrm.Xrm.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenFormResult extends js.Object {
  
  /**
    * Identifies the record displayed or created
    */
  var savedEntityReference: js.Array[LookupValue] = js.native
}
object OpenFormResult {
  
  @scala.inline
  def apply(savedEntityReference: js.Array[LookupValue]): OpenFormResult = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFormResult]
  }
  
  @scala.inline
  implicit class OpenFormResultOps[Self <: OpenFormResult] (val x: Self) extends AnyVal {
    
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
    def setSavedEntityReferenceVarargs(value: LookupValue*): Self = this.set("savedEntityReference", js.Array(value :_*))
    
    @scala.inline
    def setSavedEntityReference(value: js.Array[LookupValue]): Self = this.set("savedEntityReference", value.asInstanceOf[js.Any])
  }
}

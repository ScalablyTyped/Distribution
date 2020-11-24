package typings.xrm.Xrm.Async

import typings.xrm.Xrm.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object passed to QuickCreateSuccessCallbackDelegate.
  */
@js.native
trait OpenQuickCreateSuccessCallbackObject extends js.Object {
  
  /**
    * A lookup value which identifies the record which has been created.
    */
  var savedEntityReference: LookupValue = js.native
}
object OpenQuickCreateSuccessCallbackObject {
  
  @scala.inline
  def apply(savedEntityReference: LookupValue): OpenQuickCreateSuccessCallbackObject = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenQuickCreateSuccessCallbackObject]
  }
  
  @scala.inline
  implicit class OpenQuickCreateSuccessCallbackObjectOps[Self <: OpenQuickCreateSuccessCallbackObject] (val x: Self) extends AnyVal {
    
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
    def setSavedEntityReference(value: LookupValue): Self = this.set("savedEntityReference", value.asInstanceOf[js.Any])
  }
}

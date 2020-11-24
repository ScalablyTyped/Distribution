package typings.ttiPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFirstConsistentlyInteractiveOpts extends js.Object {
  
  /**
    * The lower bound to start forward-searching for the quite window. If no value is set, the default is after the
    * DOMContentLoaded event.
    */
  var minValue: js.UndefOr[Double | Null] = js.native
  
  /**
    * When true (the default), a mutation observer is used to detect when added
    * DOM elements will create additional network requests. This can be
    * disabled to improve performance in cases where you know no additional
    * request-creating DOM elements will be added.
    */
  var useMutationObserver: js.UndefOr[Boolean] = js.native
}
object GetFirstConsistentlyInteractiveOpts {
  
  @scala.inline
  def apply(): GetFirstConsistentlyInteractiveOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFirstConsistentlyInteractiveOpts]
  }
  
  @scala.inline
  implicit class GetFirstConsistentlyInteractiveOptsOps[Self <: GetFirstConsistentlyInteractiveOpts] (val x: Self) extends AnyVal {
    
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
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setMinValueNull: Self = this.set("minValue", null)
    
    @scala.inline
    def setUseMutationObserver(value: Boolean): Self = this.set("useMutationObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMutationObserver: Self = this.set("useMutationObserver", js.undefined)
  }
}

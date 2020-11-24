package typings.xelib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetREFRsOptions extends js.Object {
  
  /**
    * Pass true to exclude deleted REFRs.
    * @default false
    */
  var excludeDeleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass true to exclude disabled REFRs.
    * @default false
    */
  var excludeDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass true to exclude REFRs which have an XESP element.
    * @default false
    */
  var excludeXESP: js.UndefOr[Boolean] = js.native
}
object GetREFRsOptions {
  
  @scala.inline
  def apply(): GetREFRsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetREFRsOptions]
  }
  
  @scala.inline
  implicit class GetREFRsOptionsOps[Self <: GetREFRsOptions] (val x: Self) extends AnyVal {
    
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
    def setExcludeDeleted(value: Boolean): Self = this.set("excludeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeDeleted: Self = this.set("excludeDeleted", js.undefined)
    
    @scala.inline
    def setExcludeDisabled(value: Boolean): Self = this.set("excludeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeDisabled: Self = this.set("excludeDisabled", js.undefined)
    
    @scala.inline
    def setExcludeXESP(value: Boolean): Self = this.set("excludeXESP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeXESP: Self = this.set("excludeXESP", js.undefined)
  }
}

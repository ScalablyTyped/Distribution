package typings.stylableWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  DUPLICATE_MODULE_NAMESPACE :boolean}> */
@js.native
trait PartialDUPLICATEMODULENAM extends js.Object {
  
  var DUPLICATE_MODULE_NAMESPACE: js.UndefOr[Boolean] = js.native
}
object PartialDUPLICATEMODULENAM {
  
  @scala.inline
  def apply(): PartialDUPLICATEMODULENAM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDUPLICATEMODULENAM]
  }
  
  @scala.inline
  implicit class PartialDUPLICATEMODULENAMOps[Self <: PartialDUPLICATEMODULENAM] (val x: Self) extends AnyVal {
    
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
    def setDUPLICATE_MODULE_NAMESPACE(value: Boolean): Self = this.set("DUPLICATE_MODULE_NAMESPACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDUPLICATE_MODULE_NAMESPACE: Self = this.set("DUPLICATE_MODULE_NAMESPACE", js.undefined)
  }
}

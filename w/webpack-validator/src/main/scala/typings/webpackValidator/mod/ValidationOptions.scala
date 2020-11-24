package typings.webpackValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationOptions extends js.Object {
  
  var `loader-enforce-include-or-exclude`: js.UndefOr[Boolean] = js.native
  
  var `loader-prefer-include`: js.UndefOr[Boolean] = js.native
  
  var `no-root-files-node-modules-nameclash`: js.UndefOr[Boolean] = js.native
}
object ValidationOptions {
  
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    
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
    def `setLoader-enforce-include-or-exclude`(value: Boolean): Self = this.set("loader-enforce-include-or-exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLoader-enforce-include-or-exclude`: Self = this.set("loader-enforce-include-or-exclude", js.undefined)
    
    @scala.inline
    def `setLoader-prefer-include`(value: Boolean): Self = this.set("loader-prefer-include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLoader-prefer-include`: Self = this.set("loader-prefer-include", js.undefined)
    
    @scala.inline
    def `setNo-root-files-node-modules-nameclash`(value: Boolean): Self = this.set("no-root-files-node-modules-nameclash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNo-root-files-node-modules-nameclash`: Self = this.set("no-root-files-node-modules-nameclash", js.undefined)
  }
}

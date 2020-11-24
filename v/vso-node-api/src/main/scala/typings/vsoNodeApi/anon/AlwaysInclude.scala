package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlwaysInclude extends js.Object {
  
  var alwaysInclude: scala.Double = js.native
  
  var onlyIfLicensed: scala.Double = js.native
  
  var onlyIfUnlicensed: scala.Double = js.native
}
object AlwaysInclude {
  
  @scala.inline
  def apply(alwaysInclude: scala.Double, onlyIfLicensed: scala.Double, onlyIfUnlicensed: scala.Double): AlwaysInclude = {
    val __obj = js.Dynamic.literal(alwaysInclude = alwaysInclude.asInstanceOf[js.Any], onlyIfLicensed = onlyIfLicensed.asInstanceOf[js.Any], onlyIfUnlicensed = onlyIfUnlicensed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysInclude]
  }
  
  @scala.inline
  implicit class AlwaysIncludeOps[Self <: AlwaysInclude] (val x: Self) extends AnyVal {
    
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
    def setAlwaysInclude(value: scala.Double): Self = this.set("alwaysInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyIfLicensed(value: scala.Double): Self = this.set("onlyIfLicensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyIfUnlicensed(value: scala.Double): Self = this.set("onlyIfUnlicensed", value.asInstanceOf[js.Any])
  }
}

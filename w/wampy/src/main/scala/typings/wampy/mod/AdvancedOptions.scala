package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedOptions extends js.Object {
  
  var disclose_me: js.UndefOr[Boolean] = js.native
  
  var eligible: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var exclude: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var exclude_me: js.UndefOr[Boolean] = js.native
}
object AdvancedOptions {
  
  @scala.inline
  def apply(): AdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedOptions]
  }
  
  @scala.inline
  implicit class AdvancedOptionsOps[Self <: AdvancedOptions] (val x: Self) extends AnyVal {
    
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
    def setDisclose_me(value: Boolean): Self = this.set("disclose_me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisclose_me: Self = this.set("disclose_me", js.undefined)
    
    @scala.inline
    def setEligibleVarargs(value: Double*): Self = this.set("eligible", js.Array(value :_*))
    
    @scala.inline
    def setEligible(value: Double | js.Array[Double]): Self = this.set("eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligible: Self = this.set("eligible", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: Double*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: Double | js.Array[Double]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExclude_me(value: Boolean): Self = this.set("exclude_me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_me: Self = this.set("exclude_me", js.undefined)
  }
}

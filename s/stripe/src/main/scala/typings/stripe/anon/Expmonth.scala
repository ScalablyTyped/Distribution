package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expmonth extends js.Object {
  
  var exp_month: js.UndefOr[Double] = js.native
  
  var exp_year: js.UndefOr[Double] = js.native
}
object Expmonth {
  
  @scala.inline
  def apply(): Expmonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expmonth]
  }
  
  @scala.inline
  implicit class ExpmonthOps[Self <: Expmonth] (val x: Self) extends AnyVal {
    
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
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp_month: Self = this.set("exp_month", js.undefined)
    
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp_year: Self = this.set("exp_year", js.undefined)
  }
}

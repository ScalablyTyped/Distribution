package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expmonth extends StObject {
  
  var exp_month: js.UndefOr[Double] = js.undefined
  
  var exp_year: js.UndefOr[Double] = js.undefined
}
object Expmonth {
  
  @scala.inline
  def apply(): Expmonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expmonth]
  }
  
  @scala.inline
  implicit class ExpmonthMutableBuilder[Self <: Expmonth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
    
    @scala.inline
    def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
  }
}

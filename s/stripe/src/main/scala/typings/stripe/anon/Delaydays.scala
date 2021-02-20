package typings.stripe.anon

import typings.stripe.stripeStrings.daily
import typings.stripe.stripeStrings.friday
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.monday
import typings.stripe.stripeStrings.monthly
import typings.stripe.stripeStrings.saturday
import typings.stripe.stripeStrings.sunday
import typings.stripe.stripeStrings.thursday
import typings.stripe.stripeStrings.tuesday
import typings.stripe.stripeStrings.wednesday
import typings.stripe.stripeStrings.weekly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delaydays extends StObject {
  
  /**
    * The number of days charges for the account will be held before being paid out.
    * May also be the string “minimum” for the lowest available value (based on
    * country). Default is “minimum”. Does not apply when interval is “manual”.
    */
  var delay_days: js.UndefOr[Double | String] = js.native
  
  /**
    * How frequently funds will be paid out. One of "manual" (for only triggered
    * via API call), "daily", "weekly", or "monthly". Default is "daily".
    */
  var interval: js.UndefOr[manual | daily | weekly | monthly] = js.native
  
  /**
    * The day of the month funds will be paid out. Required and available only if
    * interval is "monthly".
    */
  var monthly_anchor: js.UndefOr[Double] = js.native
  
  /**
    * The day of the week funds will be paid out, of the style ‘monday’,
    * ‘tuesday’, etc. Required and available only if interval is weekly.
    */
  var weekly_anchor: js.UndefOr[monday | tuesday | wednesday | thursday | friday | saturday | sunday] = js.native
}
object Delaydays {
  
  @scala.inline
  def apply(): Delaydays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delaydays]
  }
  
  @scala.inline
  implicit class DelaydaysMutableBuilder[Self <: Delaydays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay_days(value: Double | String): Self = StObject.set(x, "delay_days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay_daysUndefined: Self = StObject.set(x, "delay_days", js.undefined)
    
    @scala.inline
    def setInterval(value: manual | daily | weekly | monthly): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setMonthly_anchor(value: Double): Self = StObject.set(x, "monthly_anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthly_anchorUndefined: Self = StObject.set(x, "monthly_anchor", js.undefined)
    
    @scala.inline
    def setWeekly_anchor(value: monday | tuesday | wednesday | thursday | friday | saturday | sunday): Self = StObject.set(x, "weekly_anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekly_anchorUndefined: Self = StObject.set(x, "weekly_anchor", js.undefined)
  }
}

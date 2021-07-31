package typings.winrtUwp.Windows.Services.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides subscription info for a product SKU that represents a subscription with recurring billing. */
trait StoreSubscriptionInfo extends StObject {
  
  /** Gets the duration of the billing period for a subscription, in the units specified by the BillingPeriodUnit property. */
  var billingPeriod: Double
  
  /** Gets the units of the billing period for a subscription. */
  var billingPeriodUnit: StoreDurationUnit
  
  /** Gets a value that indicates whether the subscription contains a trial period. */
  var hasTrialPeriod: Boolean
  
  /** Gets the duration of the trial period for the subscription, in the units specified by the TrialPeriodUnit property. To determine whether the subscription has a trial period, use the HasTrialPeriod property. */
  var trialPeriod: Double
  
  /** Gets the units of the trial period for the subscription. */
  var trialPeriodUnit: StoreDurationUnit
}
object StoreSubscriptionInfo {
  
  @scala.inline
  def apply(
    billingPeriod: Double,
    billingPeriodUnit: StoreDurationUnit,
    hasTrialPeriod: Boolean,
    trialPeriod: Double,
    trialPeriodUnit: StoreDurationUnit
  ): StoreSubscriptionInfo = {
    val __obj = js.Dynamic.literal(billingPeriod = billingPeriod.asInstanceOf[js.Any], billingPeriodUnit = billingPeriodUnit.asInstanceOf[js.Any], hasTrialPeriod = hasTrialPeriod.asInstanceOf[js.Any], trialPeriod = trialPeriod.asInstanceOf[js.Any], trialPeriodUnit = trialPeriodUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSubscriptionInfo]
  }
  
  @scala.inline
  implicit class StoreSubscriptionInfoMutableBuilder[Self <: StoreSubscriptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingPeriod(value: Double): Self = StObject.set(x, "billingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPeriodUnit(value: StoreDurationUnit): Self = StObject.set(x, "billingPeriodUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTrialPeriod(value: Boolean): Self = StObject.set(x, "hasTrialPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialPeriod(value: Double): Self = StObject.set(x, "trialPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialPeriodUnit(value: StoreDurationUnit): Self = StObject.set(x, "trialPeriodUnit", value.asInstanceOf[js.Any])
  }
}

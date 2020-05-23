package typings.winrtUwp.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides subscription info for a product SKU that represents a subscription with recurring billing. */
trait StoreSubscriptionInfo extends js.Object {
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
}


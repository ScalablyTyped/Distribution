package typings.winrtUwp.global.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides subscription info for a product SKU that represents a subscription with recurring billing. */
@JSGlobal("Windows.Services.Store.StoreSubscriptionInfo")
@js.native
abstract class StoreSubscriptionInfo ()
  extends typings.winrtUwp.Windows.Services.Store.StoreSubscriptionInfo {
  /** Gets the duration of the billing period for a subscription, in the units specified by the BillingPeriodUnit property. */
  /* CompleteClass */
  override var billingPeriod: Double = js.native
  /** Gets the units of the billing period for a subscription. */
  /* CompleteClass */
  override var billingPeriodUnit: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit = js.native
  /** Gets a value that indicates whether the subscription contains a trial period. */
  /* CompleteClass */
  override var hasTrialPeriod: Boolean = js.native
  /** Gets the duration of the trial period for the subscription, in the units specified by the TrialPeriodUnit property. To determine whether the subscription has a trial period, use the HasTrialPeriod property. */
  /* CompleteClass */
  override var trialPeriod: Double = js.native
  /** Gets the units of the trial period for the subscription. */
  /* CompleteClass */
  override var trialPeriodUnit: typings.winrtUwp.Windows.Services.Store.StoreDurationUnit = js.native
}


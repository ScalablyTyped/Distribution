package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides subscription info for a product SKU that represents a subscription with recurring billing. */
@JSGlobal("Windows.Services.Store.StoreSubscriptionInfo")
@js.native
abstract class StoreSubscriptionInfo () extends js.Object {
  /** Gets the duration of the billing period for a subscription, in the units specified by the BillingPeriodUnit property. */
  var billingPeriod: scala.Double = js.native
  /** Gets the units of the billing period for a subscription. */
  var billingPeriodUnit: StoreDurationUnit = js.native
  /** Gets a value that indicates whether the subscription contains a trial period. */
  var hasTrialPeriod: scala.Boolean = js.native
  /** Gets the duration of the trial period for the subscription, in the units specified by the TrialPeriodUnit property. To determine whether the subscription has a trial period, use the HasTrialPeriod property. */
  var trialPeriod: scala.Double = js.native
  /** Gets the units of the trial period for the subscription. */
  var trialPeriodUnit: StoreDurationUnit = js.native
}


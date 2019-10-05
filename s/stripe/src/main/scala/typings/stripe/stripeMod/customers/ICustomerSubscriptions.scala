package typings.stripe.stripeMod.customers

import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.resources.CustomerSubscriptions
import typings.stripe.stripeMod.subscriptions.ISubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerSubscriptions
  extends CustomerSubscriptions
     with IList[ISubscription]


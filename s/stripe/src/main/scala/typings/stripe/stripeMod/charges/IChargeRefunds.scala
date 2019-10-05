package typings.stripe.stripeMod.charges

import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.refunds.IRefund
import typings.stripe.stripeMod.resources.ChargeRefunds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChargeRefunds
  extends ChargeRefunds
     with IList[IRefund]


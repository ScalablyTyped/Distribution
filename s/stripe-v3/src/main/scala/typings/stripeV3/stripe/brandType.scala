package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.Visa
  - typings.stripeV3.stripeV3Strings.`American Express`
  - typings.stripeV3.stripeV3Strings.MasterCard
  - typings.stripeV3.stripeV3Strings.Discover
  - typings.stripeV3.stripeV3Strings.JCB
  - typings.stripeV3.stripeV3Strings.`Diners Club`
  - typings.stripeV3.stripeV3Strings.Unknown
*/
trait brandType extends js.Object

object brandType {
  @scala.inline
  def `American Express`: typings.stripeV3.stripeV3Strings.`American Express` = this.cast("American Express")
  @scala.inline
  def `Diners Club`: typings.stripeV3.stripeV3Strings.`Diners Club` = this.cast("Diners Club")
  @scala.inline
  def Discover: typings.stripeV3.stripeV3Strings.Discover = this.cast("Discover")
  @scala.inline
  def JCB: typings.stripeV3.stripeV3Strings.JCB = this.cast("JCB")
  @scala.inline
  def MasterCard: typings.stripeV3.stripeV3Strings.MasterCard = this.cast("MasterCard")
  @scala.inline
  def Unknown: typings.stripeV3.stripeV3Strings.Unknown = this.cast("Unknown")
  @scala.inline
  def Visa: typings.stripeV3.stripeV3Strings.Visa = this.cast("Visa")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


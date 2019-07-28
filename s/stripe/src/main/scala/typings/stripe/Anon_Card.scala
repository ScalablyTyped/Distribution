package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Card extends js.Object {
  /**
    * Configuration for any card payments attempted on this PaymentIntent.
    */
  var card: js.UndefOr[Anon_Any] = js.undefined
}

object Anon_Card {
  @scala.inline
  def apply(card: Anon_Any = null): Anon_Card = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[Anon_Card]
  }
}


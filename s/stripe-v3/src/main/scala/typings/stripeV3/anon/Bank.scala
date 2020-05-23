package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bank extends js.Object {
  var bank: String
}

object Bank {
  @scala.inline
  def apply(bank: String): Bank = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bank]
  }
}


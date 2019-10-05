package typings.stripe.stripeMod.accounts

import typings.stripe.stripeMod.IListOptions
import typings.stripe.stripeStrings.bank_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountListOptions extends IListOptions {
  var `object`: bank_account
}

object IBankAccountListOptions {
  @scala.inline
  def apply(
    `object`: bank_account,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null
  ): IBankAccountListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IBankAccountListOptions]
  }
}


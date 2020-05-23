package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var account: scala.Double
  var all: scala.Double
  var collection: scala.Double
  var deployment: scala.Double
  var none: scala.Double
}

object Account {
  @scala.inline
  def apply(
    account: scala.Double,
    all: scala.Double,
    collection: scala.Double,
    deployment: scala.Double,
    none: scala.Double
  ): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}


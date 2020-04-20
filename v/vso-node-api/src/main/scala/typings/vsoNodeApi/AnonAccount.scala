package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccount extends js.Object {
  var account: Double
  var all: Double
  var collection: Double
  var deployment: Double
  var none: Double
}

object AnonAccount {
  @scala.inline
  def apply(account: Double, all: Double, collection: Double, deployment: Double, none: Double): AnonAccount = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccount]
  }
}


package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  var account: Double
  var all: Double
  var collection: Double
  var deployment: Double
  var none: Double
}

object Anon_Account {
  @scala.inline
  def apply(account: Double, all: Double, collection: Double, deployment: Double, none: Double): Anon_Account = {
    val __obj = js.Dynamic.literal(account = account, all = all, collection = collection, deployment = deployment, none = none)
  
    __obj.asInstanceOf[Anon_Account]
  }
}


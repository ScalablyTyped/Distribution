package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile network operator notification trigger. */
trait NetworkOperatorNotificationTrigger extends js.Object {
  /** Gets the account identifier for the mobile network operator notification trigger. */
  var networkAccountId: String
}

object NetworkOperatorNotificationTrigger {
  @scala.inline
  def apply(networkAccountId: String): NetworkOperatorNotificationTrigger = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorNotificationTrigger]
  }
}


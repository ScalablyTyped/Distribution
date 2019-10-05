package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is launched to perform an action to a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs")
@js.native
abstract class ContactLaunchActionVerbs () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs")
@js.native
object ContactLaunchActionVerbs extends js.Object {
  /** Gets the call contact action. */
  var call: String = js.native
  /** Gets the map contact action. */
  var map: String = js.native
  /** Gets the send message to a contact action. */
  var message: String = js.native
  /** Gets the post to a contact action. */
  var post: String = js.native
  /** Gets the video call contact action. */
  var videoCall: String = js.native
}


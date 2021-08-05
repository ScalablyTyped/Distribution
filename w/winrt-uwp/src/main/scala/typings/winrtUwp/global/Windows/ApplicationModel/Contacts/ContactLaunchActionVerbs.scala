package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is launched to perform an action to a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs")
@js.native
abstract class ContactLaunchActionVerbs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs
object ContactLaunchActionVerbs {
  
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the call contact action. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs.call")
  @js.native
  def call: String = js.native
  inline def call_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("call")(x.asInstanceOf[js.Any])
  
  /** Gets the map contact action. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs.map")
  @js.native
  def map: String = js.native
  inline def map_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
  
  /** Gets the send message to a contact action. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs.message")
  @js.native
  def message: String = js.native
  inline def message_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
  
  /** Gets the post to a contact action. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs.post")
  @js.native
  def post: String = js.native
  inline def post_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("post")(x.asInstanceOf[js.Any])
  
  /** Gets the video call contact action. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.ContactLaunchActionVerbs.videoCall")
  @js.native
  def videoCall: String = js.native
  inline def videoCall_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videoCall")(x.asInstanceOf[js.Any])
}

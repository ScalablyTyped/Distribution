package typings.tabrisPluginFirebase.mod._Global_.firebase

import org.scalablytyped.runtime.TopLevel
import typings.tabris.mod.NativeObject
import typings.tabrisPluginFirebase.AnonClearAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messaging extends NativeObject {
  val instanceId: String = js.native
  val launchData: js.Object = js.native
  val pendingMessages: AnonClearAll = js.native
  val token: String = js.native
  def off(listeners: MessagingEvents): this.type = js.native
  def on(listeners: MessagingEvents): this.type = js.native
  def once(listeners: MessagingEvents): this.type = js.native
  def requestPermissions(): Unit = js.native
  def resetInstanceId(): Unit = js.native
}

@JSGlobal("firebase.Messaging")
@js.native
object Messaging extends TopLevel[Messaging]


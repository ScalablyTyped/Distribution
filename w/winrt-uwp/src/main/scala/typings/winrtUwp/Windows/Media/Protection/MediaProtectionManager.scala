package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.componentloadfailed
import typings.winrtUwp.winrtUwpStrings.rebootneeded
import typings.winrtUwp.winrtUwpStrings.servicerequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a content protection manager object, for an application that handles protected media content. */
@js.native
trait MediaProtectionManager extends js.Object {
  /** Fires when the load of binary data fails. */
  @JSName("oncomponentloadfailed")
  var oncomponentloadfailed_Original: ComponentLoadFailedEventHandler = js.native
  /** Fires when a reboot is needed after the component is renewed. */
  @JSName("onrebootneeded")
  var onrebootneeded_Original: RebootNeededEventHandler = js.native
  /** Fires when a service is requested. */
  @JSName("onservicerequested")
  var onservicerequested_Original: ServiceRequestedEventHandler = js.native
  /** Gets a PropertySet object containing any properties attached to the protection manager. */
  var properties: IPropertySet = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentloadfailed(`type`: componentloadfailed, listener: ComponentLoadFailedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rebootneeded(`type`: rebootneeded, listener: RebootNeededEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicerequested(`type`: servicerequested, listener: ServiceRequestedEventHandler): Unit = js.native
  /** Fires when the load of binary data fails. */
  def oncomponentloadfailed(ev: ComponentLoadFailedEventArgs with WinRTEvent[MediaProtectionManager]): Unit = js.native
  /** Fires when a reboot is needed after the component is renewed. */
  def onrebootneeded(ev: WinRTEvent[MediaProtectionManager]): Unit = js.native
  /** Fires when a service is requested. */
  def onservicerequested(ev: ServiceRequestedEventArgs with WinRTEvent[MediaProtectionManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_componentloadfailed(`type`: componentloadfailed, listener: ComponentLoadFailedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rebootneeded(`type`: rebootneeded, listener: RebootNeededEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_servicerequested(`type`: servicerequested, listener: ServiceRequestedEventHandler): Unit = js.native
}


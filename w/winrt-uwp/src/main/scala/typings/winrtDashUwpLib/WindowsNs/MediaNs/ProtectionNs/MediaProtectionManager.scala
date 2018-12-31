package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a content protection manager object, for an application that handles protected media content. */
@JSGlobal("Windows.Media.Protection.MediaProtectionManager")
@js.native
/** Initializes a new instance of the MediaProtectionManager class. */
class MediaProtectionManager () extends js.Object {
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
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentloadfailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.componentloadfailed,
    listener: ComponentLoadFailedEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rebootneeded(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.rebootneeded, listener: RebootNeededEventHandler): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_servicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.servicerequested,
    listener: ServiceRequestedEventHandler
  ): scala.Unit = js.native
  /** Fires when the load of binary data fails. */
  def oncomponentloadfailed(ev: ComponentLoadFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaProtectionManager]): scala.Unit = js.native
  /** Fires when a reboot is needed after the component is renewed. */
  def onrebootneeded(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[MediaProtectionManager]): scala.Unit = js.native
  /** Fires when a service is requested. */
  def onservicerequested(ev: ServiceRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaProtectionManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_componentloadfailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.componentloadfailed,
    listener: ComponentLoadFailedEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rebootneeded(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.rebootneeded, listener: RebootNeededEventHandler): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_servicerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.servicerequested,
    listener: ServiceRequestedEventHandler
  ): scala.Unit = js.native
}


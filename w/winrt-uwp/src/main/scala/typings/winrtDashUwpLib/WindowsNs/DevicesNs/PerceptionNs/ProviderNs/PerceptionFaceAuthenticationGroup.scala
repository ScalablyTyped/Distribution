package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A group of unique identifiers specifying IPerceptionFrameProviders that share handlers for entering and exiting Face Authentication mode. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionFaceAuthenticationGroup")
@js.native
class PerceptionFaceAuthenticationGroup protected () extends js.Object {
  /**
                       * Initializes a new PerceptionFaceAuthenticationGroup instance.
                       * @param ids The collection of unique identifiers which maps to IPerceptionFrameProviders via PerceptionFrameProviderInfo::Id.
                       * @param startHandler The handler to invoke when this group is requested to enter Face Authentication mode returning if it's ready.
                       * @param stopHandler The handler to invoke when this group is leaving Face Authentication mode after startHandler is called and returned true.
                       */
  def this(ids: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], startHandler: PerceptionStartFaceAuthenticationHandler, stopHandler: PerceptionStopFaceAuthenticationHandler) = this()
  /** The id(s) of the IPerceptionFrameProvider(s) referenced by this group. */
  var frameProviderIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}


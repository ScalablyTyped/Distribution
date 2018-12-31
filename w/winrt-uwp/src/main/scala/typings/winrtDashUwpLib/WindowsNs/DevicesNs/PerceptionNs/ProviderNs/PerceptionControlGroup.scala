package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A group of IPerceptionFrameProvider identifiers to be controlled together. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionControlGroup")
@js.native
class PerceptionControlGroup protected () extends js.Object {
  /**
    * Creates a PerceptionControlGroup containing the IPerceptionFrameProviders with the ids specified.
    * @param ids A list of the unique identifiers associated with the grouped IPerceptionFrameProviders. To be controllable, the id must match the associated PerceptionFrameProviderInfo::Id property.
    */
  def this(ids: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]) = this()
  /** The id(s) of the IPerceptionFrameProvider(s) controlled by this group. */
  var frameProviderIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}


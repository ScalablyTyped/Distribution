package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the updated properties of a PnpObject . */
@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectUpdate")
@js.native
abstract class PnpObjectUpdate () extends js.Object {
  /** The identifier of the PnpObject . */
  var id: String = js.native
  /** The changed properties in an update to a PnpObject . */
  var properties: IMapView[String, _] = js.native
  /** The type of the PnpObject . One of the values of the PnpObjectType enumeration. */
  var `type`: PnpObjectType = js.native
}


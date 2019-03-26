package typings
package webvrDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRDisplayCapabilities extends js.Object {
  val canPresent: scala.Boolean
  val hasExternalDisplay: scala.Boolean
  val hasOrientation: scala.Boolean
  val hasPosition: scala.Boolean
  val maxLayers: scala.Double
}

@JSGlobal("VRDisplayCapabilities")
@js.native
class VRDisplayCapabilitiesCls () extends VRDisplayCapabilities {
  /* CompleteClass */
  override val canPresent: scala.Boolean = js.native
  /* CompleteClass */
  override val hasExternalDisplay: scala.Boolean = js.native
  /* CompleteClass */
  override val hasOrientation: scala.Boolean = js.native
  /* CompleteClass */
  override val hasPosition: scala.Boolean = js.native
  /* CompleteClass */
  override val maxLayers: scala.Double = js.native
}

@JSGlobal("VRDisplayCapabilities")
@js.native
object VRDisplayCapabilities
  extends org.scalablytyped.runtime.Instantiable0[VRDisplayCapabilities]


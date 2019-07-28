package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDContentIDType extends js.Object

/** Indicates the types of content that PlayReady can use in different scenarios. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDContentIDType")
@js.native
object NDContentIDType extends js.Object {
  /** Custom object specific to the transmitter. It is expected that the transmitter will understand the data contained therein. PlayReady does not define a standard format for custom content identifiers. */
  @js.native
  sealed trait custom extends NDContentIDType
  
  /** License key identifier. */
  @js.native
  sealed trait keyID extends NDContentIDType
  
  /** PlayReadyObject can be one of the following two objects. */
  @js.native
  sealed trait playReadyObject extends NDContentIDType
  
  /* 2 */ val custom: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDContentIDType.custom with Double = js.native
  /* 0 */ val keyID: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDContentIDType.keyID with Double = js.native
  /* 1 */ val playReadyObject: typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDContentIDType.playReadyObject with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDContentIDType with Double] = js.native
}


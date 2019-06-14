package typings
package winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriteActivationMode extends js.Object

/** Indicates whether other apps can write to the locally cached version of the file and when Windows will request an update if another app writes to that local file. */
@JSGlobal("Windows.Storage.Provider.WriteActivationMode")
@js.native
object WriteActivationMode extends js.Object {
  /** Windows will trigger a file update request after another app writes to the local file. */
  @js.native
  sealed trait afterWrite
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode
  
  /** Windows will trigger a file update request when another app writes to the local file. */
  @js.native
  sealed trait notNeeded
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode
  
  /** Other apps can't write to the local file. */
  @js.native
  sealed trait readOnly
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode
  
  /* 2 */ val afterWrite: afterWrite with scala.Double = js.native
  /* 1 */ val notNeeded: notNeeded with scala.Double = js.native
  /* 0 */ val readOnly: readOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode with scala.Double
  ] = js.native
}


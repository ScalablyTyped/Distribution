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
  
  val afterWrite: afterWrite with java.lang.String = js.native
  val notNeeded: notNeeded with java.lang.String = js.native
  val readOnly: readOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.WriteActivationMode with java.lang.String
  ] = js.native
}


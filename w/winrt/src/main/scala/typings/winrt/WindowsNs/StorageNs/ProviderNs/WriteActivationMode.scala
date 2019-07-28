package typings.winrt.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriteActivationMode extends js.Object

@JSGlobal("Windows.Storage.Provider.WriteActivationMode")
@js.native
object WriteActivationMode extends js.Object {
  @js.native
  sealed trait afterWrite extends WriteActivationMode
  
  @js.native
  sealed trait notNeeded extends WriteActivationMode
  
  @js.native
  sealed trait readOnly extends WriteActivationMode
  
  /* 2 */ val afterWrite: typings.winrt.WindowsNs.StorageNs.ProviderNs.WriteActivationMode.afterWrite with Double = js.native
  /* 1 */ val notNeeded: typings.winrt.WindowsNs.StorageNs.ProviderNs.WriteActivationMode.notNeeded with Double = js.native
  /* 0 */ val readOnly: typings.winrt.WindowsNs.StorageNs.ProviderNs.WriteActivationMode.readOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriteActivationMode with Double] = js.native
}


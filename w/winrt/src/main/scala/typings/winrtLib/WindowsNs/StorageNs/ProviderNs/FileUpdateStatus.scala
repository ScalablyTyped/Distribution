package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileUpdateStatus extends js.Object

@JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
@js.native
object FileUpdateStatus extends js.Object {
  @js.native
  sealed trait complete
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  @js.native
  sealed trait completeAndRenamed
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  @js.native
  sealed trait currentlyUnavailable
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  @js.native
  sealed trait failed
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  @js.native
  sealed trait incomplete
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  @js.native
  sealed trait userInputNeeded
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus
  
  /* 1 */ val complete: complete with scala.Double = js.native
  /* 5 */ val completeAndRenamed: completeAndRenamed with scala.Double = js.native
  /* 3 */ val currentlyUnavailable: currentlyUnavailable with scala.Double = js.native
  /* 4 */ val failed: failed with scala.Double = js.native
  /* 0 */ val incomplete: incomplete with scala.Double = js.native
  /* 2 */ val userInputNeeded: userInputNeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus with scala.Double] = js.native
}


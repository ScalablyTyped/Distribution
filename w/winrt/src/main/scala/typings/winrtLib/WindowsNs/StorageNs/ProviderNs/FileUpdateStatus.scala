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
  
  val complete: complete with java.lang.String = js.native
  val completeAndRenamed: completeAndRenamed with java.lang.String = js.native
  val currentlyUnavailable: currentlyUnavailable with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val incomplete: incomplete with java.lang.String = js.native
  val userInputNeeded: userInputNeeded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.FileUpdateStatus with java.lang.String] = js.native
}


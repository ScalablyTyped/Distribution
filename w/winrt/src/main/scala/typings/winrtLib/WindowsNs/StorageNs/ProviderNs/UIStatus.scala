package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIStatus extends js.Object

@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends js.Object {
  @js.native
  sealed trait complete
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.UIStatus
  
  @js.native
  sealed trait hidden
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.UIStatus
  
  @js.native
  sealed trait unavailable
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.UIStatus
  
  @js.native
  sealed trait visible
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.UIStatus
  
  /* 3 */ val complete: complete with scala.Double = js.native
  /* 1 */ val hidden: hidden with scala.Double = js.native
  /* 0 */ val unavailable: unavailable with scala.Double = js.native
  /* 2 */ val visible: visible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.UIStatus with scala.Double] = js.native
}


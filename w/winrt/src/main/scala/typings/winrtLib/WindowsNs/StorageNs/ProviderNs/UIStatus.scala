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
  
  val complete: complete with java.lang.String = js.native
  val hidden: hidden with java.lang.String = js.native
  val unavailable: unavailable with java.lang.String = js.native
  val visible: visible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.UIStatus with java.lang.String] = js.native
}


package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageItemTypes extends js.Object

@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends js.Object {
  @js.native
  sealed trait file
    extends winrtLib.WindowsNs.StorageNs.StorageItemTypes
  
  @js.native
  sealed trait folder
    extends winrtLib.WindowsNs.StorageNs.StorageItemTypes
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.StorageNs.StorageItemTypes
  
  /* 1 */ val file: file with scala.Double = js.native
  /* 2 */ val folder: folder with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.StorageItemTypes with scala.Double] = js.native
}


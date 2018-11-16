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
  
  val file: file with java.lang.String = js.native
  val folder: folder with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.StorageItemTypes with java.lang.String] = js.native
}


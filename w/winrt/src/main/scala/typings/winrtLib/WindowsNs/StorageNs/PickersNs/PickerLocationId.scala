package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerLocationId extends js.Object

@JSGlobal("Windows.Storage.Pickers.PickerLocationId")
@js.native
object PickerLocationId extends js.Object {
  @js.native
  sealed trait computerFolder
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  @js.native
  sealed trait desktop
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  @js.native
  sealed trait documentsLibrary
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  @js.native
  sealed trait downloads
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  @js.native
  sealed trait homeGroup
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  @js.native
  sealed trait musicLibrary
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  @js.native
  sealed trait picturesLibrary
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  @js.native
  sealed trait videosLibrary
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  val computerFolder: computerFolder with java.lang.String = js.native
  val desktop: desktop with java.lang.String = js.native
  val documentsLibrary: documentsLibrary with java.lang.String = js.native
  val downloads: downloads with java.lang.String = js.native
  val homeGroup: homeGroup with java.lang.String = js.native
  val musicLibrary: musicLibrary with java.lang.String = js.native
  val picturesLibrary: picturesLibrary with java.lang.String = js.native
  val videosLibrary: videosLibrary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId with java.lang.String] = js.native
}


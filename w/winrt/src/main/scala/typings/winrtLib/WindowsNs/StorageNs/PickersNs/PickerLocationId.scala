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
  
  /* 1 */ val computerFolder: computerFolder with scala.Double = js.native
  /* 2 */ val desktop: desktop with scala.Double = js.native
  /* 0 */ val documentsLibrary: documentsLibrary with scala.Double = js.native
  /* 3 */ val downloads: downloads with scala.Double = js.native
  /* 4 */ val homeGroup: homeGroup with scala.Double = js.native
  /* 5 */ val musicLibrary: musicLibrary with scala.Double = js.native
  /* 6 */ val picturesLibrary: picturesLibrary with scala.Double = js.native
  /* 7 */ val videosLibrary: videosLibrary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.PickersNs.PickerLocationId with scala.Double] = js.native
}


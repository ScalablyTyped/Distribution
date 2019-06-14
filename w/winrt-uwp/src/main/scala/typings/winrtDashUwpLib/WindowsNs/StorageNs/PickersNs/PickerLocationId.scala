package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerLocationId extends js.Object

/** Identifies the storage location that the file picker presents to the user. */
@JSGlobal("Windows.Storage.Pickers.PickerLocationId")
@js.native
object PickerLocationId extends js.Object {
  /** The Computer folder. */
  @js.native
  sealed trait computerFolder
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** The Windows desktop. */
  @js.native
  sealed trait desktop
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** The Documents library. */
  @js.native
  sealed trait documentsLibrary
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** The Downloads folder. */
  @js.native
  sealed trait downloads
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** The HomeGroup. */
  @js.native
  sealed trait homeGroup
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** The Music library. */
  @js.native
  sealed trait musicLibrary
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** The Objects library. */
  @js.native
  sealed trait objects3D
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** The Pictures library. */
  @js.native
  sealed trait picturesLibrary
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** An unspecified location. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /** The Videos library. */
  @js.native
  sealed trait videosLibrary
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId
  
  /* 1 */ val computerFolder: computerFolder with scala.Double = js.native
  /* 2 */ val desktop: desktop with scala.Double = js.native
  /* 0 */ val documentsLibrary: documentsLibrary with scala.Double = js.native
  /* 3 */ val downloads: downloads with scala.Double = js.native
  /* 4 */ val homeGroup: homeGroup with scala.Double = js.native
  /* 5 */ val musicLibrary: musicLibrary with scala.Double = js.native
  /* 8 */ val objects3D: objects3D with scala.Double = js.native
  /* 6 */ val picturesLibrary: picturesLibrary with scala.Double = js.native
  /* 9 */ val unspecified: unspecified with scala.Double = js.native
  /* 7 */ val videosLibrary: videosLibrary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId with scala.Double] = js.native
}


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
  
  val computerFolder: computerFolder with java.lang.String = js.native
  val desktop: desktop with java.lang.String = js.native
  val documentsLibrary: documentsLibrary with java.lang.String = js.native
  val downloads: downloads with java.lang.String = js.native
  val homeGroup: homeGroup with java.lang.String = js.native
  val musicLibrary: musicLibrary with java.lang.String = js.native
  val objects3D: objects3D with java.lang.String = js.native
  val picturesLibrary: picturesLibrary with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  val videosLibrary: videosLibrary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerLocationId with java.lang.String
  ] = js.native
}


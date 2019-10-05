package typings.winrtDashUwp.Windows.Storage.Pickers

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
  sealed trait computerFolder extends PickerLocationId
  
  /** The Windows desktop. */
  @js.native
  sealed trait desktop extends PickerLocationId
  
  /** The Documents library. */
  @js.native
  sealed trait documentsLibrary extends PickerLocationId
  
  /** The Downloads folder. */
  @js.native
  sealed trait downloads extends PickerLocationId
  
  /** The HomeGroup. */
  @js.native
  sealed trait homeGroup extends PickerLocationId
  
  /** The Music library. */
  @js.native
  sealed trait musicLibrary extends PickerLocationId
  
  /** The Objects library. */
  @js.native
  sealed trait objects3D extends PickerLocationId
  
  /** The Pictures library. */
  @js.native
  sealed trait picturesLibrary extends PickerLocationId
  
  /** An unspecified location. */
  @js.native
  sealed trait unspecified extends PickerLocationId
  
  /** The Videos library. */
  @js.native
  sealed trait videosLibrary extends PickerLocationId
  
  /* 1 */ val computerFolder: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.computerFolder with Double = js.native
  /* 2 */ val desktop: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.desktop with Double = js.native
  /* 0 */ val documentsLibrary: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.documentsLibrary with Double = js.native
  /* 3 */ val downloads: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.downloads with Double = js.native
  /* 4 */ val homeGroup: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.homeGroup with Double = js.native
  /* 5 */ val musicLibrary: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.musicLibrary with Double = js.native
  /* 8 */ val objects3D: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.objects3D with Double = js.native
  /* 6 */ val picturesLibrary: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.picturesLibrary with Double = js.native
  /* 9 */ val unspecified: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.unspecified with Double = js.native
  /* 7 */ val videosLibrary: typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.videosLibrary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerLocationId with Double] = js.native
}


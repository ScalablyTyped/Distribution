package typings.winrtDashUwp.Windows.Storage.Pickers

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.computerFolder
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.desktop
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.documentsLibrary
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.downloads
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.homeGroup
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.musicLibrary
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.objects3D
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.picturesLibrary
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.unspecified
import typings.winrtDashUwp.Windows.Storage.Pickers.PickerLocationId.videosLibrary
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerLocationId with Double] = js.native
  /* 1 */ @js.native
  object computerFolder extends TopLevel[computerFolder with Double]
  
  /* 2 */ @js.native
  object desktop extends TopLevel[desktop with Double]
  
  /* 0 */ @js.native
  object documentsLibrary extends TopLevel[documentsLibrary with Double]
  
  /* 3 */ @js.native
  object downloads extends TopLevel[downloads with Double]
  
  /* 4 */ @js.native
  object homeGroup extends TopLevel[homeGroup with Double]
  
  /* 5 */ @js.native
  object musicLibrary extends TopLevel[musicLibrary with Double]
  
  /* 8 */ @js.native
  object objects3D extends TopLevel[objects3D with Double]
  
  /* 6 */ @js.native
  object picturesLibrary extends TopLevel[picturesLibrary with Double]
  
  /* 9 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
  /* 7 */ @js.native
  object videosLibrary extends TopLevel[videosLibrary with Double]
  
}


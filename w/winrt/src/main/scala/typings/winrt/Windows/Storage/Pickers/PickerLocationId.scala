package typings.winrt.Windows.Storage.Pickers

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerLocationId extends js.Object

@JSGlobal("Windows.Storage.Pickers.PickerLocationId")
@js.native
object PickerLocationId extends js.Object {
  @js.native
  sealed trait computerFolder extends PickerLocationId
  
  @js.native
  sealed trait desktop extends PickerLocationId
  
  @js.native
  sealed trait documentsLibrary extends PickerLocationId
  
  @js.native
  sealed trait downloads extends PickerLocationId
  
  @js.native
  sealed trait homeGroup extends PickerLocationId
  
  @js.native
  sealed trait musicLibrary extends PickerLocationId
  
  @js.native
  sealed trait picturesLibrary extends PickerLocationId
  
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
  
  /* 6 */ @js.native
  object picturesLibrary extends TopLevel[picturesLibrary with Double]
  
  /* 7 */ @js.native
  object videosLibrary extends TopLevel[videosLibrary with Double]
  
}


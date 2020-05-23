package typings.winrt.Windows.Storage.Pickers

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
  
}


package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageItemTypes extends js.Object

@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends js.Object {
  @js.native
  sealed trait file extends StorageItemTypes
  
  @js.native
  sealed trait folder extends StorageItemTypes
  
  @js.native
  sealed trait none extends StorageItemTypes
  
  /* 1 */ val file: typings.winrt.Windows.Storage.StorageItemTypes.file with Double = js.native
  /* 2 */ val folder: typings.winrt.Windows.Storage.StorageItemTypes.folder with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Storage.StorageItemTypes.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorageItemTypes with Double] = js.native
}


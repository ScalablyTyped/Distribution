package typings.winrtUwp.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes whether an item that implements the IStorageItem interface is a file or a folder. */
@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends js.Object {
  /* 1 */ val file: typings.winrtUwp.Windows.Storage.StorageItemTypes.file with Double = js.native
  /* 2 */ val folder: typings.winrtUwp.Windows.Storage.StorageItemTypes.folder with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.Storage.StorageItemTypes.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.StorageItemTypes with Double] = js.native
}


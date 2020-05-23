package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageOpenOptions extends js.Object

/** Provides options to use when opening a file. */
@JSGlobal("Windows.Storage.StorageOpenOptions")
@js.native
object StorageOpenOptions extends js.Object {
  /** Only allow the file to be read. */
  @js.native
  sealed trait allowOnlyReaders extends StorageOpenOptions
  
  /** No options are specified. */
  @js.native
  sealed trait none extends StorageOpenOptions
  
}


package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageDeleteOption extends js.Object

@JSGlobal("Windows.Storage.StorageDeleteOption")
@js.native
object StorageDeleteOption extends js.Object {
  @js.native
  sealed trait default extends StorageDeleteOption
  
  @js.native
  sealed trait permanentDelete extends StorageDeleteOption
  
}


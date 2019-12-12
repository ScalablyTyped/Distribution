package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.StorageDeleteOption.default
import typings.winrt.Windows.Storage.StorageDeleteOption.permanentDelete
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorageDeleteOption with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object permanentDelete extends TopLevel[permanentDelete with Double]
  
}


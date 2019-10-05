package typings.winrt.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FolderDepth extends js.Object

@JSGlobal("Windows.Storage.Search.FolderDepth")
@js.native
object FolderDepth extends js.Object {
  @js.native
  sealed trait deep extends FolderDepth
  
  @js.native
  sealed trait shallow extends FolderDepth
  
  /* 1 */ val deep: typings.winrt.Windows.Storage.Search.FolderDepth.deep with Double = js.native
  /* 0 */ val shallow: typings.winrt.Windows.Storage.Search.FolderDepth.shallow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderDepth with Double] = js.native
}


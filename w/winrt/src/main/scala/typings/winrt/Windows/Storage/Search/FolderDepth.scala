package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Search.FolderDepth.deep
import typings.winrt.Windows.Storage.Search.FolderDepth.shallow
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderDepth with Double] = js.native
  /* 1 */ @js.native
  object deep extends TopLevel[deep with Double]
  
  /* 0 */ @js.native
  object shallow extends TopLevel[shallow with Double]
  
}


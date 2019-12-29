package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSelectionMode extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
@js.native
object FileSelectionMode extends js.Object {
  @js.native
  sealed trait multiple extends FileSelectionMode
  
  @js.native
  sealed trait single extends FileSelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSelectionMode with Double] = js.native
  /* 1 */ @js.native
  object multiple extends TopLevel[multiple with Double]
  
  /* 0 */ @js.native
  object single extends TopLevel[single with Double]
  
}


package typings.winrtUwp.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSelectionMode extends js.Object

/** Indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
@JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
@js.native
object FileSelectionMode extends js.Object {
  /** Multiple files can be selected. */
  @js.native
  sealed trait multiple extends FileSelectionMode
  
  /** Only a single file can be selected. */
  @js.native
  sealed trait single extends FileSelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSelectionMode with Double] = js.native
  /* 1 */ @js.native
  object multiple extends TopLevel[multiple with Double]
  
  /* 0 */ @js.native
  object single extends TopLevel[single with Double]
  
}


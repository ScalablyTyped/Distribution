package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileWatcherEventKind extends js.Object

@JSImport("typescript", "FileWatcherEventKind")
@js.native
object FileWatcherEventKind extends js.Object {
  @js.native
  sealed trait Changed
    extends typescriptLib.typescriptMod.FileWatcherEventKind
  
  @js.native
  sealed trait Created
    extends typescriptLib.typescriptMod.FileWatcherEventKind
  
  @js.native
  sealed trait Deleted
    extends typescriptLib.typescriptMod.FileWatcherEventKind
  
  /* 1 */ val Changed: Changed with scala.Double = js.native
  /* 0 */ val Created: Created with scala.Double = js.native
  /* 2 */ val Deleted: Deleted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.FileWatcherEventKind with scala.Double] = js.native
}


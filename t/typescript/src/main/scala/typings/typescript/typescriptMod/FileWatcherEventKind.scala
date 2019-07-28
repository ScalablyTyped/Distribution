package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileWatcherEventKind extends js.Object

@JSImport("typescript", "FileWatcherEventKind")
@js.native
object FileWatcherEventKind extends js.Object {
  @js.native
  sealed trait Changed extends FileWatcherEventKind
  
  @js.native
  sealed trait Created extends FileWatcherEventKind
  
  @js.native
  sealed trait Deleted extends FileWatcherEventKind
  
  /* 1 */ val Changed: typings.typescript.typescriptMod.FileWatcherEventKind.Changed with Double = js.native
  /* 0 */ val Created: typings.typescript.typescriptMod.FileWatcherEventKind.Created with Double = js.native
  /* 2 */ val Deleted: typings.typescript.typescriptMod.FileWatcherEventKind.Deleted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileWatcherEventKind with Double] = js.native
}


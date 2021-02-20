package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileWatcherEventKind extends StObject
@JSImport("typescript", "FileWatcherEventKind")
@js.native
object FileWatcherEventKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileWatcherEventKind with Double] = js.native
  
  @js.native
  sealed trait Changed extends FileWatcherEventKind
  /* 1 */ val Changed: typings.typescript.mod.FileWatcherEventKind.Changed with Double = js.native
  
  @js.native
  sealed trait Created extends FileWatcherEventKind
  /* 0 */ val Created: typings.typescript.mod.FileWatcherEventKind.Created with Double = js.native
  
  @js.native
  sealed trait Deleted extends FileWatcherEventKind
  /* 2 */ val Deleted: typings.typescript.mod.FileWatcherEventKind.Deleted with Double = js.native
}

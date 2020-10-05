package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileWatcherEventKind with Double] = js.native
  /* 1 */ @js.native
  object Changed extends TopLevel[Changed with Double]
  
  /* 0 */ @js.native
  object Created extends TopLevel[Created with Double]
  
  /* 2 */ @js.native
  object Deleted extends TopLevel[Deleted with Double]
  
}


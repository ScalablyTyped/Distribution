package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WatchDirectoryFlags extends js.Object

@JSImport("typescript", "WatchDirectoryFlags")
@js.native
object WatchDirectoryFlags extends js.Object {
  @js.native
  sealed trait None extends WatchDirectoryFlags
  
  @js.native
  sealed trait Recursive extends WatchDirectoryFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryFlags with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Recursive extends TopLevel[Recursive with Double]
  
}


package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryFlags extends js.Object
@JSImport("typescript", "WatchDirectoryFlags")
@js.native
object WatchDirectoryFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryFlags with Double] = js.native
  
  @js.native
  sealed trait None extends WatchDirectoryFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Recursive extends WatchDirectoryFlags
  /* 1 */ @js.native
  object Recursive extends TopLevel[Recursive with Double]
}

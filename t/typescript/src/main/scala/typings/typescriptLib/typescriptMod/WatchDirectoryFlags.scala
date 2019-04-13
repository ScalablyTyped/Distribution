package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WatchDirectoryFlags extends js.Object

@JSImport("typescript", "WatchDirectoryFlags")
@js.native
object WatchDirectoryFlags extends js.Object {
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.WatchDirectoryFlags
  
  @js.native
  sealed trait Recursive
    extends typescriptLib.typescriptMod.WatchDirectoryFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Recursive: Recursive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.WatchDirectoryFlags with scala.Double] = js.native
}


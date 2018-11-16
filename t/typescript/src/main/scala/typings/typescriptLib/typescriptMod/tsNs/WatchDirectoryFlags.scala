package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WatchDirectoryFlags extends js.Object

@JSImport("typescript/ts", "WatchDirectoryFlags")
@js.native
object WatchDirectoryFlags extends js.Object {
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.tsNs.WatchDirectoryFlags
  
  @js.native
  sealed trait Recursive
    extends typescriptLib.typescriptMod.tsNs.WatchDirectoryFlags
  
}


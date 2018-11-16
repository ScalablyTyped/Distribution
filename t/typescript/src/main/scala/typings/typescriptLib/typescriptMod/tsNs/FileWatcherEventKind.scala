package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileWatcherEventKind extends js.Object

@JSImport("typescript/ts", "FileWatcherEventKind")
@js.native
object FileWatcherEventKind extends js.Object {
  @js.native
  sealed trait Changed
    extends typescriptLib.typescriptMod.tsNs.FileWatcherEventKind
  
  @js.native
  sealed trait Created
    extends typescriptLib.typescriptMod.tsNs.FileWatcherEventKind
  
  @js.native
  sealed trait Deleted
    extends typescriptLib.typescriptMod.tsNs.FileWatcherEventKind
  
}


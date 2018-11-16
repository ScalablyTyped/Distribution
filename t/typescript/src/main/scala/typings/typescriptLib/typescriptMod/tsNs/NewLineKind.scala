package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NewLineKind extends js.Object

@JSImport("typescript/ts", "NewLineKind")
@js.native
object NewLineKind extends js.Object {
  @js.native
  sealed trait CarriageReturnLineFeed
    extends typescriptLib.typescriptMod.tsNs.NewLineKind
  
  @js.native
  sealed trait LineFeed
    extends typescriptLib.typescriptMod.tsNs.NewLineKind
  
}


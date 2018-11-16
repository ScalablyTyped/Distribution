package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexKind extends js.Object

@JSImport("typescript/ts", "IndexKind")
@js.native
object IndexKind extends js.Object {
  @js.native
  sealed trait Number
    extends typescriptLib.typescriptMod.tsNs.IndexKind
  
  @js.native
  sealed trait String
    extends typescriptLib.typescriptMod.tsNs.IndexKind
  
}


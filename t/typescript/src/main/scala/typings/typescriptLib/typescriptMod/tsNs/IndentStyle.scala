package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndentStyle extends js.Object

@JSImport("typescript/ts", "IndentStyle")
@js.native
object IndentStyle extends js.Object {
  @js.native
  sealed trait Block
    extends typescriptLib.typescriptMod.tsNs.IndentStyle
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.tsNs.IndentStyle
  
  @js.native
  sealed trait Smart
    extends typescriptLib.typescriptMod.tsNs.IndentStyle
  
}


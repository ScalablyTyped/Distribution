package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndentStyle extends js.Object

@JSImport("typescript", "IndentStyle")
@js.native
object IndentStyle extends js.Object {
  @js.native
  sealed trait Block
    extends typescriptLib.typescriptMod.IndentStyle
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.IndentStyle
  
  @js.native
  sealed trait Smart
    extends typescriptLib.typescriptMod.IndentStyle
  
  /* 1 */ val Block: Block with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Smart: Smart with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.IndentStyle with scala.Double] = js.native
}


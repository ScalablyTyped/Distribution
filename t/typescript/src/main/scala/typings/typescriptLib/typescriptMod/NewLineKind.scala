package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NewLineKind extends js.Object

@JSImport("typescript", "NewLineKind")
@js.native
object NewLineKind extends js.Object {
  @js.native
  sealed trait CarriageReturnLineFeed
    extends typescriptLib.typescriptMod.NewLineKind
  
  @js.native
  sealed trait LineFeed
    extends typescriptLib.typescriptMod.NewLineKind
  
  /* 0 */ val CarriageReturnLineFeed: CarriageReturnLineFeed with scala.Double = js.native
  /* 1 */ val LineFeed: LineFeed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.NewLineKind with scala.Double] = js.native
}


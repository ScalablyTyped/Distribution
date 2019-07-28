package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NewLineKind extends js.Object

@JSImport("typescript", "NewLineKind")
@js.native
object NewLineKind extends js.Object {
  @js.native
  sealed trait CarriageReturnLineFeed extends NewLineKind
  
  @js.native
  sealed trait LineFeed extends NewLineKind
  
  /* 0 */ val CarriageReturnLineFeed: typings.typescript.typescriptMod.NewLineKind.CarriageReturnLineFeed with Double = js.native
  /* 1 */ val LineFeed: typings.typescript.typescriptMod.NewLineKind.LineFeed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
}


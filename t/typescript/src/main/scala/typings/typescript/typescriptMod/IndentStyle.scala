package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndentStyle extends js.Object

@JSImport("typescript", "IndentStyle")
@js.native
object IndentStyle extends js.Object {
  @js.native
  sealed trait Block extends IndentStyle
  
  @js.native
  sealed trait None extends IndentStyle
  
  @js.native
  sealed trait Smart extends IndentStyle
  
  /* 1 */ val Block: typings.typescript.typescriptMod.IndentStyle.Block with Double = js.native
  /* 0 */ val None: typings.typescript.typescriptMod.IndentStyle.None with Double = js.native
  /* 2 */ val Smart: typings.typescript.typescriptMod.IndentStyle.Smart with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentStyle with Double] = js.native
}


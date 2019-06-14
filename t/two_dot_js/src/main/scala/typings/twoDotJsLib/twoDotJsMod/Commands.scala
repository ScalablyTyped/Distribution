package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Commands extends js.Object

@JSImport("two.js", "Commands")
@js.native
object Commands extends js.Object {
  @js.native
  sealed trait arc
    extends twoDotJsLib.twoDotJsMod.Commands
  
  @js.native
  sealed trait close
    extends twoDotJsLib.twoDotJsMod.Commands
  
  @js.native
  sealed trait curve
    extends twoDotJsLib.twoDotJsMod.Commands
  
  @js.native
  sealed trait line
    extends twoDotJsLib.twoDotJsMod.Commands
  
  @js.native
  sealed trait move
    extends twoDotJsLib.twoDotJsMod.Commands
  
  /* 3 */ val arc: arc with scala.Double = js.native
  /* 4 */ val close: close with scala.Double = js.native
  /* 2 */ val curve: curve with scala.Double = js.native
  /* 1 */ val line: line with scala.Double = js.native
  /* 0 */ val move: move with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[twoDotJsLib.twoDotJsMod.Commands with scala.Double] = js.native
}


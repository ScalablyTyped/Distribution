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
  
  val arc: arc with java.lang.String = js.native
  val close: close with java.lang.String = js.native
  val curve: curve with java.lang.String = js.native
  val line: line with java.lang.String = js.native
  val move: move with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[twoDotJsLib.twoDotJsMod.Commands with java.lang.String] = js.native
}


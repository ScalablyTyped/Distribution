package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Types extends js.Object

@JSImport("two.js", "Types")
@js.native
object Types extends js.Object {
  @js.native
  sealed trait canvas
    extends twoDotJsLib.twoDotJsMod.Types
  
  @js.native
  sealed trait svg
    extends twoDotJsLib.twoDotJsMod.Types
  
  @js.native
  sealed trait webgl
    extends twoDotJsLib.twoDotJsMod.Types
  
  /* 2 */ val canvas: canvas with scala.Double = js.native
  /* 0 */ val svg: svg with scala.Double = js.native
  /* 1 */ val webgl: webgl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[twoDotJsLib.twoDotJsMod.Types with scala.Double] = js.native
}


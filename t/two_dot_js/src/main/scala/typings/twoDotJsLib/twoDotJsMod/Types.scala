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
  
  val canvas: canvas with java.lang.String = js.native
  val svg: svg with java.lang.String = js.native
  val webgl: webgl with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[twoDotJsLib.twoDotJsMod.Types with java.lang.String] = js.native
}


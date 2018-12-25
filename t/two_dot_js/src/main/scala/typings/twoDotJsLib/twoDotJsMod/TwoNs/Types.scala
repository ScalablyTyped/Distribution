package typings
package twoDotJsLib.twoDotJsMod.TwoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Types extends js.Object

@JSImport("two.js/Two", "Types")
@js.native
object Types extends js.Object {
  @js.native
  sealed trait canvas
    extends twoDotJsLib.twoDotJsMod.TwoNs.Types
  
  @js.native
  sealed trait svg
    extends twoDotJsLib.twoDotJsMod.TwoNs.Types
  
  @js.native
  sealed trait webgl
    extends twoDotJsLib.twoDotJsMod.TwoNs.Types
  
}


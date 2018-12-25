package typings
package twoDotJsLib.twoDotJsMod.TwoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Commands extends js.Object

@JSImport("two.js/Two", "Commands")
@js.native
object Commands extends js.Object {
  @js.native
  sealed trait arc
    extends twoDotJsLib.twoDotJsMod.TwoNs.Commands
  
  @js.native
  sealed trait close
    extends twoDotJsLib.twoDotJsMod.TwoNs.Commands
  
  @js.native
  sealed trait curve
    extends twoDotJsLib.twoDotJsMod.TwoNs.Commands
  
  @js.native
  sealed trait line
    extends twoDotJsLib.twoDotJsMod.TwoNs.Commands
  
  @js.native
  sealed trait move
    extends twoDotJsLib.twoDotJsMod.TwoNs.Commands
  
}


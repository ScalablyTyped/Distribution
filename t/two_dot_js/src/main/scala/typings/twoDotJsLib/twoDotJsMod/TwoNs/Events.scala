package typings
package twoDotJsLib.twoDotJsMod.TwoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

@JSImport("two.js/Two", "Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait change
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait insert
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait load
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait order
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait pause
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait play
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait remove
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait render
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait resize
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
  @js.native
  sealed trait update
    extends twoDotJsLib.twoDotJsMod.TwoNs.Events
  
}


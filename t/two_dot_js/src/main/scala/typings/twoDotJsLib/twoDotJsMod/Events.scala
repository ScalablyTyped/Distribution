package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

@JSImport("two.js", "Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait change
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait insert
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait load
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait order
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait pause
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait play
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait remove
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait render
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait resize
    extends twoDotJsLib.twoDotJsMod.Events
  
  @js.native
  sealed trait update
    extends twoDotJsLib.twoDotJsMod.Events
  
  /* 0 */ val change: change with scala.Double = js.native
  /* 1 */ val insert: insert with scala.Double = js.native
  /* 2 */ val load: load with scala.Double = js.native
  /* 3 */ val order: order with scala.Double = js.native
  /* 4 */ val pause: pause with scala.Double = js.native
  /* 5 */ val play: play with scala.Double = js.native
  /* 6 */ val remove: remove with scala.Double = js.native
  /* 7 */ val render: render with scala.Double = js.native
  /* 8 */ val resize: resize with scala.Double = js.native
  /* 9 */ val update: update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[twoDotJsLib.twoDotJsMod.Events with scala.Double] = js.native
}


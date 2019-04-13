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
  
  val change: change with java.lang.String = js.native
  val insert: insert with java.lang.String = js.native
  val load: load with java.lang.String = js.native
  val order: order with java.lang.String = js.native
  val pause: pause with java.lang.String = js.native
  val play: play with java.lang.String = js.native
  val remove: remove with java.lang.String = js.native
  val render: render with java.lang.String = js.native
  val resize: resize with java.lang.String = js.native
  val update: update with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[twoDotJsLib.twoDotJsMod.Events with java.lang.String] = js.native
}


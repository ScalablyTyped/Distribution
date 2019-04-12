package typings
package threeLib.srcConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MOUSE extends js.Object

@JSImport("three/src/constants", "MOUSE")
@js.native
object MOUSE extends js.Object {
  @js.native
  sealed trait LEFT
    extends threeLib.srcConstantsMod.MOUSE
  
  @js.native
  sealed trait MIDDLE
    extends threeLib.srcConstantsMod.MOUSE
  
  @js.native
  sealed trait RIGHT
    extends threeLib.srcConstantsMod.MOUSE
  
  val LEFT: LEFT with java.lang.String = js.native
  val MIDDLE: MIDDLE with java.lang.String = js.native
  val RIGHT: RIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[threeLib.srcConstantsMod.MOUSE with java.lang.String] = js.native
}


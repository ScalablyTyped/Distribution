package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MOUSE extends js.Object

@JSImport("three/three-core", "MOUSE")
@js.native
object MOUSE extends js.Object {
  @js.native
  sealed trait LEFT
    extends threeLib.threeDashCoreMod.MOUSE
  
  @js.native
  sealed trait MIDDLE
    extends threeLib.threeDashCoreMod.MOUSE
  
  @js.native
  sealed trait RIGHT
    extends threeLib.threeDashCoreMod.MOUSE
  
  val LEFT: LEFT with java.lang.String = js.native
  val MIDDLE: MIDDLE with java.lang.String = js.native
  val RIGHT: RIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[threeLib.threeDashCoreMod.MOUSE with java.lang.String] = js.native
}


package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Holes extends js.Object {
  var holes: js.Array[js.Array[threeLib.threeDashCoreMod.Vector2]]
  var shape: js.Array[threeLib.threeDashCoreMod.Vector2]
}

object Anon_Holes {
  @scala.inline
  def apply(
    holes: js.Array[js.Array[threeLib.threeDashCoreMod.Vector2]],
    shape: js.Array[threeLib.threeDashCoreMod.Vector2]
  ): Anon_Holes = {
    val __obj = js.Dynamic.literal(holes = holes, shape = shape)
  
    __obj.asInstanceOf[Anon_Holes]
  }
}


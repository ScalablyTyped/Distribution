package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canvas extends js.Object {
  var DOM: visLib.visMod.Position
  var canvas: visLib.visMod.Position
}

object Anon_Canvas {
  @scala.inline
  def apply(DOM: visLib.visMod.Position, canvas: visLib.visMod.Position): Anon_Canvas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DOM")(DOM)
    __obj.updateDynamic("canvas")(canvas)
    __obj.asInstanceOf[Anon_Canvas]
  }
}


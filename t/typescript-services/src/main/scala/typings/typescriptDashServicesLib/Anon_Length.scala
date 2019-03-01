package typings
package typescriptDashServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  var length: scala.Double
  var lineStarts: js.Array[scala.Double]
}

object Anon_Length {
  @scala.inline
  def apply(length: scala.Double, lineStarts: js.Array[scala.Double]): Anon_Length = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("lineStarts")(lineStarts)
    __obj.asInstanceOf[Anon_Length]
  }
}


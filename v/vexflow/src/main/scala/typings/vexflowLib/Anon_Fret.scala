package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fret extends js.Object {
  var fret: scala.Double
  var str: scala.Double
}

object Anon_Fret {
  @scala.inline
  def apply(fret: scala.Double, str: scala.Double): Anon_Fret = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fret")(fret)
    __obj.updateDynamic("str")(str)
    __obj.asInstanceOf[Anon_Fret]
  }
}


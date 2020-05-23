package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fret extends js.Object {
  var fret: Double
  var str: Double
}

object Fret {
  @scala.inline
  def apply(fret: Double, str: Double): Fret = {
    val __obj = js.Dynamic.literal(fret = fret.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fret]
  }
}


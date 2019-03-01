package typings
package wordcloudLib.wordcloudMod.WordCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var h: scala.Double
  var w: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Dimension {
  @scala.inline
  def apply(h: scala.Double, w: scala.Double, x: scala.Double, y: scala.Double): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Dimension]
  }
}


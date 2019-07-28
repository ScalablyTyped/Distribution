package typings.wordcloud.wordcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var h: Double
  var w: Double
  var x: Double
  var y: Double
}

object Dimension {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): Dimension = {
    val __obj = js.Dynamic.literal(h = h, w = w, x = x, y = y)
  
    __obj.asInstanceOf[Dimension]
  }
}


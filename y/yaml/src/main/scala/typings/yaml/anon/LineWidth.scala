package typings.yaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineWidth extends js.Object {
  /**
    * Maximum line width (set to `0` to disable folding).
    *
    * Default: `80`
    */
  var lineWidth: Double
  /**
    * Minimum width for highly-indented content.
    *
    * Default: `20`
    */
  var minContentWidth: Double
}

object LineWidth {
  @scala.inline
  def apply(lineWidth: Double, minContentWidth: Double): LineWidth = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], minContentWidth = minContentWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidth]
  }
}


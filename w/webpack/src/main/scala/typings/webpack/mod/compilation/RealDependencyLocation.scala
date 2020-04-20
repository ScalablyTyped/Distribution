package typings.webpack.mod.compilation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealDependencyLocation extends DependencyLocation {
  var end: js.UndefOr[SourcePosition] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var start: SourcePosition
}

object RealDependencyLocation {
  @scala.inline
  def apply(start: SourcePosition, end: SourcePosition = null, index: Int | Double = null): RealDependencyLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealDependencyLocation]
  }
}


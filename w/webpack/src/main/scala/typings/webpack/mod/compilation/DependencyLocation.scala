package typings.webpack.mod.compilation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webpack.mod.compilation.SynteticDependencyLocation
  - typings.webpack.mod.compilation.RealDependencyLocation
*/
trait DependencyLocation extends js.Object

object DependencyLocation {
  @scala.inline
  def SynteticDependencyLocation(name: String, index: js.UndefOr[Double] = js.undefined): DependencyLocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyLocation]
  }
  @scala.inline
  def RealDependencyLocation(start: SourcePosition, end: SourcePosition = null, index: js.UndefOr[Double] = js.undefined): DependencyLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyLocation]
  }
}


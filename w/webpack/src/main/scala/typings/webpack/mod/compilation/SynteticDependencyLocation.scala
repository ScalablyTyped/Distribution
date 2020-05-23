package typings.webpack.mod.compilation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynteticDependencyLocation extends DependencyLocation {
  var index: js.UndefOr[Double] = js.undefined
  var name: String
}

object SynteticDependencyLocation {
  @scala.inline
  def apply(name: String, index: js.UndefOr[Double] = js.undefined): SynteticDependencyLocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynteticDependencyLocation]
  }
}


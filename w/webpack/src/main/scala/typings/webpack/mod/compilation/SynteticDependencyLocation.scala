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
  def apply(name: String, index: Int | Double = null): SynteticDependencyLocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynteticDependencyLocation]
  }
}


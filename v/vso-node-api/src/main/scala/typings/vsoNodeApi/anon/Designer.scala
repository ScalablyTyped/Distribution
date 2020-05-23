package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Designer extends js.Object {
  var designer: scala.Double
  var yaml: scala.Double
}

object Designer {
  @scala.inline
  def apply(designer: scala.Double, yaml: scala.Double): Designer = {
    val __obj = js.Dynamic.literal(designer = designer.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Designer]
  }
}


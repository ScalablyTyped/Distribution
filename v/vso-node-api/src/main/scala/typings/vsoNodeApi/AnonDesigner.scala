package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDesigner extends js.Object {
  var designer: Double
  var yaml: Double
}

object AnonDesigner {
  @scala.inline
  def apply(designer: Double, yaml: Double): AnonDesigner = {
    val __obj = js.Dynamic.literal(designer = designer.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDesigner]
  }
}


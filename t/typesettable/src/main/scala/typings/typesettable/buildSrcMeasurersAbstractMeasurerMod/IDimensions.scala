package typings.typesettable.buildSrcMeasurersAbstractMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDimensions extends js.Object {
  var height: Double
  var width: Double
}

object IDimensions {
  @scala.inline
  def apply(height: Double, width: Double): IDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDimensions]
  }
}


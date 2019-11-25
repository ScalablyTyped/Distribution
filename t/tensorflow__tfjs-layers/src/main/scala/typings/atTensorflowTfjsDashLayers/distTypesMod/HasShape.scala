package typings.atTensorflowTfjsDashLayers.distTypesMod

import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasShape extends js.Object {
  var shape: Shape
}

object HasShape {
  @scala.inline
  def apply(shape: Shape): HasShape = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HasShape]
  }
}


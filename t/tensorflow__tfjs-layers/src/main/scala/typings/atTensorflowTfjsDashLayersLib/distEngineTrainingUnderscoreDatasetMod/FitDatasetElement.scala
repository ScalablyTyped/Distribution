package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreDatasetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitDatasetElement extends js.Object {
  var xs: atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap
  var ys: atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap
}

object FitDatasetElement {
  @scala.inline
  def apply(
    xs: atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap,
    ys: atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap
  ): FitDatasetElement = {
    val __obj = js.Dynamic.literal(xs = xs.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FitDatasetElement]
  }
}


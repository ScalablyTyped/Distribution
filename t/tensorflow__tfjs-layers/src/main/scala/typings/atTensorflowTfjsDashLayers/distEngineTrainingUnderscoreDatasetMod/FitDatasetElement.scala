package typings.atTensorflowTfjsDashLayers.distEngineTrainingUnderscoreDatasetMod

import typings.atTensorflowTfjsDashLayers.distTypesMod.TensorOrArrayOrMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitDatasetElement extends js.Object {
  var xs: TensorOrArrayOrMap
  var ys: TensorOrArrayOrMap
}

object FitDatasetElement {
  @scala.inline
  def apply(xs: TensorOrArrayOrMap, ys: TensorOrArrayOrMap): FitDatasetElement = {
    val __obj = js.Dynamic.literal(xs = xs.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FitDatasetElement]
  }
}


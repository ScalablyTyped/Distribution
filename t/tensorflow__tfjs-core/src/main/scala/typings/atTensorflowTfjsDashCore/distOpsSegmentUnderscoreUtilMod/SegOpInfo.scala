package typings.atTensorflowTfjsDashCore.distOpsSegmentUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegOpInfo extends js.Object {
  var batchSize: Double
  var inSize: Double
  var numSegments: Double
  var windowSize: Double
}

object SegOpInfo {
  @scala.inline
  def apply(batchSize: Double, inSize: Double, numSegments: Double, windowSize: Double): SegOpInfo = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], inSize = inSize.asInstanceOf[js.Any], numSegments = numSegments.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SegOpInfo]
  }
}


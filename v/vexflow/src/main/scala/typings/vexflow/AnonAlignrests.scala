package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignrests extends js.Object {
  var align_rests: Boolean
  var auto_beam: Boolean
}

object AnonAlignrests {
  @scala.inline
  def apply(align_rests: Boolean, auto_beam: Boolean): AnonAlignrests = {
    val __obj = js.Dynamic.literal(align_rests = align_rests.asInstanceOf[js.Any], auto_beam = auto_beam.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignrests]
  }
}


package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllHosted extends js.Object {
  var all: Double
  var hosted: Double
  var onPremises: Double
}

object Anon_AllHosted {
  @scala.inline
  def apply(all: Double, hosted: Double, onPremises: Double): Anon_AllHosted = {
    val __obj = js.Dynamic.literal(all = all, hosted = hosted, onPremises = onPremises)
  
    __obj.asInstanceOf[Anon_AllHosted]
  }
}


package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlwaysInclude extends js.Object {
  var alwaysInclude: Double
  var onlyIfLicensed: Double
  var onlyIfUnlicensed: Double
}

object AnonAlwaysInclude {
  @scala.inline
  def apply(alwaysInclude: Double, onlyIfLicensed: Double, onlyIfUnlicensed: Double): AnonAlwaysInclude = {
    val __obj = js.Dynamic.literal(alwaysInclude = alwaysInclude.asInstanceOf[js.Any], onlyIfLicensed = onlyIfLicensed.asInstanceOf[js.Any], onlyIfUnlicensed = onlyIfUnlicensed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlwaysInclude]
  }
}


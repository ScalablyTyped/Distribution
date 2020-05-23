package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlwaysInclude extends js.Object {
  var alwaysInclude: scala.Double
  var onlyIfLicensed: scala.Double
  var onlyIfUnlicensed: scala.Double
}

object AlwaysInclude {
  @scala.inline
  def apply(alwaysInclude: scala.Double, onlyIfLicensed: scala.Double, onlyIfUnlicensed: scala.Double): AlwaysInclude = {
    val __obj = js.Dynamic.literal(alwaysInclude = alwaysInclude.asInstanceOf[js.Any], onlyIfLicensed = onlyIfLicensed.asInstanceOf[js.Any], onlyIfUnlicensed = onlyIfUnlicensed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysInclude]
  }
}


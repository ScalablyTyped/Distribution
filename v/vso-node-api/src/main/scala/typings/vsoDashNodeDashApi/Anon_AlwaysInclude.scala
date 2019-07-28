package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysInclude extends js.Object {
  var alwaysInclude: Double
  var onlyIfLicensed: Double
  var onlyIfUnlicensed: Double
}

object Anon_AlwaysInclude {
  @scala.inline
  def apply(alwaysInclude: Double, onlyIfLicensed: Double, onlyIfUnlicensed: Double): Anon_AlwaysInclude = {
    val __obj = js.Dynamic.literal(alwaysInclude = alwaysInclude, onlyIfLicensed = onlyIfLicensed, onlyIfUnlicensed = onlyIfUnlicensed)
  
    __obj.asInstanceOf[Anon_AlwaysInclude]
  }
}


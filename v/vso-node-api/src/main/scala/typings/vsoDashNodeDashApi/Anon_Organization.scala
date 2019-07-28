package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Organization extends js.Object {
  var organization: Double
  var `private`: Double
  var public: Double
  var unchanged: Double
}

object Anon_Organization {
  @scala.inline
  def apply(organization: Double, `private`: Double, public: Double, unchanged: Double): Anon_Organization = {
    val __obj = js.Dynamic.literal(organization = organization, public = public, unchanged = unchanged)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Anon_Organization]
  }
}


package typings.tsutils.usageMod

import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableUse extends js.Object {
  var domain: UsageDomain
  var location: Identifier
}

object VariableUse {
  @scala.inline
  def apply(domain: UsageDomain, location: Identifier): VariableUse = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUse]
  }
}


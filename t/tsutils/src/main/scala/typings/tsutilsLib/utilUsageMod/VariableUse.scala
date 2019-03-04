package typings
package tsutilsLib.utilUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableUse extends js.Object {
  var domain: UsageDomain
  var location: typescriptLib.typescriptMod.tsNs.Identifier
}

object VariableUse {
  @scala.inline
  def apply(domain: UsageDomain, location: typescriptLib.typescriptMod.tsNs.Identifier): VariableUse = {
    val __obj = js.Dynamic.literal(domain = domain, location = location)
  
    __obj.asInstanceOf[VariableUse]
  }
}


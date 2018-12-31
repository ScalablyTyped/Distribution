package typings
package tsutilsLib.utilUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableInfo extends js.Object {
  var declarations: js.Array[typescriptLib.typescriptMod.tsNs.Identifier]
  var domain: DeclarationDomain
  var exported: scala.Boolean
  var inGlobalScope: scala.Boolean
  var uses: js.Array[VariableUse]
}


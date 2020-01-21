package typings.tslint.utilsMod

import typings.tslint.ruleMod.IDisabledInterval
import typings.tslint.ruleMod.RuleFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "doesIntersect")
@js.native
object doesIntersect extends js.Object {
  def apply(failure: RuleFailure, disabledIntervals: js.Array[IDisabledInterval]): Boolean = js.native
}


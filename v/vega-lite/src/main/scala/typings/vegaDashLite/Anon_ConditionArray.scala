package typings.vegaDashLite

import typings.vegaDashLite.buildSrcFielddefMod.Conditional
import typings.vegaDashLite.buildSrcFielddefMod.ValueDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConditionArray extends js.Object {
  var condition: Conditional[ValueDef] | js.Array[Conditional[ValueDef]]
}

object Anon_ConditionArray {
  @scala.inline
  def apply(condition: Conditional[ValueDef] | js.Array[Conditional[ValueDef]]): Anon_ConditionArray = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConditionArray]
  }
}


package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var Descriptor: RuleDescriptor
  var Flag: RuleFlags
  var Operation: RuleOperation
}

object Rule {
  @scala.inline
  def apply(Descriptor: RuleDescriptor, Flag: RuleFlags, Operation: RuleOperation): Rule = {
    val __obj = js.Dynamic.literal(Descriptor = Descriptor.asInstanceOf[js.Any], Flag = Flag.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}


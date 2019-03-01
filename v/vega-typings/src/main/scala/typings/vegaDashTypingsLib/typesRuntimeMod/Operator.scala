package typings
package vegaDashTypingsLib.typesRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator extends js.Object {
  var evaluate: js.Any
  var marshall: js.Any
  var modified: js.Any
  var parameters: js.Any
  var run: js.Any
  var set: js.Any
  var skip: js.Any
  var targets: js.Any
}

object Operator {
  @scala.inline
  def apply(
    evaluate: js.Any,
    marshall: js.Any,
    modified: js.Any,
    parameters: js.Any,
    run: js.Any,
    set: js.Any,
    skip: js.Any,
    targets: js.Any
  ): Operator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evaluate")(evaluate)
    __obj.updateDynamic("marshall")(marshall)
    __obj.updateDynamic("modified")(modified)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("skip")(skip)
    __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[Operator]
  }
}


package typings
package vegaDashTypingsLib.typesRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends Operator

object Transform {
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
  ): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evaluate")(evaluate)
    __obj.updateDynamic("marshall")(marshall)
    __obj.updateDynamic("modified")(modified)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("skip")(skip)
    __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[Transform]
  }
}


package typings.vegaDashTypings.typesRuntimeMod

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
    val __obj = js.Dynamic.literal(evaluate = evaluate, marshall = marshall, modified = modified, parameters = parameters, run = run, set = set, skip = skip, targets = targets)
  
    __obj.asInstanceOf[Operator]
  }
}


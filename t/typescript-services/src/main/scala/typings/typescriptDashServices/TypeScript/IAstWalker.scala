package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAstWalker extends js.Object {
  var options: AstWalkOptions
  var state: js.Any
}

object IAstWalker {
  @scala.inline
  def apply(options: AstWalkOptions, state: js.Any): IAstWalker = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAstWalker]
  }
}


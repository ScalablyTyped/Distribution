package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AstWalkOptions extends js.Object {
  var goChildren: Boolean
  var stopWalking: Boolean
}

object AstWalkOptions {
  @scala.inline
  def apply(goChildren: Boolean, stopWalking: Boolean): AstWalkOptions = {
    val __obj = js.Dynamic.literal(goChildren = goChildren.asInstanceOf[js.Any], stopWalking = stopWalking.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstWalkOptions]
  }
}


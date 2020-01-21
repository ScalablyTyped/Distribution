package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefinition extends js.Object {
  var definition: Double
  var draft: Double
}

object AnonDefinition {
  @scala.inline
  def apply(definition: Double, draft: Double): AnonDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefinition]
  }
}


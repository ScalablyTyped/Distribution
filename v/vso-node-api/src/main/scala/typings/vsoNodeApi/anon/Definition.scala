package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var definition: scala.Double
  var draft: scala.Double
}

object Definition {
  @scala.inline
  def apply(definition: scala.Double, draft: scala.Double): Definition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}


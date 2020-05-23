package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draft extends js.Object {
  var abandoned: scala.Double
  var active: scala.Double
  var draft: scala.Double
  var undefined: scala.Double
}

object Draft {
  @scala.inline
  def apply(abandoned: scala.Double, active: scala.Double, draft: scala.Double, undefined: scala.Double): Draft = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draft]
  }
}


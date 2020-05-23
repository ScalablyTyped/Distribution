package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotSet extends js.Object {
  var abandoned: scala.Double
  var active: scala.Double
  var all: scala.Double
  var completed: scala.Double
  var notSet: scala.Double
}

object NotSet {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    active: scala.Double,
    all: scala.Double,
    completed: scala.Double,
    notSet: scala.Double
  ): NotSet = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotSet]
  }
}


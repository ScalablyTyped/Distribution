package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbandonedActive extends js.Object {
  var abandoned: scala.Double
  var active: scala.Double
  var all: scala.Double
  var completed: scala.Double
  var notSet: scala.Double
}

object Anon_AbandonedActive {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    active: scala.Double,
    all: scala.Double,
    completed: scala.Double,
    notSet: scala.Double
  ): Anon_AbandonedActive = {
    val __obj = js.Dynamic.literal(abandoned = abandoned, active = active, all = all, completed = completed, notSet = notSet)
  
    __obj.asInstanceOf[Anon_AbandonedActive]
  }
}


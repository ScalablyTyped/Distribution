package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbandonedActive extends js.Object {
  var abandoned: Double
  var active: Double
  var all: Double
  var completed: Double
  var notSet: Double
}

object Anon_AbandonedActive {
  @scala.inline
  def apply(abandoned: Double, active: Double, all: Double, completed: Double, notSet: Double): Anon_AbandonedActive = {
    val __obj = js.Dynamic.literal(abandoned = abandoned, active = active, all = all, completed = completed, notSet = notSet)
  
    __obj.asInstanceOf[Anon_AbandonedActive]
  }
}


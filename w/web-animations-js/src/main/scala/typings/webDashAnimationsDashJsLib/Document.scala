package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  val timeline: AnimationTimeline
}

object Document {
  @scala.inline
  def apply(timeline: AnimationTimeline): Document = {
    val __obj = js.Dynamic.literal(timeline = timeline)
  
    __obj.asInstanceOf[Document]
  }
}


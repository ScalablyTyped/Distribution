package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatorEventMap extends ProxyEventMap {
  var pause: AnimatorPauseEvent
  var resume: AnimatorResumeEvent
}

object AnimatorEventMap {
  @scala.inline
  def apply(pause: AnimatorPauseEvent, resume: AnimatorResumeEvent): AnimatorEventMap = {
    val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatorEventMap]
  }
}


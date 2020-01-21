package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitOptions extends js.Object {
  /**
    * For animation you can either use a Boolean to use it with the default options or
    * disable it or you can define the duration (in milliseconds) and easing function manually.
    */
  var animation: TimelineAnimationType
  /**
    * The nodes can be used to zoom to fit only specific nodes in the view.
    */
  var nodes: js.UndefOr[js.Array[String]] = js.undefined
}

object FitOptions {
  @scala.inline
  def apply(animation: TimelineAnimationType, nodes: js.Array[String] = null): FitOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitOptions]
  }
}


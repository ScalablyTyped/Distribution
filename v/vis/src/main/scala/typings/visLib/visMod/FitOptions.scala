package typings
package visLib.visMod

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
  var nodes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}


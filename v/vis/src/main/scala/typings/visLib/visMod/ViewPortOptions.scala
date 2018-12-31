package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewPortOptions extends js.Object {
  /**
    * For animation you can either use a Boolean to use it with the default options or
    * disable it or you can define the duration (in milliseconds) and easing function manually.
    */
  var animation: js.UndefOr[AnimationOptions | scala.Boolean] = js.undefined
  /**
    * The offset (in DOM units) is how many pixels from the center the view is focussed.
    * Default value is {x:0,y:0}
    */
  var offset: js.UndefOr[Position] = js.undefined
  /**
    * The scale is the target zoomlevel.
    * Default value is 1.0.
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
}


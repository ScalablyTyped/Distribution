package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Dom {
  import typings.std.Element

  /**
    * The callback definition for toggleElClass.
    *
    * @param element
    *        The DOM element of the Component.
    *
    * @param classToToggle
    *        The `className` that wants to be toggled
    *
    * @return - If true the `classToToggle` will get added to `element`.
    *         - If false the `classToToggle` will get removed from `element`.
    *         - If undefined this callback will be ignored
    */
  type Predicate = js.Function2[/* element */ Element, /* classToToggle */ String, Boolean]
}

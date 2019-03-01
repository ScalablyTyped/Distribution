package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableOptions extends js.Object {
  /**
    * Animation speed in ms
    * @default 150
    * <h2>Possible value</h2>
    * integer
    */
  var animation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom class added to the dragged element
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var dragCustomClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List group
    * @default false
    * <h2>Possible value</h2>
    * string
    */
  var group: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom class to define elements which can trigger sorting
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var handleClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mouse movement threshold in pixel until trigger element dragging
    * @default 10
    * <h2>Possible value</h2>
    * integer
    */
  var threshold: js.UndefOr[java.lang.String] = js.undefined
}

object SortableOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    dragCustomClass: java.lang.String = null,
    group: java.lang.String = null,
    handleClass: java.lang.String = null,
    threshold: java.lang.String = null
  ): SortableOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (dragCustomClass != null) __obj.updateDynamic("dragCustomClass")(dragCustomClass)
    if (group != null) __obj.updateDynamic("group")(group)
    if (handleClass != null) __obj.updateDynamic("handleClass")(handleClass)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[SortableOptions]
  }
}


package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestableOptions extends js.Object {
  /**
    * Class for collapsed items
    * @default uk-nestable-collapsed
    * <h2>Possible value</h2>
    * string
    */
  var collapsedClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class added to dragged list
    * @default uk-nestable-list-dragged
    * <h2>Possible value</h2>
    * string
    */
  var dragClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class for empty lists
    * @default uk-nestable-empty
    * <h2>Possible value</h2>
    * string
    */
  var emptyClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List group
    * @default false
    * <h2>Possible value</h2>
    * string
    */
  var group: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class for drag handle
    * @default uk-nestable-handle
    * <h2>Possible value</h2>
    * string
    */
  var handleClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Item class
    * @default uk-nestable-item
    * <h2>Possible value</h2>
    * string
    */
  var itemClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Item node name
    * @default li
    * <h2>Possible value</h2>
    * string
    */
  var itemNodeName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List base class
    * @default uk-nestable
    * <h2>Possible value</h2>
    * string
    */
  var listBaseClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List class
    * @default uk-nestable-list
    * <h2>Possible value</h2>
    * string
    */
  var listClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List node name
    * @default ul
    * <h2>Possible value</h2>
    * string
    */
  var listNodeName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List item class
    * @default uk-nestable-list-item
    * <h2>Possible value</h2>
    * string
    */
  var listitemClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Max nesting level
    * @default 10
    * <h2>Possible value</h2>
    * integer
    */
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Class added to <code>&lt;html&gt;</code> when moving
    * @default uk-nestable-moving
    * <h2>Possible value</h2>
    * string
    */
  var movingClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Elements with this class will not trigger dragging. Useful when having the complete item draggable and not
    * just the handle.
    * @default uk-nestable-nodrag
    * <h2>Possible value</h2>
    * string
    */
  var noDragClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Class for placeholder of currently dragged element
    * @default uk-nestable-placeholder
    * <h2>Possible value</h2>
    * string
    */
  var placeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pixel threshold before starting to drag
    * @default 20
    * <h2>Possible value</h2>
    * integer
    */
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object NestableOptions {
  @scala.inline
  def apply(
    collapsedClass: java.lang.String = null,
    dragClass: java.lang.String = null,
    emptyClass: java.lang.String = null,
    group: java.lang.String = null,
    handleClass: java.lang.String = null,
    itemClass: java.lang.String = null,
    itemNodeName: java.lang.String = null,
    listBaseClass: java.lang.String = null,
    listClass: java.lang.String = null,
    listNodeName: java.lang.String = null,
    listitemClass: java.lang.String = null,
    maxDepth: scala.Int | scala.Double = null,
    movingClass: java.lang.String = null,
    noDragClass: java.lang.String = null,
    placeClass: java.lang.String = null,
    threshold: scala.Int | scala.Double = null
  ): NestableOptions = {
    val __obj = js.Dynamic.literal()
    if (collapsedClass != null) __obj.updateDynamic("collapsedClass")(collapsedClass)
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass)
    if (emptyClass != null) __obj.updateDynamic("emptyClass")(emptyClass)
    if (group != null) __obj.updateDynamic("group")(group)
    if (handleClass != null) __obj.updateDynamic("handleClass")(handleClass)
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass)
    if (itemNodeName != null) __obj.updateDynamic("itemNodeName")(itemNodeName)
    if (listBaseClass != null) __obj.updateDynamic("listBaseClass")(listBaseClass)
    if (listClass != null) __obj.updateDynamic("listClass")(listClass)
    if (listNodeName != null) __obj.updateDynamic("listNodeName")(listNodeName)
    if (listitemClass != null) __obj.updateDynamic("listitemClass")(listitemClass)
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (movingClass != null) __obj.updateDynamic("movingClass")(movingClass)
    if (noDragClass != null) __obj.updateDynamic("noDragClass")(noDragClass)
    if (placeClass != null) __obj.updateDynamic("placeClass")(placeClass)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestableOptions]
  }
}


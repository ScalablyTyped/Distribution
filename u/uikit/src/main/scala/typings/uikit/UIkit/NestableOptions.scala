package typings.uikit.UIkit

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
  var collapsedClass: js.UndefOr[String] = js.undefined
  /**
    * Class added to dragged list
    * @default uk-nestable-list-dragged
    * <h2>Possible value</h2>
    * string
    */
  var dragClass: js.UndefOr[String] = js.undefined
  /**
    * Class for empty lists
    * @default uk-nestable-empty
    * <h2>Possible value</h2>
    * string
    */
  var emptyClass: js.UndefOr[String] = js.undefined
  /**
    * List group
    * @default false
    * <h2>Possible value</h2>
    * string
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * Class for drag handle
    * @default uk-nestable-handle
    * <h2>Possible value</h2>
    * string
    */
  var handleClass: js.UndefOr[String] = js.undefined
  /**
    * Item class
    * @default uk-nestable-item
    * <h2>Possible value</h2>
    * string
    */
  var itemClass: js.UndefOr[String] = js.undefined
  /**
    * Item node name
    * @default li
    * <h2>Possible value</h2>
    * string
    */
  var itemNodeName: js.UndefOr[String] = js.undefined
  /**
    * List base class
    * @default uk-nestable
    * <h2>Possible value</h2>
    * string
    */
  var listBaseClass: js.UndefOr[String] = js.undefined
  /**
    * List class
    * @default uk-nestable-list
    * <h2>Possible value</h2>
    * string
    */
  var listClass: js.UndefOr[String] = js.undefined
  /**
    * List node name
    * @default ul
    * <h2>Possible value</h2>
    * string
    */
  var listNodeName: js.UndefOr[String] = js.undefined
  /**
    * List item class
    * @default uk-nestable-list-item
    * <h2>Possible value</h2>
    * string
    */
  var listitemClass: js.UndefOr[String] = js.undefined
  /**
    * Max nesting level
    * @default 10
    * <h2>Possible value</h2>
    * integer
    */
  var maxDepth: js.UndefOr[Double] = js.undefined
  /**
    * Class added to <code>&lt;html&gt;</code> when moving
    * @default uk-nestable-moving
    * <h2>Possible value</h2>
    * string
    */
  var movingClass: js.UndefOr[String] = js.undefined
  /**
    * Elements with this class will not trigger dragging. Useful when having the complete item draggable and not
    * just the handle.
    * @default uk-nestable-nodrag
    * <h2>Possible value</h2>
    * string
    */
  var noDragClass: js.UndefOr[String] = js.undefined
  /**
    * Class for placeholder of currently dragged element
    * @default uk-nestable-placeholder
    * <h2>Possible value</h2>
    * string
    */
  var placeClass: js.UndefOr[String] = js.undefined
  /**
    * Pixel threshold before starting to drag
    * @default 20
    * <h2>Possible value</h2>
    * integer
    */
  var threshold: js.UndefOr[Double] = js.undefined
}

object NestableOptions {
  @scala.inline
  def apply(
    collapsedClass: String = null,
    dragClass: String = null,
    emptyClass: String = null,
    group: String = null,
    handleClass: String = null,
    itemClass: String = null,
    itemNodeName: String = null,
    listBaseClass: String = null,
    listClass: String = null,
    listNodeName: String = null,
    listitemClass: String = null,
    maxDepth: Int | Double = null,
    movingClass: String = null,
    noDragClass: String = null,
    placeClass: String = null,
    threshold: Int | Double = null
  ): NestableOptions = {
    val __obj = js.Dynamic.literal()
    if (collapsedClass != null) __obj.updateDynamic("collapsedClass")(collapsedClass.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass.asInstanceOf[js.Any])
    if (emptyClass != null) __obj.updateDynamic("emptyClass")(emptyClass.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handleClass != null) __obj.updateDynamic("handleClass")(handleClass.asInstanceOf[js.Any])
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass.asInstanceOf[js.Any])
    if (itemNodeName != null) __obj.updateDynamic("itemNodeName")(itemNodeName.asInstanceOf[js.Any])
    if (listBaseClass != null) __obj.updateDynamic("listBaseClass")(listBaseClass.asInstanceOf[js.Any])
    if (listClass != null) __obj.updateDynamic("listClass")(listClass.asInstanceOf[js.Any])
    if (listNodeName != null) __obj.updateDynamic("listNodeName")(listNodeName.asInstanceOf[js.Any])
    if (listitemClass != null) __obj.updateDynamic("listitemClass")(listitemClass.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (movingClass != null) __obj.updateDynamic("movingClass")(movingClass.asInstanceOf[js.Any])
    if (noDragClass != null) __obj.updateDynamic("noDragClass")(noDragClass.asInstanceOf[js.Any])
    if (placeClass != null) __obj.updateDynamic("placeClass")(placeClass.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestableOptions]
  }
}


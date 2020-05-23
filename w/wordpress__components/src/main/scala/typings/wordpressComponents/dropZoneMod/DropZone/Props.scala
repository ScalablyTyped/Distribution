package typings.wordpressComponents.dropZoneMod.DropZone

import typings.react.mod.DragEvent
import typings.std.File
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * A CSS class to be appended after the default components-drop-zone class.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * A string to be shown within the drop zone area.
    * @defaultValue "Drop files to upload"
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The function is generic drop handler called if the onFilesDrop or
    * onHTMLDrop are not called.
    *
    * @param event - Generic `onDrop` event.
    * @param position - Indicates whether the drop event happened closer
    *     to the top or bottom edges and left or right ones.
    */
  var onDrop: js.UndefOr[
    js.Function2[/* event */ DragEvent[HTMLDivElement], /* position */ HoverPosition, Unit]
  ] = js.undefined
  /**
    * The function is called when dropping a file into the DropZone.
    *
    * @param files - Array of dropped files.
    * @param position - Indicates whether the drop event happened closer
    *     to the top or bottom edges and left or right ones.
    */
  var onFilesDrop: js.UndefOr[js.Function2[/* files */ js.Array[File], /* position */ HoverPosition, Unit]] = js.undefined
  /**
    * The function is called when dropping an HTML file into the DropZone.
    *
    * @param html - The HTML string of the file being dropped.
    * @param position - Indicates whether the drop event happened closer
    *     to the top or bottom edges and left or right ones.
    */
  var onHTMLDrop: js.UndefOr[js.Function2[/* html */ String, /* position */ HoverPosition, Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    className: String = null,
    label: String = null,
    onDrop: (/* event */ DragEvent[HTMLDivElement], /* position */ HoverPosition) => Unit = null,
    onFilesDrop: (/* files */ js.Array[File], /* position */ HoverPosition) => Unit = null,
    onHTMLDrop: (/* html */ String, /* position */ HoverPosition) => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2(onDrop))
    if (onFilesDrop != null) __obj.updateDynamic("onFilesDrop")(js.Any.fromFunction2(onFilesDrop))
    if (onHTMLDrop != null) __obj.updateDynamic("onHTMLDrop")(js.Any.fromFunction2(onHTMLDrop))
    __obj.asInstanceOf[Props]
  }
}


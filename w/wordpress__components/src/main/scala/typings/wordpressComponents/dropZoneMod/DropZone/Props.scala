package typings.wordpressComponents.dropZoneMod.DropZone

import typings.react.mod.DragEvent
import typings.std.File
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * A CSS class to be appended after the default components-drop-zone class.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * A string to be shown within the drop zone area.
    * @defaultValue "Drop files to upload"
    */
  var label: js.UndefOr[String] = js.native
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
  ] = js.native
  /**
    * The function is called when dropping a file into the DropZone.
    *
    * @param files - Array of dropped files.
    * @param position - Indicates whether the drop event happened closer
    *     to the top or bottom edges and left or right ones.
    */
  var onFilesDrop: js.UndefOr[js.Function2[/* files */ js.Array[File], /* position */ HoverPosition, Unit]] = js.native
  /**
    * The function is called when dropping an HTML file into the DropZone.
    *
    * @param html - The HTML string of the file being dropped.
    * @param position - Indicates whether the drop event happened closer
    *     to the top or bottom edges and left or right ones.
    */
  var onHTMLDrop: js.UndefOr[js.Function2[/* html */ String, /* position */ HoverPosition, Unit]] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnDrop(value: (/* event */ DragEvent[HTMLDivElement], /* position */ HoverPosition) => Unit): Self = this.set("onDrop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnFilesDrop(value: (/* files */ js.Array[File], /* position */ HoverPosition) => Unit): Self = this.set("onFilesDrop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFilesDrop: Self = this.set("onFilesDrop", js.undefined)
    @scala.inline
    def setOnHTMLDrop(value: (/* html */ String, /* position */ HoverPosition) => Unit): Self = this.set("onHTMLDrop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHTMLDrop: Self = this.set("onHTMLDrop", js.undefined)
  }
  
}


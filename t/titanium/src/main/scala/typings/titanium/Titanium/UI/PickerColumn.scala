package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A picker column, representing a selectable group of items in a <Titanium.UI.Picker>.
  */
@js.native
trait PickerColumn extends View {
  /**
    * Font to use for text.
    */
  var font: Font = js.native
  /**
    * Number of rows in this column.
    */
  val rowCount: Double = js.native
  /**
    * Rows of this column.
    */
  val rows: js.Array[PickerRow] = js.native
  /**
    * Adds a row to this column.
    */
  def addRow(row: PickerRow): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: PickerColumnClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: PickerColumnDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: PickerColumnDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: PickerColumnFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: PickerColumnKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: PickerColumnLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: PickerColumnLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: PickerColumnPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: PickerColumnPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: PickerColumnSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: PickerColumnSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: PickerColumnTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: PickerColumnTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: PickerColumnTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: PickerColumnTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: PickerColumnTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.PickerColumn.font> property.
    * @deprecated Access <Titanium.UI.PickerColumn.font> instead.
    */
  def getFont(): Font = js.native
  /**
    * Gets the value of the <Titanium.UI.PickerColumn.rowCount> property.
    * @deprecated Access <Titanium.UI.PickerColumn.rowCount> instead.
    */
  def getRowCount(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.PickerColumn.rows> property.
    * @deprecated Access <Titanium.UI.PickerColumn.rows> instead.
    */
  def getRows(): js.Array[PickerRow] = js.native
  /**
    * Removes a row from this column.
    */
  def removeRow(row: PickerRow): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.PickerColumn.font> property.
    * @deprecated Set the value using <Titanium.UI.PickerColumn.font> instead.
    */
  def setFont(font: Font): Unit = js.native
}


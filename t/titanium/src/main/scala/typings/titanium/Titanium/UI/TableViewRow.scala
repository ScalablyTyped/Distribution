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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A table view row is an individual item in a table, organized into table view sections.
  */
@js.native
trait TableViewRow extends View {
  
  /**
    * Class name for the row.
    */
  var className: String = js.native
  
  /**
    * Default text color of the row when not selected, as a color name or hex triplet.
    */
  var color: String | Color = js.native
  
  /**
    * Text to display on the delete button when editable is enabled
    */
  var deleteButtonTitle: String = js.native
  
  /**
    * Determines the rows' editable behavior, which allows them to be deleted by the user when the
    * table is in `editing` or `moving` mode.
    */
  var editable: Boolean = js.native
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: TableViewRowClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: TableViewRowDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: TableViewRowDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: TableViewRowFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: TableViewRowKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: TableViewRowLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: TableViewRowLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: TableViewRowPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: TableViewRowPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: TableViewRowSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: TableViewRowSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: TableViewRowTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: TableViewRowTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: TableViewRowTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: TableViewRowTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: TableViewRowTwofingertapEvent): Unit = js.native
  
  /**
    * Font to use for the row title.
    */
  var font: Font = js.native
  
  /**
    * The footer title of the row.
    */
  var footer: String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.className> property.
    * @deprecated Access <Titanium.UI.TableViewRow.className> instead.
    */
  def getClassName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.color> property.
    * @deprecated Access <Titanium.UI.TableViewRow.color> instead.
    */
  def getColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.deleteButtonTitle> property.
    * @deprecated Access <Titanium.UI.TableViewRow.deleteButtonTitle> instead.
    */
  def getDeleteButtonTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.editable> property.
    * @deprecated Access <Titanium.UI.TableViewRow.editable> instead.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.font> property.
    * @deprecated Access <Titanium.UI.TableViewRow.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.footer> property.
    * @deprecated Access <Titanium.UI.TableViewRow.footer> instead.
    */
  def getFooter(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.hasCheck> property.
    * @deprecated Access <Titanium.UI.TableViewRow.hasCheck> instead.
    */
  def getHasCheck(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.hasChild> property.
    * @deprecated Access <Titanium.UI.TableViewRow.hasChild> instead.
    */
  def getHasChild(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.hasDetail> property.
    * @deprecated Access <Titanium.UI.TableViewRow.hasDetail> instead.
    */
  def getHasDetail(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.header> property.
    * @deprecated Access <Titanium.UI.TableViewRow.header> instead.
    */
  def getHeader(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.indentionLevel> property.
    * @deprecated Access <Titanium.UI.TableViewRow.indentionLevel> instead.
    */
  def getIndentionLevel(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.leftImage> property.
    * @deprecated Access <Titanium.UI.TableViewRow.leftImage> instead.
    */
  def getLeftImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.moveable> property.
    * @deprecated Access <Titanium.UI.TableViewRow.moveable> instead.
    */
  def getMoveable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.rightImage> property.
    * @deprecated Access <Titanium.UI.TableViewRow.rightImage> instead.
    */
  def getRightImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.selectedBackgroundColor> property.
    * @deprecated Access <Titanium.UI.TableViewRow.selectedBackgroundColor> instead.
    */
  def getSelectedBackgroundColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.selectedBackgroundImage> property.
    * @deprecated Access <Titanium.UI.TableViewRow.selectedBackgroundImage> instead.
    */
  def getSelectedBackgroundImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.selectedColor> property.
    * @deprecated Access <Titanium.UI.TableViewRow.selectedColor> instead.
    */
  def getSelectedColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.selectionStyle> property.
    * @deprecated Access <Titanium.UI.TableViewRow.selectionStyle> instead.
    */
  def getSelectionStyle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TableViewRow.title> property.
    * @deprecated Access <Titanium.UI.TableViewRow.title> instead.
    */
  def getTitle(): String = js.native
  
  /**
    * Determines whether a system-provided checkmark is displayed on the right-hand side of
    * the row.
    */
  var hasCheck: Boolean = js.native
  
  /**
    * Determines whether a system-provided arrow is displayed on the right-hand side of the row.
    */
  var hasChild: Boolean = js.native
  
  /**
    * Determines whether a system-provided detail disclosure button is displayed on the right-hand
    * side of the row.
    */
  var hasDetail: Boolean = js.native
  
  /**
    * The header title of the row.
    */
  var header: String = js.native
  
  /**
    * Indention level for the row.
    */
  var indentionLevel: Double = js.native
  
  /**
    * Image to render in the left image area of the row, specified as a local path or URL.
    */
  var leftImage: String = js.native
  
  /**
    * Determines the rows' moveable behavior, which allows them to be re-ordered by the user when
    * the table is in `editing` or `moving` mode.
    */
  var moveable: Boolean = js.native
  
  /**
    * Image to render in the right image area of the row, specified as a local path or URL.
    */
  var rightImage: String = js.native
  
  /**
    * Background color to render when the row is selected, as a color name or hex triplet.
    */
  var selectedBackgroundColor: String | Color = js.native
  
  /**
    * Background image to render when the row is selected.
    */
  var selectedBackgroundImage: String = js.native
  
  /**
    * Color of the row text when the row is selected, as a color name or hex triplet.
    */
  var selectedColor: String | Color = js.native
  
  /**
    * Selection style constant to control the selection color.
    */
  var selectionStyle: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.className> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.className> instead.
    */
  def setClassName(className: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.color> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.color> instead.
    */
  def setColor(color: String): Unit = js.native
  def setColor(color: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.deleteButtonTitle> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.deleteButtonTitle> instead.
    */
  def setDeleteButtonTitle(deleteButtonTitle: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.editable> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.editable> instead.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.font> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.footer> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.footer> instead.
    */
  def setFooter(footer: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.hasCheck> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.hasCheck> instead.
    */
  def setHasCheck(hasCheck: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.hasChild> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.hasChild> instead.
    */
  def setHasChild(hasChild: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.hasDetail> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.hasDetail> instead.
    */
  def setHasDetail(hasDetail: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.header> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.header> instead.
    */
  def setHeader(header: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.indentionLevel> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.indentionLevel> instead.
    */
  def setIndentionLevel(indentionLevel: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.leftImage> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.leftImage> instead.
    */
  def setLeftImage(leftImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.moveable> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.moveable> instead.
    */
  def setMoveable(moveable: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.rightImage> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.rightImage> instead.
    */
  def setRightImage(rightImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.selectedBackgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.selectedBackgroundColor> instead.
    */
  def setSelectedBackgroundColor(selectedBackgroundColor: String): Unit = js.native
  def setSelectedBackgroundColor(selectedBackgroundColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.selectedBackgroundImage> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.selectedBackgroundImage> instead.
    */
  def setSelectedBackgroundImage(selectedBackgroundImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.selectedColor> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.selectedColor> instead.
    */
  def setSelectedColor(selectedColor: String): Unit = js.native
  def setSelectedColor(selectedColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.selectionStyle> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.selectionStyle> instead.
    */
  def setSelectionStyle(selectionStyle: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TableViewRow.title> property.
    * @deprecated Set the value using <Titanium.UI.TableViewRow.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * Text to display on the row.
    */
  var title: String = js.native
}

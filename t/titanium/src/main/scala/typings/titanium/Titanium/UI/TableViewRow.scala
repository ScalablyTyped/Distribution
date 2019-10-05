package typings.titanium.Titanium.UI

import typings.titanium.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var color: String = js.native
  /**
  			 * Text to display on the delete button when editable is enabled
  			 */
  var deleteButtonTitle: String = js.native
  /**
  			 * Determines the rows' editable behavior, which allows them to be deleted by the user when the
  			 * table is in `editing` or `moving` mode.
  			 */
  var editable: Boolean = js.native
  /**
  			 * Font to use for the row title.
  			 */
  var font: Font = js.native
  /**
  			 * The footer title of the row.
  			 */
  var footer: String = js.native
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
  var selectedBackgroundColor: String = js.native
  /**
  			 * Background image to render when the row is selected.
  			 */
  var selectedBackgroundImage: String = js.native
  /**
  			 * Color of the row text when the row is selected, as a color name or hex triplet.
  			 */
  var selectedColor: String = js.native
  /**
  			 * Selection style constant to control the selection color.
  			 */
  var selectionStyle: Double = js.native
  /**
  			 * Text to display on the row.
  			 */
  var title: String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.className> property.
  			 */
  def getClassName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.deleteButtonTitle> property.
  			 */
  def getDeleteButtonTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.editable> property.
  			 */
  def getEditable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.footer> property.
  			 */
  def getFooter(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.hasCheck> property.
  			 */
  def getHasCheck(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.hasChild> property.
  			 */
  def getHasChild(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.hasDetail> property.
  			 */
  def getHasDetail(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.header> property.
  			 */
  def getHeader(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.indentionLevel> property.
  			 */
  def getIndentionLevel(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.leftImage> property.
  			 */
  def getLeftImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.moveable> property.
  			 */
  def getMoveable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.rightImage> property.
  			 */
  def getRightImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.selectedBackgroundColor> property.
  			 */
  def getSelectedBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.selectedBackgroundImage> property.
  			 */
  def getSelectedBackgroundImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.selectedColor> property.
  			 */
  def getSelectedColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.selectionStyle> property.
  			 */
  def getSelectionStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.className> property.
  			 */
  def setClassName(className: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.deleteButtonTitle> property.
  			 */
  def setDeleteButtonTitle(deleteButtonTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.editable> property.
  			 */
  def setEditable(editable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.footer> property.
  			 */
  def setFooter(footer: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.hasCheck> property.
  			 */
  def setHasCheck(hasCheck: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.hasChild> property.
  			 */
  def setHasChild(hasChild: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.hasDetail> property.
  			 */
  def setHasDetail(hasDetail: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.header> property.
  			 */
  def setHeader(header: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.indentionLevel> property.
  			 */
  def setIndentionLevel(indentionLevel: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.leftImage> property.
  			 */
  def setLeftImage(leftImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.moveable> property.
  			 */
  def setMoveable(moveable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.rightImage> property.
  			 */
  def setRightImage(rightImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.selectedBackgroundColor> property.
  			 */
  def setSelectedBackgroundColor(selectedBackgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.selectedBackgroundImage> property.
  			 */
  def setSelectedBackgroundImage(selectedBackgroundImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.selectedColor> property.
  			 */
  def setSelectedColor(selectedColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.selectionStyle> property.
  			 */
  def setSelectionStyle(selectionStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
}


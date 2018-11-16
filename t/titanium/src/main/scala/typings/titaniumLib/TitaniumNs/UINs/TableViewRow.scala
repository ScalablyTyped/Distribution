package typings
package titaniumLib.TitaniumNs.UINs

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
  var className: java.lang.String = js.native
  /**
  			 * Default text color of the row when not selected, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Text to display on the delete button when editable is enabled
  			 */
  var deleteButtonTitle: java.lang.String = js.native
  /**
  			 * Determines the rows' editable behavior, which allows them to be deleted by the user when the
  			 * table is in `editing` or `moving` mode.
  			 */
  var editable: scala.Boolean = js.native
  /**
  			 * Font to use for the row title.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * The footer title of the row.
  			 */
  var footer: java.lang.String = js.native
  /**
  			 * Determines whether a system-provided checkmark is displayed on the right-hand side of
  			 * the row.
  			 */
  var hasCheck: scala.Boolean = js.native
  /**
  			 * Determines whether a system-provided arrow is displayed on the right-hand side of the row.
  			 */
  var hasChild: scala.Boolean = js.native
  /**
  			 * Determines whether a system-provided detail disclosure button is displayed on the right-hand
  			 * side of the row.
  			 */
  var hasDetail: scala.Boolean = js.native
  /**
  			 * The header title of the row.
  			 */
  var header: java.lang.String = js.native
  /**
  			 * Indention level for the row.
  			 */
  var indentionLevel: scala.Double = js.native
  /**
  			 * Image to render in the left image area of the row, specified as a local path or URL.
  			 */
  var leftImage: java.lang.String = js.native
  /**
  			 * Determines the rows' moveable behavior, which allows them to be re-ordered by the user when
  			 * the table is in `editing` or `moving` mode.
  			 */
  var moveable: scala.Boolean = js.native
  /**
  			 * Image to render in the right image area of the row, specified as a local path or URL.
  			 */
  var rightImage: java.lang.String = js.native
  /**
  			 * Background color to render when the row is selected, as a color name or hex triplet.
  			 */
  var selectedBackgroundColor: java.lang.String = js.native
  /**
  			 * Background image to render when the row is selected.
  			 */
  var selectedBackgroundImage: java.lang.String = js.native
  /**
  			 * Color of the row text when the row is selected, as a color name or hex triplet.
  			 */
  var selectedColor: java.lang.String = js.native
  /**
  			 * Selection style constant to control the selection color.
  			 */
  var selectionStyle: scala.Double = js.native
  /**
  			 * Text to display on the row.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.className> property.
  			 */
  def getClassName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.deleteButtonTitle> property.
  			 */
  def getDeleteButtonTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.editable> property.
  			 */
  def getEditable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.footer> property.
  			 */
  def getFooter(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.hasCheck> property.
  			 */
  def getHasCheck(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.hasChild> property.
  			 */
  def getHasChild(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.hasDetail> property.
  			 */
  def getHasDetail(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.header> property.
  			 */
  def getHeader(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.indentionLevel> property.
  			 */
  def getIndentionLevel(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.leftImage> property.
  			 */
  def getLeftImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.moveable> property.
  			 */
  def getMoveable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.rightImage> property.
  			 */
  def getRightImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.selectedBackgroundColor> property.
  			 */
  def getSelectedBackgroundColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.selectedBackgroundImage> property.
  			 */
  def getSelectedBackgroundImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.selectedColor> property.
  			 */
  def getSelectedColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.selectionStyle> property.
  			 */
  def getSelectionStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TableViewRow.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.className> property.
  			 */
  def setClassName(className: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.deleteButtonTitle> property.
  			 */
  def setDeleteButtonTitle(deleteButtonTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.editable> property.
  			 */
  def setEditable(editable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.footer> property.
  			 */
  def setFooter(footer: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.hasCheck> property.
  			 */
  def setHasCheck(hasCheck: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.hasChild> property.
  			 */
  def setHasChild(hasChild: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.hasDetail> property.
  			 */
  def setHasDetail(hasDetail: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.header> property.
  			 */
  def setHeader(header: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.indentionLevel> property.
  			 */
  def setIndentionLevel(indentionLevel: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.leftImage> property.
  			 */
  def setLeftImage(leftImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.moveable> property.
  			 */
  def setMoveable(moveable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.rightImage> property.
  			 */
  def setRightImage(rightImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.selectedBackgroundColor> property.
  			 */
  def setSelectedBackgroundColor(selectedBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.selectedBackgroundImage> property.
  			 */
  def setSelectedBackgroundImage(selectedBackgroundImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.selectedColor> property.
  			 */
  def setSelectedColor(selectedColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.selectionStyle> property.
  			 */
  def setSelectionStyle(selectionStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TableViewRow.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
}


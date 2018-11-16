package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A table view section is a container within a table used to organize table view rows.
		 */

trait TableViewSection
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Title of this section footer.
  			 */
  var footerTitle: java.lang.String
  /**
  			 * View to use for this section footer.
  			 */
  var footerView: View
  /**
  			 * Title of this section header.
  			 */
  var headerTitle: java.lang.String
  /**
  			 * View to use for this section header.
  			 */
  var headerView: View
  /**
  			 * Number of rows in this section.
  			 */
  val rowCount: scala.Double
  /**
  			 * Rows in this section.
  			 */
  val rows: js.Array[TableViewRow]
  /**
  			 * Adds a table view row to this section.
  			 */
  def add(row: TableViewRow): scala.Unit
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.footerTitle> property.
  			 */
  def getFooterTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.footerView> property.
  			 */
  def getFooterView(): View
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.headerTitle> property.
  			 */
  def getHeaderTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.headerView> property.
  			 */
  def getHeaderView(): View
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.rowCount> property.
  			 */
  def getRowCount(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.rows> property.
  			 */
  def getRows(): js.Array[TableViewRow]
  /**
  			 * Removes a table view row from this section.
  			 */
  def remove(row: TableViewRow): scala.Unit
  /**
  			 * Returns a row in this section.
  			 */
  def rowAtIndex(index: scala.Double): TableViewRow
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): scala.Unit
}


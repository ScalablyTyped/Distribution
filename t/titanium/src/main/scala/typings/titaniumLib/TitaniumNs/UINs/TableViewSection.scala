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

object TableViewSection {
  @scala.inline
  def apply(
    add: TableViewRow => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    footerTitle: java.lang.String,
    footerView: View,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getFooterTitle: () => java.lang.String,
    getFooterView: () => View,
    getHeaderTitle: () => java.lang.String,
    getHeaderView: () => View,
    getRowCount: () => scala.Double,
    getRows: () => js.Array[TableViewRow],
    headerTitle: java.lang.String,
    headerView: View,
    remove: TableViewRow => scala.Unit,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    rowAtIndex: scala.Double => TableViewRow,
    rowCount: scala.Double,
    rows: js.Array[TableViewRow],
    setBubbleParent: scala.Boolean => scala.Unit,
    setFooterTitle: java.lang.String => scala.Unit,
    setFooterView: js.Any => scala.Unit,
    setHeaderTitle: java.lang.String => scala.Unit,
    setHeaderView: js.Any => scala.Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): TableViewSection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), footerTitle = footerTitle, footerView = footerView, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getFooterTitle = js.Any.fromFunction0(getFooterTitle), getFooterView = js.Any.fromFunction0(getFooterView), getHeaderTitle = js.Any.fromFunction0(getHeaderTitle), getHeaderView = js.Any.fromFunction0(getHeaderView), getRowCount = js.Any.fromFunction0(getRowCount), getRows = js.Any.fromFunction0(getRows), headerTitle = headerTitle, headerView = headerView, remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2(removeEventListener), rowAtIndex = js.Any.fromFunction1(rowAtIndex), rowCount = rowCount, rows = rows, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setFooterTitle = js.Any.fromFunction1(setFooterTitle), setFooterView = js.Any.fromFunction1(setFooterView), setHeaderTitle = js.Any.fromFunction1(setHeaderTitle), setHeaderView = js.Any.fromFunction1(setHeaderView))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[TableViewSection]
  }
}


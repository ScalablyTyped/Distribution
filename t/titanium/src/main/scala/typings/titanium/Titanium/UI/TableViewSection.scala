package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A table view section is a container within a table used to organize table view rows.
		 */
trait TableViewSection extends Proxy {
  /**
  			 * Title of this section footer.
  			 */
  var footerTitle: String
  /**
  			 * View to use for this section footer.
  			 */
  var footerView: View
  /**
  			 * Title of this section header.
  			 */
  var headerTitle: String
  /**
  			 * View to use for this section header.
  			 */
  var headerView: View
  /**
  			 * Number of rows in this section.
  			 */
  val rowCount: Double
  /**
  			 * Rows in this section.
  			 */
  val rows: js.Array[TableViewRow]
  /**
  			 * Adds a table view row to this section.
  			 */
  def add(row: TableViewRow): Unit
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.footerTitle> property.
  			 */
  def getFooterTitle(): String
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.footerView> property.
  			 */
  def getFooterView(): View
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.headerTitle> property.
  			 */
  def getHeaderTitle(): String
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.headerView> property.
  			 */
  def getHeaderView(): View
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.rowCount> property.
  			 */
  def getRowCount(): Double
  /**
  			 * Gets the value of the <Titanium.UI.TableViewSection.rows> property.
  			 */
  def getRows(): js.Array[TableViewRow]
  /**
  			 * Removes a table view row from this section.
  			 */
  def remove(row: TableViewRow): Unit
  /**
  			 * Returns a row in this section.
  			 */
  def rowAtIndex(index: Double): TableViewRow
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.TableViewSection.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): Unit
}

object TableViewSection {
  @scala.inline
  def apply(
    add: TableViewRow => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    footerTitle: String,
    footerView: View,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getFooterTitle: () => String,
    getFooterView: () => View,
    getHeaderTitle: () => String,
    getHeaderView: () => View,
    getRowCount: () => Double,
    getRows: () => js.Array[TableViewRow],
    headerTitle: String,
    headerView: View,
    remove: TableViewRow => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    rowAtIndex: Double => TableViewRow,
    rowCount: Double,
    rows: js.Array[TableViewRow],
    setBubbleParent: Boolean => Unit,
    setFooterTitle: String => Unit,
    setFooterView: js.Any => Unit,
    setHeaderTitle: String => Unit,
    setHeaderView: js.Any => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): TableViewSection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), footerTitle = footerTitle, footerView = footerView, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getFooterTitle = js.Any.fromFunction0(getFooterTitle), getFooterView = js.Any.fromFunction0(getFooterView), getHeaderTitle = js.Any.fromFunction0(getHeaderTitle), getHeaderView = js.Any.fromFunction0(getHeaderView), getRowCount = js.Any.fromFunction0(getRowCount), getRows = js.Any.fromFunction0(getRows), headerTitle = headerTitle, headerView = headerView, remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2(removeEventListener), rowAtIndex = js.Any.fromFunction1(rowAtIndex), rowCount = rowCount, rows = rows, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setFooterTitle = js.Any.fromFunction1(setFooterTitle), setFooterView = js.Any.fromFunction1(setFooterView), setHeaderTitle = js.Any.fromFunction1(setHeaderTitle), setHeaderView = js.Any.fromFunction1(setHeaderView))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[TableViewSection]
  }
}


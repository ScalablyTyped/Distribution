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
    add: js.Function1[TableViewRow, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    footerTitle: java.lang.String,
    footerView: View,
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getFooterTitle: js.Function0[java.lang.String],
    getFooterView: js.Function0[View],
    getHeaderTitle: js.Function0[java.lang.String],
    getHeaderView: js.Function0[View],
    getRowCount: js.Function0[scala.Double],
    getRows: js.Function0[js.Array[TableViewRow]],
    headerTitle: java.lang.String,
    headerView: View,
    remove: js.Function1[TableViewRow, scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    rowAtIndex: js.Function1[scala.Double, TableViewRow],
    rowCount: scala.Double,
    rows: js.Array[TableViewRow],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setFooterTitle: js.Function1[java.lang.String, scala.Unit],
    setFooterView: js.Function1[js.Any, scala.Unit],
    setHeaderTitle: js.Function1[java.lang.String, scala.Unit],
    setHeaderView: js.Function1[js.Any, scala.Unit],
    getLifecycleContainer: js.Function0[Window | TabGroup] = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): TableViewSection = {
    val __obj = js.Dynamic.literal(add = add, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, footerTitle = footerTitle, footerView = footerView, getApiName = getApiName, getBubbleParent = getBubbleParent, getFooterTitle = getFooterTitle, getFooterView = getFooterView, getHeaderTitle = getHeaderTitle, getHeaderView = getHeaderView, getRowCount = getRowCount, getRows = getRows, headerTitle = headerTitle, headerView = headerView, remove = remove, removeEventListener = removeEventListener, rowAtIndex = rowAtIndex, rowCount = rowCount, rows = rows, setBubbleParent = setBubbleParent, setFooterTitle = setFooterTitle, setFooterView = setFooterView, setHeaderTitle = setHeaderTitle, setHeaderView = setHeaderView)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[TableViewSection]
  }
}


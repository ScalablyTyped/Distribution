package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A list section is a container within a list view used to organize list items.
		 */
@js.native
trait ListSection
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Title of this section footer.
  			 */
  var footerTitle: java.lang.String = js.native
  /**
  			 * View to use for this section footer.
  			 */
  var footerView: View = js.native
  /**
  			 * Title of this section header.
  			 */
  var headerTitle: java.lang.String = js.native
  /**
  			 * View to use for this section header.
  			 */
  var headerView: View = js.native
  /**
  			 * Items of this list section.
  			 */
  var items: js.Array[titaniumLib.ListDataItem] = js.native
  /**
  			 * Appends the data entries to the end of the list section.
  			 */
  def appendItems(dataItems: js.Array[titaniumLib.ListDataItem]): scala.Unit = js.native
  def appendItems(dataItems: js.Array[titaniumLib.ListDataItem], animation: titaniumLib.ListViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Removes count entries from the list section at the specified index.
  			 */
  def deleteItemsAt(itemIndex: scala.Double, count: scala.Double): scala.Unit = js.native
  def deleteItemsAt(itemIndex: scala.Double, count: scala.Double, animation: titaniumLib.ListViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.footerTitle> property.
  			 */
  def getFooterTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.footerView> property.
  			 */
  def getFooterView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.headerTitle> property.
  			 */
  def getHeaderTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.headerView> property.
  			 */
  def getHeaderView(): View = js.native
  /**
  			 * Returns the item entry from the list view at the specified index.
  			 */
  def getItemAt(itemIndex: scala.Double): titaniumLib.ListDataItem = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.items> property.
  			 */
  def getItems(): js.Array[titaniumLib.ListDataItem] = js.native
  /**
  			 * Inserts data entries to the list section at the specified index.
  			 */
  def insertItemsAt(itemIndex: scala.Double, dataItems: js.Array[titaniumLib.ListDataItem]): scala.Unit = js.native
  def insertItemsAt(
    itemIndex: scala.Double,
    dataItems: js.Array[titaniumLib.ListDataItem],
    animation: titaniumLib.ListViewAnimationProperties
  ): scala.Unit = js.native
  /**
  			 * Removes count entries from the list section at the specified index,
  			 * then inserts data entries to the list section at the same index.
  			 */
  def replaceItemsAt(index: scala.Double, count: scala.Double, dataItems: js.Array[titaniumLib.ListDataItem]): scala.Unit = js.native
  def replaceItemsAt(
    index: scala.Double,
    count: scala.Double,
    dataItems: js.Array[titaniumLib.ListDataItem],
    animation: titaniumLib.ListViewAnimationProperties
  ): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListSection.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListSection.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListSection.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListSection.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): scala.Unit = js.native
  /**
  			 * Sets the data entries in the list section.
  			 */
  def setItems(dataItems: js.Array[titaniumLib.ListDataItem]): scala.Unit = js.native
  def setItems(dataItems: js.Array[titaniumLib.ListDataItem], animation: titaniumLib.ListViewAnimationProperties): scala.Unit = js.native
  /**
  			 * Updates an item at the specified index.
  			 */
  def updateItemAt(index: scala.Double, dataItem: titaniumLib.ListDataItem): scala.Unit = js.native
  def updateItemAt(
    index: scala.Double,
    dataItem: titaniumLib.ListDataItem,
    animation: titaniumLib.ListViewAnimationProperties
  ): scala.Unit = js.native
}


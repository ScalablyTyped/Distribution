package typings.titanium.TitaniumNs.UINs

import typings.titanium.ListDataItem
import typings.titanium.ListViewAnimationProperties
import typings.titanium.TitaniumNs.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A list section is a container within a list view used to organize list items.
		 */
@js.native
trait ListSection extends Proxy {
  /**
  			 * Title of this section footer.
  			 */
  var footerTitle: String = js.native
  /**
  			 * View to use for this section footer.
  			 */
  var footerView: View = js.native
  /**
  			 * Title of this section header.
  			 */
  var headerTitle: String = js.native
  /**
  			 * View to use for this section header.
  			 */
  var headerView: View = js.native
  /**
  			 * Items of this list section.
  			 */
  var items: js.Array[ListDataItem] = js.native
  /**
  			 * Appends the data entries to the end of the list section.
  			 */
  def appendItems(dataItems: js.Array[ListDataItem]): Unit = js.native
  def appendItems(dataItems: js.Array[ListDataItem], animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Removes count entries from the list section at the specified index.
  			 */
  def deleteItemsAt(itemIndex: Double, count: Double): Unit = js.native
  def deleteItemsAt(itemIndex: Double, count: Double, animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.footerTitle> property.
  			 */
  def getFooterTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.footerView> property.
  			 */
  def getFooterView(): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.headerTitle> property.
  			 */
  def getHeaderTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.headerView> property.
  			 */
  def getHeaderView(): View = js.native
  /**
  			 * Returns the item entry from the list view at the specified index.
  			 */
  def getItemAt(itemIndex: Double): ListDataItem = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ListSection.items> property.
  			 */
  def getItems(): js.Array[ListDataItem] = js.native
  /**
  			 * Inserts data entries to the list section at the specified index.
  			 */
  def insertItemsAt(itemIndex: Double, dataItems: js.Array[ListDataItem]): Unit = js.native
  def insertItemsAt(itemIndex: Double, dataItems: js.Array[ListDataItem], animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Removes count entries from the list section at the specified index,
  			 * then inserts data entries to the list section at the same index.
  			 */
  def replaceItemsAt(index: Double, count: Double, dataItems: js.Array[ListDataItem]): Unit = js.native
  def replaceItemsAt(
    index: Double,
    count: Double,
    dataItems: js.Array[ListDataItem],
    animation: ListViewAnimationProperties
  ): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListSection.footerTitle> property.
  			 */
  def setFooterTitle(footerTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListSection.footerView> property.
  			 */
  def setFooterView(footerView: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListSection.headerTitle> property.
  			 */
  def setHeaderTitle(headerTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ListSection.headerView> property.
  			 */
  def setHeaderView(headerView: js.Any): Unit = js.native
  /**
  			 * Sets the data entries in the list section.
  			 */
  def setItems(dataItems: js.Array[ListDataItem]): Unit = js.native
  def setItems(dataItems: js.Array[ListDataItem], animation: ListViewAnimationProperties): Unit = js.native
  /**
  			 * Updates an item at the specified index.
  			 */
  def updateItemAt(index: Double, dataItem: ListDataItem): Unit = js.native
  def updateItemAt(index: Double, dataItem: ListDataItem, animation: ListViewAnimationProperties): Unit = js.native
}


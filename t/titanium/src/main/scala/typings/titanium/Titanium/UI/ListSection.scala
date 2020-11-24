package typings.titanium.Titanium.UI

import typings.titanium.ListDataItem
import typings.titanium.ListViewAnimationProperties
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list section is a container within a list view used to organize list items.
  */
@js.native
trait ListSection extends Proxy {
  
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
    * Title of this section footer.
    */
  var footerTitle: String = js.native
  
  /**
    * View to use for this section footer.
    */
  var footerView: View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListSection.footerTitle> property.
    * @deprecated Access <Titanium.UI.ListSection.footerTitle> instead.
    */
  def getFooterTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListSection.footerView> property.
    * @deprecated Access <Titanium.UI.ListSection.footerView> instead.
    */
  def getFooterView(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListSection.headerTitle> property.
    * @deprecated Access <Titanium.UI.ListSection.headerTitle> instead.
    */
  def getHeaderTitle(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListSection.headerView> property.
    * @deprecated Access <Titanium.UI.ListSection.headerView> instead.
    */
  def getHeaderView(): View = js.native
  
  /**
    * Returns the item entry from the list view at the specified index.
    */
  def getItemAt(itemIndex: Double): ListDataItem = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListSection.items> property.
    * @deprecated Access <Titanium.UI.ListSection.items> instead.
    */
  def getItems(): js.Array[ListDataItem] = js.native
  
  /**
    * Title of this section header.
    */
  var headerTitle: String = js.native
  
  /**
    * View to use for this section header.
    */
  var headerView: View = js.native
  
  /**
    * Inserts data entries to the list section at the specified index.
    */
  def insertItemsAt(itemIndex: Double, dataItems: js.Array[ListDataItem]): Unit = js.native
  def insertItemsAt(itemIndex: Double, dataItems: js.Array[ListDataItem], animation: ListViewAnimationProperties): Unit = js.native
  
  /**
    * Items of this list section.
    */
  var items: js.Array[ListDataItem] = js.native
  
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
    * @deprecated Set the value using <Titanium.UI.ListSection.footerTitle> instead.
    */
  def setFooterTitle(footerTitle: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListSection.footerView> property.
    * @deprecated Set the value using <Titanium.UI.ListSection.footerView> instead.
    */
  def setFooterView(footerView: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListSection.headerTitle> property.
    * @deprecated Set the value using <Titanium.UI.ListSection.headerTitle> instead.
    */
  def setHeaderTitle(headerTitle: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListSection.headerView> property.
    * @deprecated Set the value using <Titanium.UI.ListSection.headerView> instead.
    */
  def setHeaderView(headerView: View): Unit = js.native
  
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

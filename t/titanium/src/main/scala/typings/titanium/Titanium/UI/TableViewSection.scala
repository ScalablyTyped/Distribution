package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A table view section is a container within a table used to organize table view rows.
  */
@js.native
trait TableViewSection extends Proxy {
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
    * Number of rows in this section.
    */
  val rowCount: Double = js.native
  /**
    * Rows in this section.
    */
  val rows: js.Array[TableViewRow] = js.native
  /**
    * Adds a table view row to this section.
    */
  def add(row: TableViewRow): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.TableViewSection.footerTitle> property.
    * @deprecated Access <Titanium.UI.TableViewSection.footerTitle> instead.
    */
  def getFooterTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TableViewSection.footerView> property.
    * @deprecated Access <Titanium.UI.TableViewSection.footerView> instead.
    */
  def getFooterView(): View = js.native
  /**
    * Gets the value of the <Titanium.UI.TableViewSection.headerTitle> property.
    * @deprecated Access <Titanium.UI.TableViewSection.headerTitle> instead.
    */
  def getHeaderTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.TableViewSection.headerView> property.
    * @deprecated Access <Titanium.UI.TableViewSection.headerView> instead.
    */
  def getHeaderView(): View = js.native
  /**
    * Gets the value of the <Titanium.UI.TableViewSection.rowCount> property.
    * @deprecated Access <Titanium.UI.TableViewSection.rowCount> instead.
    */
  def getRowCount(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.TableViewSection.rows> property.
    * @deprecated Access <Titanium.UI.TableViewSection.rows> instead.
    */
  def getRows(): js.Array[TableViewRow] = js.native
  /**
    * Removes a table view row from this section.
    */
  def remove(row: TableViewRow): Unit = js.native
  /**
    * Returns a row in this section.
    */
  def rowAtIndex(index: Double): TableViewRow = js.native
  /**
    * Sets the value of the <Titanium.UI.TableViewSection.footerTitle> property.
    * @deprecated Set the value using <Titanium.UI.TableViewSection.footerTitle> instead.
    */
  def setFooterTitle(footerTitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableViewSection.footerView> property.
    * @deprecated Set the value using <Titanium.UI.TableViewSection.footerView> instead.
    */
  def setFooterView(footerView: View): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableViewSection.headerTitle> property.
    * @deprecated Set the value using <Titanium.UI.TableViewSection.headerTitle> instead.
    */
  def setHeaderTitle(headerTitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TableViewSection.headerView> property.
    * @deprecated Set the value using <Titanium.UI.TableViewSection.headerView> instead.
    */
  def setHeaderView(headerView: View): Unit = js.native
}


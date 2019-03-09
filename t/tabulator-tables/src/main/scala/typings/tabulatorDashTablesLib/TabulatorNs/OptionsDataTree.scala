package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsDataTree extends js.Object {
  /** To enable data trees in your table, set the dataTree property to true in your table constructor: */
  var dataTree: js.UndefOr[scala.Boolean] = js.undefined
  /** Show tree branch icon	 */
  var dataTreeBranchElement: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** By default Tabulator will look for child rows in the _children field of a row data object. You can change this to look in a different field using the dataTreeChildField property in your table constructor: */
  var dataTreeChildField: js.UndefOr[java.lang.String] = js.undefined
  /** Tree level indent in pixels	 */
  var dataTreeChildIndent: js.UndefOr[scala.Double] = js.undefined
  /** The toggle button that allows users to collapse and expand the column can be customised to meet your needs. There are two options, dataTreeExpandElement and dataTreeCollapseElement, that can be set to replace the default toggle elements with your own.
    Both options can take either an html string representing the contents of the toggle element */
  var dataTreeCollapseElement: js.UndefOr[java.lang.String | stdLib.HTMLElement | scala.Boolean] = js.undefined
  /**  By default the toggle element will be inserted into the first column on the table. If you want the toggle element to be inserted in a different column you can pass the feild name of the column to the dataTreeElementColumn setup option*/
  var dataTreeElementColumn: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** The toggle button that allows users to expand the column */
  var dataTreeExpandElement: js.UndefOr[java.lang.String | stdLib.HTMLElement | scala.Boolean] = js.undefined
  /**  By default all nodes on the tree will start collapsed, you can customize the initial expansion state of the tree using the dataTreeStartExpanded option.*
    This option can take one of three possible value types, either a boolean to indicate whether all nodes should start expanded or collapsed: */
  var dataTreeStartExpanded: js.UndefOr[
    scala.Boolean | js.Array[scala.Boolean] | (js.Function2[/* row */ RowComponent, /* level */ scala.Double, scala.Boolean])
  ] = js.undefined
}

object OptionsDataTree {
  @scala.inline
  def apply(
    dataTree: js.UndefOr[scala.Boolean] = js.undefined,
    dataTreeBranchElement: scala.Boolean | java.lang.String = null,
    dataTreeChildField: java.lang.String = null,
    dataTreeChildIndent: scala.Int | scala.Double = null,
    dataTreeCollapseElement: java.lang.String | stdLib.HTMLElement | scala.Boolean = null,
    dataTreeElementColumn: scala.Boolean | java.lang.String = null,
    dataTreeExpandElement: java.lang.String | stdLib.HTMLElement | scala.Boolean = null,
    dataTreeStartExpanded: scala.Boolean | js.Array[scala.Boolean] | (js.Function2[/* row */ RowComponent, /* level */ scala.Double, scala.Boolean]) = null
  ): OptionsDataTree = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataTree)) __obj.updateDynamic("dataTree")(dataTree)
    if (dataTreeBranchElement != null) __obj.updateDynamic("dataTreeBranchElement")(dataTreeBranchElement.asInstanceOf[js.Any])
    if (dataTreeChildField != null) __obj.updateDynamic("dataTreeChildField")(dataTreeChildField)
    if (dataTreeChildIndent != null) __obj.updateDynamic("dataTreeChildIndent")(dataTreeChildIndent.asInstanceOf[js.Any])
    if (dataTreeCollapseElement != null) __obj.updateDynamic("dataTreeCollapseElement")(dataTreeCollapseElement.asInstanceOf[js.Any])
    if (dataTreeElementColumn != null) __obj.updateDynamic("dataTreeElementColumn")(dataTreeElementColumn.asInstanceOf[js.Any])
    if (dataTreeExpandElement != null) __obj.updateDynamic("dataTreeExpandElement")(dataTreeExpandElement.asInstanceOf[js.Any])
    if (dataTreeStartExpanded != null) __obj.updateDynamic("dataTreeStartExpanded")(dataTreeStartExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsDataTree]
  }
}


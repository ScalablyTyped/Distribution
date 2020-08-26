package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsDataTree extends js.Object {
  /** To enable data trees in your table, set the dataTree property to true in your table constructor: */
  var dataTree: js.UndefOr[Boolean] = js.native
  /** Show tree branch icon     */
  var dataTreeBranchElement: js.UndefOr[Boolean | String] = js.native
  /** By default Tabulator will look for child rows in the _children field of a row data object. You can change this to look in a different field using the dataTreeChildField property in your table constructor: */
  var dataTreeChildField: js.UndefOr[String] = js.native
  /** Tree level indent in pixels     */
  var dataTreeChildIndent: js.UndefOr[Double] = js.native
  /** The toggle button that allows users to collapse and expand the column can be customised to meet your needs. There are two options, dataTreeExpandElement and dataTreeCollapseElement, that can be set to replace the default toggle elements with your own.
    Both options can take either an html string representing the contents of the toggle element */
  var dataTreeCollapseElement: js.UndefOr[String | HTMLElement | Boolean] = js.native
  /**  By default the toggle element will be inserted into the first column on the table. If you want the toggle element to be inserted in a different column you can pass the feild name of the column to the dataTreeElementColumn setup option*/
  var dataTreeElementColumn: js.UndefOr[Boolean | String] = js.native
  /** The toggle button that allows users to expand the column */
  var dataTreeExpandElement: js.UndefOr[String | HTMLElement | Boolean] = js.native
  /**Propagte selection events from parent rows to children */
  var dataTreeSelectPropagate: js.UndefOr[Boolean] = js.native
  /**  By default all nodes on the tree will start collapsed, you can customize the initial expansion state of the tree using the dataTreeStartExpanded option.*
    This option can take one of three possible value types, either a boolean to indicate whether all nodes should start expanded or collapsed: */
  var dataTreeStartExpanded: js.UndefOr[
    Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean])
  ] = js.native
}

object OptionsDataTree {
  @scala.inline
  def apply(): OptionsDataTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsDataTree]
  }
  @scala.inline
  implicit class OptionsDataTreeOps[Self <: OptionsDataTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataTree(value: Boolean): Self = this.set("dataTree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTree: Self = this.set("dataTree", js.undefined)
    @scala.inline
    def setDataTreeBranchElement(value: Boolean | String): Self = this.set("dataTreeBranchElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTreeBranchElement: Self = this.set("dataTreeBranchElement", js.undefined)
    @scala.inline
    def setDataTreeChildField(value: String): Self = this.set("dataTreeChildField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTreeChildField: Self = this.set("dataTreeChildField", js.undefined)
    @scala.inline
    def setDataTreeChildIndent(value: Double): Self = this.set("dataTreeChildIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTreeChildIndent: Self = this.set("dataTreeChildIndent", js.undefined)
    @scala.inline
    def setDataTreeCollapseElement(value: String | HTMLElement | Boolean): Self = this.set("dataTreeCollapseElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTreeCollapseElement: Self = this.set("dataTreeCollapseElement", js.undefined)
    @scala.inline
    def setDataTreeElementColumn(value: Boolean | String): Self = this.set("dataTreeElementColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTreeElementColumn: Self = this.set("dataTreeElementColumn", js.undefined)
    @scala.inline
    def setDataTreeExpandElement(value: String | HTMLElement | Boolean): Self = this.set("dataTreeExpandElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTreeExpandElement: Self = this.set("dataTreeExpandElement", js.undefined)
    @scala.inline
    def setDataTreeSelectPropagate(value: Boolean): Self = this.set("dataTreeSelectPropagate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTreeSelectPropagate: Self = this.set("dataTreeSelectPropagate", js.undefined)
    @scala.inline
    def setDataTreeStartExpandedFunction2(value: (/* row */ RowComponent, /* level */ Double) => Boolean): Self = this.set("dataTreeStartExpanded", js.Any.fromFunction2(value))
    @scala.inline
    def setDataTreeStartExpandedVarargs(value: Boolean*): Self = this.set("dataTreeStartExpanded", js.Array(value :_*))
    @scala.inline
    def setDataTreeStartExpanded(
      value: Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean])
    ): Self = this.set("dataTreeStartExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTreeStartExpanded: Self = this.set("dataTreeStartExpanded", js.undefined)
  }
  
}


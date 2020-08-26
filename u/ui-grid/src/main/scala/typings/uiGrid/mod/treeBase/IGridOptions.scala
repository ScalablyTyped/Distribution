package typings.uiGrid.mod.treeBase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions[TEntity] extends js.Object {
  /**
    * If set to true, show the expand/collapse button even if there are no children of a node.
    * You'd use this if you're planning to dynamically load the children
    * Defaults to true, grouping overrides to false
    * @default true
    */
  var showTreeExpandNoChildren: js.UndefOr[Boolean] = js.native
  /**
    * If set to false, don't create the row header. Youll need to programatically control the expand states
    * Defaults to true
    * @default true
    */
  var showTreeRowHeader: js.UndefOr[Boolean] = js.native
  /**
    * Define custom aggregation functions.
    * The properties of this object will be aggregation types available for use on columnDef
    * with treeAggregationType or through the column menu.
    *
    * If a function defined here uses the same name as one of the native aggregations,
    * this one will take precedence
    *
    * The finalizerFn may be used to manipulate the value before rendering, or to apply a custom rendered
    * value. If aggregation.rendered is left undefined, the value will be rendered. Note that the native
    * aggregation functions use an finalizerFn to concatenate the label and the value.
    *
    * Defaults to {}
    * @default {}
    */
  var treeCustomAggregations: js.UndefOr[StringDictionary[IGridTreeBaseCustomAggregation[TEntity]]] = js.native
  /**
    * Number of pixels of indent for the icon at each tree level, wider indents are visually more pleasing,
    * but will make the tree row header wider
    * Defaults to 10
    *
    * @default 10
    */
  var treeIndent: js.UndefOr[Double] = js.native
  /**
    * If set to true, row header even if there are no tree nodes
    */
  var treeRowHeaderAlwaysVisible: js.UndefOr[Boolean] = js.native
  /**
    * Base width of the tree header, provides for a single level of tree.
    * This is incremented by treeIndent for each extra level
    * Defaults to 30
    *
    * @default 30
    */
  var treeRowHeaderBaseWidth: js.UndefOr[Double] = js.native
}

object IGridOptions {
  @scala.inline
  def apply[TEntity](): IGridOptions[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions[TEntity]]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions[_], TEntity] (val x: Self with IGridOptions[TEntity]) extends AnyVal {
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
    def setShowTreeExpandNoChildren(value: Boolean): Self = this.set("showTreeExpandNoChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTreeExpandNoChildren: Self = this.set("showTreeExpandNoChildren", js.undefined)
    @scala.inline
    def setShowTreeRowHeader(value: Boolean): Self = this.set("showTreeRowHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTreeRowHeader: Self = this.set("showTreeRowHeader", js.undefined)
    @scala.inline
    def setTreeCustomAggregations(value: StringDictionary[IGridTreeBaseCustomAggregation[TEntity]]): Self = this.set("treeCustomAggregations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeCustomAggregations: Self = this.set("treeCustomAggregations", js.undefined)
    @scala.inline
    def setTreeIndent(value: Double): Self = this.set("treeIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeIndent: Self = this.set("treeIndent", js.undefined)
    @scala.inline
    def setTreeRowHeaderAlwaysVisible(value: Boolean): Self = this.set("treeRowHeaderAlwaysVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeRowHeaderAlwaysVisible: Self = this.set("treeRowHeaderAlwaysVisible", js.undefined)
    @scala.inline
    def setTreeRowHeaderBaseWidth(value: Double): Self = this.set("treeRowHeaderBaseWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeRowHeaderBaseWidth: Self = this.set("treeRowHeaderBaseWidth", js.undefined)
  }
  
}


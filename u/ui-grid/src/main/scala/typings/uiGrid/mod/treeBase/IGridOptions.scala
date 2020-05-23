package typings.uiGrid.mod.treeBase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions[TEntity] extends js.Object {
  /**
    * If set to true, show the expand/collapse button even if there are no children of a node.
    * You'd use this if you're planning to dynamically load the children
    * Defaults to true, grouping overrides to false
    * @default true
    */
  var showTreeExpandNoChildren: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false, don't create the row header. Youll need to programatically control the expand states
    * Defaults to true
    * @default true
    */
  var showTreeRowHeader: js.UndefOr[Boolean] = js.undefined
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
  var treeCustomAggregations: js.UndefOr[StringDictionary[IGridTreeBaseCustomAggregation[TEntity]]] = js.undefined
  /**
    * Number of pixels of indent for the icon at each tree level, wider indents are visually more pleasing,
    * but will make the tree row header wider
    * Defaults to 10
    *
    * @default 10
    */
  var treeIndent: js.UndefOr[Double] = js.undefined
  /**
    * If set to true, row header even if there are no tree nodes
    */
  var treeRowHeaderAlwaysVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Base width of the tree header, provides for a single level of tree.
    * This is incremented by treeIndent for each extra level
    * Defaults to 30
    *
    * @default 30
    */
  var treeRowHeaderBaseWidth: js.UndefOr[Double] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply[TEntity](
    showTreeExpandNoChildren: js.UndefOr[Boolean] = js.undefined,
    showTreeRowHeader: js.UndefOr[Boolean] = js.undefined,
    treeCustomAggregations: StringDictionary[IGridTreeBaseCustomAggregation[TEntity]] = null,
    treeIndent: js.UndefOr[Double] = js.undefined,
    treeRowHeaderAlwaysVisible: js.UndefOr[Boolean] = js.undefined,
    treeRowHeaderBaseWidth: js.UndefOr[Double] = js.undefined
  ): IGridOptions[TEntity] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showTreeExpandNoChildren)) __obj.updateDynamic("showTreeExpandNoChildren")(showTreeExpandNoChildren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTreeRowHeader)) __obj.updateDynamic("showTreeRowHeader")(showTreeRowHeader.get.asInstanceOf[js.Any])
    if (treeCustomAggregations != null) __obj.updateDynamic("treeCustomAggregations")(treeCustomAggregations.asInstanceOf[js.Any])
    if (!js.isUndefined(treeIndent)) __obj.updateDynamic("treeIndent")(treeIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(treeRowHeaderAlwaysVisible)) __obj.updateDynamic("treeRowHeaderAlwaysVisible")(treeRowHeaderAlwaysVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(treeRowHeaderBaseWidth)) __obj.updateDynamic("treeRowHeaderBaseWidth")(treeRowHeaderBaseWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions[TEntity]]
  }
}


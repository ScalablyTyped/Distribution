package typings.uiGrid.mod.treeBase

import typings.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef[TEntity] extends js.Object {
  /**
    * A custom function that populates aggregation.rendered.
    * This is called when a particular aggregation has been fully calculated, and we want to render the value.
    *
    * With the native aggregation options we just concatenate aggregation.label and aggregation.value,
    * but if you wanted to apply a filter or otherwise manipulate the label or the value,
    * you can do so with this function.
    *
    * This function will be called after the the default finalizerFn.  Defaults to undefined
    * @default undefined
    * @param {IGridTreeBaseAggregationObject} aggregation Aggregation object
    */
  var customTreeAggregationFinalizerFn: js.UndefOr[js.Function1[/* aggregation */ IGridTreeBaseAggregationObject, Unit]] = js.native
  /**
    * A custom function that aggregates rows into some form of total.
    * Aggregations run row-by-row, the function needs to be capable of creating a running total.
    *
    * The function will be provided the aggregation item (in which you can store running totals),
    * the row value that is to be aggregated,
    * and that same row value converted to a number (most aggregations work on numbers)
    * @param {IGridTreeBaseAggregationObject} aggregation
    * @param {any} fieldValue Value of the field
    * @param {number} numValue Numeric value of the field
    * @param {IGridRow} row Row objet
    */
  var customTreeAggregationFn: js.UndefOr[
    js.Function4[
      /* aggregation */ IGridTreeBaseAggregationObject, 
      /* fieldValue */ js.Any, 
      /* numValue */ Double, 
      /* row */ IGridRowOf[TEntity], 
      Unit
    ]
  ] = js.native
  /**
    * A custom label to use for this aggregation.  If providedm, we don't use native i18n
    */
  var treeAggregationLabel: js.UndefOr[String] = js.native
  /**
    * Use one of the native or grid-level aggregation methods for calculating aggregations on this column.
    * Native method are in the constants file and include: SUM, COUNT, MIN, MAX, AVG.
    * This may also be the name of an aggregation function defined with treeCustomAggregations.
    *
    * If you are using aggregations you should either:
    * * also use grouping, in which case the aggregations are displayed in the group header, OR
    * * use treeView, in which case you can set `treeAggregationUpdateEntity: true` in the colDef, and
    * treeBase
    *   will store the aggregation information in the entity, or you can set `treeAggregationUpdateEntity:
    * false` in the colDef, and you need to manual retrieve the calculated aggregations from the
    * row.treeNode.aggregations
    *
    * Takes precedence over a treeAggregationFn, the two options should not be used together.
    * Defaults to undefined.
    * @default undefined
    */
  var treeAggregationType: js.UndefOr[String] = js.native
  /**
    * Store calculated aggregations into the entity,
    * allowing them to be displayed in the grid using a standard cellTemplate.
    * This defaults to true.
    * If you are using grouping then you shouldn't set it to false, as then the aggregations won't display.
    *
    * If you are using treeView in most cases you'll want to set this to true.
    * This will result in getCellValue returning the aggregation rather than whatever was stored in the cell
    * attribute on the entity.
    *
    * If you want to render the underlying entity value (and do something else with the aggregation),
    * then you could use a custom cellTemplate to display row.entity.myAttribute, rather than using
    * getCellValue.
    *
    * Defaults to true
    * @default true
    */
  var treeAggregationUpdateEntity: js.UndefOr[Boolean] = js.native
}

object IColumnDef {
  @scala.inline
  def apply[TEntity](): IColumnDef[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef[TEntity]]
  }
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef[_], TEntity] (val x: Self with IColumnDef[TEntity]) extends AnyVal {
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
    def setCustomTreeAggregationFinalizerFn(value: /* aggregation */ IGridTreeBaseAggregationObject => Unit): Self = this.set("customTreeAggregationFinalizerFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomTreeAggregationFinalizerFn: Self = this.set("customTreeAggregationFinalizerFn", js.undefined)
    @scala.inline
    def setCustomTreeAggregationFn(
      value: (/* aggregation */ IGridTreeBaseAggregationObject, /* fieldValue */ js.Any, /* numValue */ Double, /* row */ IGridRowOf[TEntity]) => Unit
    ): Self = this.set("customTreeAggregationFn", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCustomTreeAggregationFn: Self = this.set("customTreeAggregationFn", js.undefined)
    @scala.inline
    def setTreeAggregationLabel(value: String): Self = this.set("treeAggregationLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeAggregationLabel: Self = this.set("treeAggregationLabel", js.undefined)
    @scala.inline
    def setTreeAggregationType(value: String): Self = this.set("treeAggregationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeAggregationType: Self = this.set("treeAggregationType", js.undefined)
    @scala.inline
    def setTreeAggregationUpdateEntity(value: Boolean): Self = this.set("treeAggregationUpdateEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeAggregationUpdateEntity: Self = this.set("treeAggregationUpdateEntity", js.undefined)
  }
  
}


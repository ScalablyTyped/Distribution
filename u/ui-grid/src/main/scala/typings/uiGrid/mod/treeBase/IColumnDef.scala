package typings.uiGrid.mod.treeBase

import typings.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var customTreeAggregationFinalizerFn: js.UndefOr[js.Function1[/* aggregation */ IGridTreeBaseAggregationObject, Unit]] = js.undefined
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
  ] = js.undefined
  /**
    * A custom label to use for this aggregation.  If providedm, we don't use native i18n
    */
  var treeAggregationLabel: js.UndefOr[String] = js.undefined
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
  var treeAggregationType: js.UndefOr[String] = js.undefined
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
  var treeAggregationUpdateEntity: js.UndefOr[Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply[TEntity](
    customTreeAggregationFinalizerFn: /* aggregation */ IGridTreeBaseAggregationObject => Unit = null,
    customTreeAggregationFn: (/* aggregation */ IGridTreeBaseAggregationObject, /* fieldValue */ js.Any, /* numValue */ Double, /* row */ IGridRowOf[TEntity]) => Unit = null,
    treeAggregationLabel: String = null,
    treeAggregationType: String = null,
    treeAggregationUpdateEntity: js.UndefOr[Boolean] = js.undefined
  ): IColumnDef[TEntity] = {
    val __obj = js.Dynamic.literal()
    if (customTreeAggregationFinalizerFn != null) __obj.updateDynamic("customTreeAggregationFinalizerFn")(js.Any.fromFunction1(customTreeAggregationFinalizerFn))
    if (customTreeAggregationFn != null) __obj.updateDynamic("customTreeAggregationFn")(js.Any.fromFunction4(customTreeAggregationFn))
    if (treeAggregationLabel != null) __obj.updateDynamic("treeAggregationLabel")(treeAggregationLabel.asInstanceOf[js.Any])
    if (treeAggregationType != null) __obj.updateDynamic("treeAggregationType")(treeAggregationType.asInstanceOf[js.Any])
    if (!js.isUndefined(treeAggregationUpdateEntity)) __obj.updateDynamic("treeAggregationUpdateEntity")(treeAggregationUpdateEntity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDef[TEntity]]
  }
}


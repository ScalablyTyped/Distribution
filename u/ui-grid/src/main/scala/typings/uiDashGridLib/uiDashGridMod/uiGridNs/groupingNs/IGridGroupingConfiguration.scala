package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGridGroupingConfiguration extends js.Object {
  /**
               * Hash of currently expanded nodes
               */
  var expandedState: js.UndefOr[IGridExpandedHash] = js.undefined
  /**
               * GroupArray.  Sorted by groupPriority
               */
  var grouping: js.Array[IGripGroup]
  /**
               * Array of aggregation objects
               */
  var treeAggregations: js.Array[IGridTreeAggregations]
}


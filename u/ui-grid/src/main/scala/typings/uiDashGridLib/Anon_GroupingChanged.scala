package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_GroupingChanged[TEntity] extends js.Object {
  /**
                   * raised whenever aggregation is changed, added or removed from a column
                   * @param {ng.IScope} scope Grid Scope
                   * @param {aggregationChangedHandler} handler Callback method
                   */
  var aggregationChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.aggregationChangedHandler[TEntity], 
    scala.Unit
  ]
  /**
                   * raised whenever the grouped columns change
                   * @param {ng.IScope} scope Grid Scope
                   * @param {groupingChangedHandler} handler Callback method
                   */
  var groupingChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.groupingChangedHandler[TEntity], 
    scala.Unit
  ]
}


package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_RowExpandedStateChanged[TEntity] extends js.Object {
  /**
                   * raised when cell editing is complete
                   * @param {ng.IScope} scope
                   * @param {rowExpandedStateChangedHandler} handler
                   */
  var rowExpandedStateChanged: js.Function2[
    /* scope */ angularLib.angularMod.angularNs.IScope, 
    /* handler */ uiDashGridLib.uiDashGridMod.uiGridNs.expandableNs.rowExpandedStateChangedHandler[TEntity], 
    scala.Unit
  ]
}


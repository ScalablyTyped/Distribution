package typings.uiGrid

import typings.angular.mod.IScope
import typings.uiGrid.mod.expandable.rowExpandedStateChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowExpandedStateChanged[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param {ng.IScope} scope
    * @param {rowExpandedStateChangedHandler} handler
    */
  def rowExpandedStateChanged(scope: IScope, handler: rowExpandedStateChangedHandler[TEntity]): Unit
}

object AnonRowExpandedStateChanged {
  @scala.inline
  def apply[TEntity](rowExpandedStateChanged: (IScope, rowExpandedStateChangedHandler[TEntity]) => Unit): AnonRowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowExpandedStateChanged = js.Any.fromFunction2(rowExpandedStateChanged))
    __obj.asInstanceOf[AnonRowExpandedStateChanged[TEntity]]
  }
}


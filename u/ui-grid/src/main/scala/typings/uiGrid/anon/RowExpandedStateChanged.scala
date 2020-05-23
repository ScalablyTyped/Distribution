package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.expandable.rowExpandedStateChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowExpandedStateChanged[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param {ng.IScope} scope
    * @param {rowExpandedStateChangedHandler} handler
    */
  def rowExpandedStateChanged(scope: IScope, handler: rowExpandedStateChangedHandler[TEntity]): Unit
}

object RowExpandedStateChanged {
  @scala.inline
  def apply[TEntity](rowExpandedStateChanged: (IScope, rowExpandedStateChangedHandler[TEntity]) => Unit): RowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowExpandedStateChanged = js.Any.fromFunction2(rowExpandedStateChanged))
    __obj.asInstanceOf[RowExpandedStateChanged[TEntity]]
  }
}


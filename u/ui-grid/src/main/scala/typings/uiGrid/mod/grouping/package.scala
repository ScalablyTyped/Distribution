package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object grouping {
  
  type aggregationChangedHandler[TEntity] = js.Function1[/* col */ typings.uiGrid.mod.IGridColumnOf[TEntity], scala.Unit]
  
  type groupingChangedHandler[TEntity] = js.Function1[/* col */ typings.uiGrid.mod.IGridColumnOf[TEntity], scala.Unit]
}

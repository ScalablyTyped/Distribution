package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object expandable {
  
  type rowExpandedStateChangedHandler[TEntity] = js.Function1[/* row */ typings.uiGrid.mod.IGridRowOf[TEntity], scala.Unit]
}

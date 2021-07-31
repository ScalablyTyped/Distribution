package typings.uiGrid.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridColumnConstructor[TEntity]
  extends StObject
     with /**
  * Represents the viewModel for each column.
  * Any state or methods needed for a Grid Column are defined on this prototype
  * @param gridCol Column definition
  * @param index the current position of the column in the array
  * @param grid reference to the grid
  */
Instantiable3[
      /* gridCol */ IColumnDefOf[TEntity], 
      /* index */ Double, 
      /* grid */ IGridInstanceOf[TEntity], 
      IGridColumnOf[TEntity]
    ]

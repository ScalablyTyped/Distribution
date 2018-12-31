package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridColumnConstructor[TEntity]
  extends /**
  * Represents the viewModel for each column.
  * Any state or methods needed for a Grid Column are defined on this prototype
  * @param gridCol Column definition
  * @param index the current position of the column in the array
  * @param grid reference to the grid
  */
org.scalablytyped.runtime.Instantiable3[
      /* gridCol */ IColumnDefOf[TEntity], 
      /* index */ scala.Double, 
      /* grid */ IGridInstanceOf[TEntity], 
      IGridColumnOf[TEntity]
    ]


package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRowConstructor[TEntity]
  extends /**
         * GridRow is the viewModel for one logical row on the grid.
         * A grid Row is not necessarily a one-to-one relation to gridOptions.data.
         * @param entity the array item from GridOptions.data
         * @param index the current position of the row in the array
         * @param reference to the parent grid
         */
org.scalablytyped.runtime.Instantiable3[
      /* entity */ TEntity, 
      /* index */ scala.Double, 
      /* reference */ IGridInstanceOf[TEntity], 
      IGridRowOf[TEntity]
    ]


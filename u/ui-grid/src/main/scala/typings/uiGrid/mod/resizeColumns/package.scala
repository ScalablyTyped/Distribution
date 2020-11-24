package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object resizeColumns {
  
  type columnSizeChangedHandler = js.Function2[
    /* colDef */ typings.uiGrid.mod.resizeColumns.IColumnDef, 
    /* delta */ scala.Double, 
    scala.Unit
  ]
}

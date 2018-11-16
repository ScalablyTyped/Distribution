package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moveColumnsNs {
  type columnPositionChangedHandler = js.Function3[
    /* colDef */ IColumnDef, 
    /* originalPosition */ scala.Double, 
    /* finalPosition */ scala.Double, 
    scala.Unit
  ]
}

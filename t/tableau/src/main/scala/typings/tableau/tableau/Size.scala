package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Other
trait Size extends js.Object {
  var height: Double
  var width: Double
}

object Size {
  @scala.inline
  def apply(height: Double, width: Double): Size = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Size]
  }
}


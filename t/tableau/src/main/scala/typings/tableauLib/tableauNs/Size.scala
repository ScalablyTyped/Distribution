package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Other
trait Size extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object Size {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Size = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Size]
  }
}


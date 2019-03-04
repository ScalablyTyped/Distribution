package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFormResult extends js.Object {
  /**
    * Identifies the record displayed or created
    */
  var savedEntityReference: js.Array[xrmLib.XrmNs.LookupValue]
}

object OpenFormResult {
  @scala.inline
  def apply(savedEntityReference: js.Array[xrmLib.XrmNs.LookupValue]): OpenFormResult = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference)
  
    __obj.asInstanceOf[OpenFormResult]
  }
}


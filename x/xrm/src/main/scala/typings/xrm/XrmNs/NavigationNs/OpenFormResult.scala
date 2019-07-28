package typings.xrm.XrmNs.NavigationNs

import typings.xrm.XrmNs.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFormResult extends js.Object {
  /**
    * Identifies the record displayed or created
    */
  var savedEntityReference: js.Array[LookupValue]
}

object OpenFormResult {
  @scala.inline
  def apply(savedEntityReference: js.Array[LookupValue]): OpenFormResult = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference)
  
    __obj.asInstanceOf[OpenFormResult]
  }
}


package typings.xrm.Xrm.Navigation

import typings.xrm.Xrm.LookupValue
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
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenFormResult]
  }
}


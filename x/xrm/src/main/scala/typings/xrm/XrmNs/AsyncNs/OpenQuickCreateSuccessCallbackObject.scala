package typings.xrm.XrmNs.AsyncNs

import typings.xrm.XrmNs.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to QuickCreateSuccessCallbackDelegate.
  */
trait OpenQuickCreateSuccessCallbackObject extends js.Object {
  /**
    * A lookup value which identifies the record which has been created.
    */
  var savedEntityReference: LookupValue
}

object OpenQuickCreateSuccessCallbackObject {
  @scala.inline
  def apply(savedEntityReference: LookupValue): OpenQuickCreateSuccessCallbackObject = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference)
  
    __obj.asInstanceOf[OpenQuickCreateSuccessCallbackObject]
  }
}


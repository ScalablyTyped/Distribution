package typings
package xrmLib.XrmNs.AsyncNs

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
  var savedEntityReference: xrmLib.XrmNs.LookupValue
}

object OpenQuickCreateSuccessCallbackObject {
  @scala.inline
  def apply(savedEntityReference: xrmLib.XrmNs.LookupValue): OpenQuickCreateSuccessCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("savedEntityReference")(savedEntityReference)
    __obj.asInstanceOf[OpenQuickCreateSuccessCallbackObject]
  }
}


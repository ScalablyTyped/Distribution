package typings
package webpackDashMergeLib.webpackDashMergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizeOptions extends js.Object {
  var customizeArray: js.UndefOr[CustomizeArrayFunction | UniqueFunction] = js.undefined
  var customizeObject: js.UndefOr[CustomizeObjectFunction] = js.undefined
}

object CustomizeOptions {
  @scala.inline
  def apply(
    customizeArray: CustomizeArrayFunction | UniqueFunction = null,
    customizeObject: CustomizeObjectFunction = null
  ): CustomizeOptions = {
    val __obj = js.Dynamic.literal()
    if (customizeArray != null) __obj.updateDynamic("customizeArray")(customizeArray.asInstanceOf[js.Any])
    if (customizeObject != null) __obj.updateDynamic("customizeObject")(customizeObject)
    __obj.asInstanceOf[CustomizeOptions]
  }
}


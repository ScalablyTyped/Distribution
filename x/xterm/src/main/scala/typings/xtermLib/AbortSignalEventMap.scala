package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignalEventMap extends js.Object {
  var abort: ProgressEvent
}

object AbortSignalEventMap {
  @scala.inline
  def apply(abort: ProgressEvent): AbortSignalEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.asInstanceOf[AbortSignalEventMap]
  }
}


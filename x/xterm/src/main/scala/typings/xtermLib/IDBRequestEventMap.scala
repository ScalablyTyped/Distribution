package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBRequestEventMap extends js.Object {
  var error: Event
  var success: Event
}

object IDBRequestEventMap {
  @scala.inline
  def apply(error: Event, success: Event): IDBRequestEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IDBRequestEventMap]
  }
}


package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: js.UndefOr[java.lang.String] = js.undefined
  var prop: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Event {
  @scala.inline
  def apply(event: java.lang.String = null, prop: java.lang.String = null): Anon_Event = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (prop != null) __obj.updateDynamic("prop")(prop)
    __obj.asInstanceOf[Anon_Event]
  }
}


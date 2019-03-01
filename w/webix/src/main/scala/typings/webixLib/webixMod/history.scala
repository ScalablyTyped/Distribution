package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait history extends js.Object {
  def push(view: java.lang.String, url: java.lang.String, value: js.Any): scala.Unit
  def track(view: java.lang.String, url: java.lang.String): scala.Unit
}

object history {
  @scala.inline
  def apply(
    push: js.Function3[java.lang.String, java.lang.String, js.Any, scala.Unit],
    track: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): history = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[history]
  }
}


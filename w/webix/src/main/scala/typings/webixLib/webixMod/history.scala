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
    push: (java.lang.String, java.lang.String, js.Any) => scala.Unit,
    track: (java.lang.String, java.lang.String) => scala.Unit
  ): history = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction3(push), track = js.Any.fromFunction2(track))
  
    __obj.asInstanceOf[history]
  }
}


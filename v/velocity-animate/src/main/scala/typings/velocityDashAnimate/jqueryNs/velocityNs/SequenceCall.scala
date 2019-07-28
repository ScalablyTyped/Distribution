package typings.velocityDashAnimate.jqueryNs.velocityNs

import typings.std.HTMLElement
import typings.velocityDashAnimate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceCall extends js.Object {
  var e: HTMLElement | JQuery
  var o: SequenceOptions
  var p: Properties
}

object SequenceCall {
  @scala.inline
  def apply(e: HTMLElement | JQuery, o: SequenceOptions, p: Properties): SequenceCall = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], o = o, p = p)
  
    __obj.asInstanceOf[SequenceCall]
  }
}


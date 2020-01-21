package typings.subscribeUiEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.subscribeUiEvent.subscribeUiEventStrings.touchend
  - typings.subscribeUiEvent.subscribeUiEventStrings.touchmove
  - typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd
  - typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart
  - typings.subscribeUiEvent.subscribeUiEventStrings.touchstart
*/
trait TouchEventType extends js.Object

object TouchEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def touchend: typings.subscribeUiEvent.subscribeUiEventStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchmove: typings.subscribeUiEvent.subscribeUiEventStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchmoveEnd: typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveEnd = this.cast("touchmoveEnd")
  @scala.inline
  def touchmoveStart: typings.subscribeUiEvent.subscribeUiEventStrings.touchmoveStart = this.cast("touchmoveStart")
  @scala.inline
  def touchstart: typings.subscribeUiEvent.subscribeUiEventStrings.touchstart = this.cast("touchstart")
}


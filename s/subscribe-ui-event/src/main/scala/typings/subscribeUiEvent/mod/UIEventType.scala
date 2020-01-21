package typings.subscribeUiEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.subscribeUiEvent.subscribeUiEventStrings.resize
  - typings.subscribeUiEvent.subscribeUiEventStrings.resizeEnd
  - typings.subscribeUiEvent.subscribeUiEventStrings.resizeStart
  - typings.subscribeUiEvent.subscribeUiEventStrings.scroll
  - typings.subscribeUiEvent.subscribeUiEventStrings.scrollEnd
  - typings.subscribeUiEvent.subscribeUiEventStrings.scrollStart
  - typings.subscribeUiEvent.subscribeUiEventStrings.visibilitychange
*/
trait UIEventType extends js.Object

object UIEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def resize: typings.subscribeUiEvent.subscribeUiEventStrings.resize = this.cast("resize")
  @scala.inline
  def resizeEnd: typings.subscribeUiEvent.subscribeUiEventStrings.resizeEnd = this.cast("resizeEnd")
  @scala.inline
  def resizeStart: typings.subscribeUiEvent.subscribeUiEventStrings.resizeStart = this.cast("resizeStart")
  @scala.inline
  def scroll: typings.subscribeUiEvent.subscribeUiEventStrings.scroll = this.cast("scroll")
  @scala.inline
  def scrollEnd: typings.subscribeUiEvent.subscribeUiEventStrings.scrollEnd = this.cast("scrollEnd")
  @scala.inline
  def scrollStart: typings.subscribeUiEvent.subscribeUiEventStrings.scrollStart = this.cast("scrollStart")
  @scala.inline
  def visibilitychange: typings.subscribeUiEvent.subscribeUiEventStrings.visibilitychange = this.cast("visibilitychange")
}


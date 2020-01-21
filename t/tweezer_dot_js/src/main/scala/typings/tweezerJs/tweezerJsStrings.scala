package typings.tweezerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tweezerJsStrings {
  @js.native
  sealed trait done extends js.Object
  
  @js.native
  sealed trait tick extends js.Object
  
  @scala.inline
  def done: done = "done".asInstanceOf[done]
  @scala.inline
  def tick: tick = "tick".asInstanceOf[tick]
}


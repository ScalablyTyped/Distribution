package typings.workerpool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object workerpoolStrings {
  @js.native
  sealed trait CancellationError extends js.Object
  
  @js.native
  sealed trait TimeoutError extends js.Object
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait browser extends js.Object
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait node extends js.Object
  
  @js.native
  sealed trait process extends js.Object
  
  @js.native
  sealed trait thread extends js.Object
  
  @js.native
  sealed trait web extends js.Object
  
  @scala.inline
  def CancellationError: CancellationError = "CancellationError".asInstanceOf[CancellationError]
  @scala.inline
  def TimeoutError: TimeoutError = "TimeoutError".asInstanceOf[TimeoutError]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  @scala.inline
  def process: process = "process".asInstanceOf[process]
  @scala.inline
  def thread: thread = "thread".asInstanceOf[thread]
  @scala.inline
  def web: web = "web".asInstanceOf[web]
}


package typings
package workerpoolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object workerpoolLibStrings {
  @js.native
  sealed trait CancellationError extends js.Object
  
  @js.native
  sealed trait TimeoutError extends js.Object
  
  @js.native
  sealed trait browser extends js.Object
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait node extends js.Object
  
  @scala.inline
  def CancellationError: CancellationError = "CancellationError".asInstanceOf[CancellationError]
  @scala.inline
  def TimeoutError: TimeoutError = "TimeoutError".asInstanceOf[TimeoutError]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def node: node = "node".asInstanceOf[node]
}


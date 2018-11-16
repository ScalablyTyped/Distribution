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
  
  def CancellationError: CancellationError = "CancellationError".asInstanceOf[CancellationError]
  def TimeoutError: TimeoutError = "TimeoutError".asInstanceOf[TimeoutError]
  def browser: browser = "browser".asInstanceOf[browser]
  def max: max = "max".asInstanceOf[max]
  def node: node = "node".asInstanceOf[node]
}


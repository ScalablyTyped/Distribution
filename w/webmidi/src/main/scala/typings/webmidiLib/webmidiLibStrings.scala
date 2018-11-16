package typings
package webmidiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webmidiLibStrings {
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait connected extends js.Object
  
  @js.native
  sealed trait disconnected extends js.Object
  
  @js.native
  sealed trait input extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait output extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  def closed: closed = "closed".asInstanceOf[closed]
  def connected: connected = "connected".asInstanceOf[connected]
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  def input: input = "input".asInstanceOf[input]
  def open: open = "open".asInstanceOf[open]
  def output: output = "output".asInstanceOf[output]
  def pending: pending = "pending".asInstanceOf[pending]
}


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
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def output: output = "output".asInstanceOf[output]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
}


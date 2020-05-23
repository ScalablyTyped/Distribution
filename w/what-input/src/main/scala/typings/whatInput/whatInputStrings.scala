package typings.whatInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object whatInputStrings {
  @js.native
  sealed trait intent extends js.Object
  
  @js.native
  sealed trait keyboard extends js.Object
  
  @js.native
  sealed trait mouse extends js.Object
  
  @js.native
  sealed trait pointer extends js.Object
  
  @js.native
  sealed trait touch extends js.Object
  
  @scala.inline
  def intent: intent = "intent".asInstanceOf[intent]
  @scala.inline
  def keyboard: keyboard = "keyboard".asInstanceOf[keyboard]
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  @scala.inline
  def pointer: pointer = "pointer".asInstanceOf[pointer]
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
}


package typings.whatInput

import typings.whatInput.mod.InputMethod
import typings.whatInput.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whatInputStrings {
  
  @scala.inline
  def initial: initial = "initial".asInstanceOf[initial]
  
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
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
  
  @js.native
  sealed trait initial extends InputMethod
  
  @js.native
  sealed trait input extends Strategy
  
  @js.native
  sealed trait intent extends Strategy
  
  @js.native
  sealed trait keyboard extends InputMethod
  
  @js.native
  sealed trait mouse extends InputMethod
  
  @js.native
  sealed trait pointer extends InputMethod
  
  @js.native
  sealed trait touch extends InputMethod
}

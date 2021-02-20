package typings.whatInput

import typings.whatInput.mod.InputMethod
import typings.whatInput.mod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whatInputStrings {
  
  @js.native
  sealed trait initial extends InputMethod
  @scala.inline
  def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait input extends Strategy
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait intent extends Strategy
  @scala.inline
  def intent: intent = "intent".asInstanceOf[intent]
  
  @js.native
  sealed trait keyboard extends InputMethod
  @scala.inline
  def keyboard: keyboard = "keyboard".asInstanceOf[keyboard]
  
  @js.native
  sealed trait mouse extends InputMethod
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait pointer extends InputMethod
  @scala.inline
  def pointer: pointer = "pointer".asInstanceOf[pointer]
  
  @js.native
  sealed trait touch extends InputMethod
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
}

package typings.whatInput

import typings.whatInput.mod.InputMethod
import typings.whatInput.mod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whatInputStrings {
  
  @js.native
  sealed trait initial
    extends StObject
       with InputMethod
  inline def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait input
    extends StObject
       with Strategy
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait intent
    extends StObject
       with Strategy
  inline def intent: intent = "intent".asInstanceOf[intent]
  
  @js.native
  sealed trait keyboard
    extends StObject
       with InputMethod
  inline def keyboard: keyboard = "keyboard".asInstanceOf[keyboard]
  
  @js.native
  sealed trait mouse
    extends StObject
       with InputMethod
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait pointer
    extends StObject
       with InputMethod
  inline def pointer: pointer = "pointer".asInstanceOf[pointer]
  
  @js.native
  sealed trait touch
    extends StObject
       with InputMethod
  inline def touch: touch = "touch".asInstanceOf[touch]
}

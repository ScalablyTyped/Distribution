package typings.whatInput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("what-input", "default.ask")
    @js.native
    def ask(): InputMethod = js.native
    @JSImport("what-input", "default.ask")
    @js.native
    def ask(strategy: Strategy): InputMethod = js.native
    
    @JSImport("what-input", "default.clearStorage")
    @js.native
    def clearStorage(): Unit = js.native
    
    @JSImport("what-input", "default.element")
    @js.native
    def element(): String | Null = js.native
    
    @JSImport("what-input", "default.ignoreKeys")
    @js.native
    def ignoreKeys(keyCodes: js.Array[Double]): Unit = js.native
    
    @JSImport("what-input", "default.registerOnChange")
    @js.native
    def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = js.native
    @JSImport("what-input", "default.registerOnChange")
    @js.native
    def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit], strategy: Strategy): Unit = js.native
    
    @JSImport("what-input", "default.specificKeys")
    @js.native
    def specificKeys(keyCodes: js.Array[Double]): Unit = js.native
    
    @JSImport("what-input", "default.unRegisterOnChange")
    @js.native
    def unRegisterOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.whatInput.whatInputStrings.initial
    - typings.whatInput.whatInputStrings.pointer
    - typings.whatInput.whatInputStrings.keyboard
    - typings.whatInput.whatInputStrings.mouse
    - typings.whatInput.whatInputStrings.touch
  */
  trait InputMethod extends StObject
  object InputMethod {
    
    @scala.inline
    def initial: typings.whatInput.whatInputStrings.initial = "initial".asInstanceOf[typings.whatInput.whatInputStrings.initial]
    
    @scala.inline
    def keyboard: typings.whatInput.whatInputStrings.keyboard = "keyboard".asInstanceOf[typings.whatInput.whatInputStrings.keyboard]
    
    @scala.inline
    def mouse: typings.whatInput.whatInputStrings.mouse = "mouse".asInstanceOf[typings.whatInput.whatInputStrings.mouse]
    
    @scala.inline
    def pointer: typings.whatInput.whatInputStrings.pointer = "pointer".asInstanceOf[typings.whatInput.whatInputStrings.pointer]
    
    @scala.inline
    def touch: typings.whatInput.whatInputStrings.touch = "touch".asInstanceOf[typings.whatInput.whatInputStrings.touch]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.whatInput.whatInputStrings.input
    - typings.whatInput.whatInputStrings.intent
  */
  trait Strategy extends StObject
  object Strategy {
    
    @scala.inline
    def input: typings.whatInput.whatInputStrings.input = "input".asInstanceOf[typings.whatInput.whatInputStrings.input]
    
    @scala.inline
    def intent: typings.whatInput.whatInputStrings.intent = "intent".asInstanceOf[typings.whatInput.whatInputStrings.intent]
  }
}

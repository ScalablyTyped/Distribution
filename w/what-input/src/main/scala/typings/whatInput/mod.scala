package typings.whatInput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("what-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def ask(): InputMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[InputMethod]
    @scala.inline
    def ask(strategy: Strategy): InputMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")(strategy.asInstanceOf[js.Any]).asInstanceOf[InputMethod]
    
    @scala.inline
    def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
    
    @scala.inline
    def element(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("element")().asInstanceOf[String | Null]
    
    @scala.inline
    def ignoreKeys(keyCodes: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreKeys")(keyCodes.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def registerOnChange(callback: js.Function1[/* type */ InputMethod, Unit], strategy: Strategy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOnChange")(callback.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def specificKeys(keyCodes: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("specificKeys")(keyCodes.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def unRegisterOnChange(callback: js.Function1[/* type */ InputMethod, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unRegisterOnChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
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

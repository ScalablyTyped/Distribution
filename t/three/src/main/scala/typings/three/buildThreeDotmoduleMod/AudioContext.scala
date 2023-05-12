package typings.three.buildThreeDotmoduleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AudioContext {
  
  @JSImport("three/build/three.module", "AudioContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Return the value of the variable `context` in the outer scope, if defined, otherwise set it to a new {@link https://developer.mozilla.org/en-US/docs/Web/API/AudioContext | AudioContext}.
    */
  inline def getContext(): typings.std.AudioContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[typings.std.AudioContext]
  
  /**
    * Set the variable `context` in the outer scope to `value`.
    * @param value
    */
  inline def setContext(context: typings.std.AudioContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

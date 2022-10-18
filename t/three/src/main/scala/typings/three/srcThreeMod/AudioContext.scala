package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AudioContext {
  
  @JSImport("three/src/Three", "AudioContext")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContext(): typings.std.AudioContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[typings.std.AudioContext]
  
  inline def setContext(context: typings.std.AudioContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContext")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

package typings.unimodulesReactNativeAdapter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticPlatformEmitterMod extends Shortcut {
  
  @JSImport("@unimodules/react-native-adapter/build/SyntheticPlatformEmitter", JSImport.Default)
  @js.native
  val default: SyntheticPlatformEmitter = js.native
  
  trait SyntheticPlatformEmitter extends StObject {
    
    var _emitter: js.Any
    
    def emit(eventName: String, props: js.Any): Unit
  }
  object SyntheticPlatformEmitter {
    
    inline def apply(_emitter: js.Any, emit: (String, js.Any) => Unit): SyntheticPlatformEmitter = {
      val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit))
      __obj.asInstanceOf[SyntheticPlatformEmitter]
    }
    
    extension [Self <: SyntheticPlatformEmitter](x: Self) {
      
      inline def setEmit(value: (String, js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def set_emitter(value: js.Any): Self = StObject.set(x, "_emitter", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = SyntheticPlatformEmitter
  
  /* This means you don't have to write `default`, but can instead just say `syntheticPlatformEmitterMod.foo` */
  override def _to: SyntheticPlatformEmitter = default
}

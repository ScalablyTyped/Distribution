package typings.threeTdsLoader.anon

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAudioContext extends StObject {
  
  def getContext(): AudioContext
  
  def setContext(context: AudioContext): Unit
}
object TypeofAudioContext {
  
  inline def apply(getContext: () => AudioContext, setContext: AudioContext => Unit): TypeofAudioContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[TypeofAudioContext]
  }
  
  extension [Self <: TypeofAudioContext](x: Self) {
    
    inline def setGetContext(value: () => AudioContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    inline def setSetContext(value: AudioContext => Unit): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
  }
}

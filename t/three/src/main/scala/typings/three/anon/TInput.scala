package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TInput extends StObject {
  
  var tInput: IUniform[Any]
}
object TInput {
  
  inline def apply(tInput: IUniform[Any]): TInput = {
    val __obj = js.Dynamic.literal(tInput = tInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[TInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TInput] (val x: Self) extends AnyVal {
    
    inline def setTInput(value: IUniform[Any]): Self = StObject.set(x, "tInput", value.asInstanceOf[js.Any])
  }
}

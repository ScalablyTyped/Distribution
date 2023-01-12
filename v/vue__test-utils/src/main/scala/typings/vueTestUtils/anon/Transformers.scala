package typings.vueTestUtils.anon

import typings.vueTestUtils.distVnodeTransformersUtilMod.VTUVNodeTypeTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformers extends StObject {
  
  var transformers: js.Array[VTUVNodeTypeTransformer]
}
object Transformers {
  
  inline def apply(transformers: js.Array[VTUVNodeTypeTransformer]): Transformers = {
    val __obj = js.Dynamic.literal(transformers = transformers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transformers] (val x: Self) extends AnyVal {
    
    inline def setTransformers(value: js.Array[VTUVNodeTypeTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    inline def setTransformersVarargs(value: VTUVNodeTypeTransformer*): Self = StObject.set(x, "transformers", js.Array(value*))
  }
}

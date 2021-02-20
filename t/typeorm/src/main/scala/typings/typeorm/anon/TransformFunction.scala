package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformFunction extends StObject {
  
  var transform: js.Function = js.native
}
object TransformFunction {
  
  @scala.inline
  def apply(transform: js.Function): TransformFunction = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformFunction]
  }
  
  @scala.inline
  implicit class TransformFunctionMutableBuilder[Self <: TransformFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}

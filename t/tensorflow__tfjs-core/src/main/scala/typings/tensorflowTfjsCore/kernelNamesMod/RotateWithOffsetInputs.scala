package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'image'> */
@js.native
trait RotateWithOffsetInputs extends StObject {
  
  var image: js.UndefOr[js.Any] = js.native
}
object RotateWithOffsetInputs {
  
  @scala.inline
  def apply(): RotateWithOffsetInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateWithOffsetInputs]
  }
  
  @scala.inline
  implicit class RotateWithOffsetInputsMutableBuilder[Self <: RotateWithOffsetInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}

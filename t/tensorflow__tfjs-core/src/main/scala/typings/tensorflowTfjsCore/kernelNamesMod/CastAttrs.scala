package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastAttrs extends StObject {
  
  var dtype: DataType = js.native
}
object CastAttrs {
  
  @scala.inline
  def apply(dtype: DataType): CastAttrs = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastAttrs]
  }
  
  @scala.inline
  implicit class CastAttrsMutableBuilder[Self <: CastAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
  }
}

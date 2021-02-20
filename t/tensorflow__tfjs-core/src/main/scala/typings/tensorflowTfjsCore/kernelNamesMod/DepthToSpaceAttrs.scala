package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthToSpaceAttrs extends StObject {
  
  var blockSize: Double = js.native
  
  var dataFormat: NHWC | NCHW = js.native
}
object DepthToSpaceAttrs {
  
  @scala.inline
  def apply(blockSize: Double, dataFormat: NHWC | NCHW): DepthToSpaceAttrs = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthToSpaceAttrs]
  }
  
  @scala.inline
  implicit class DepthToSpaceAttrsMutableBuilder[Self <: DepthToSpaceAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormat(value: NHWC | NCHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
  }
}

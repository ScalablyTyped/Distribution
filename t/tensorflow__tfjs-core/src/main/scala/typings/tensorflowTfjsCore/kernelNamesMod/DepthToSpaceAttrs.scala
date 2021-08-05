package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthToSpaceAttrs extends StObject {
  
  var blockSize: Double
  
  var dataFormat: NHWC | NCHW
}
object DepthToSpaceAttrs {
  
  inline def apply(blockSize: Double, dataFormat: NHWC | NCHW): DepthToSpaceAttrs = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], dataFormat = dataFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthToSpaceAttrs]
  }
  
  extension [Self <: DepthToSpaceAttrs](x: Self) {
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setDataFormat(value: NHWC | NCHW): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
  }
}

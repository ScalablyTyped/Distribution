package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// GPUExtent3DDictStrict is defined to help developers catch a common class of errors.
// This interface defines depth as an undefined, which will cause a type check failure if someone
// attempts to set depth rather than depthOrArrayLayers on a GPUExtent3D (an easy mistake to make.)
trait GPUExtent3DDictStrict
  extends StObject
     with GPUExtent3DDict {
  
  /** @deprecated The correct name is `depthOrArrayLayers`. */
  var depth: Unit
}
object GPUExtent3DDictStrict {
  
  inline def apply(depth: Unit, width: GPUIntegerCoordinate): GPUExtent3DDictStrict = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUExtent3DDictStrict]
  }
  
  extension [Self <: GPUExtent3DDictStrict](x: Self) {
    
    inline def setDepth(value: Unit): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
  }
}

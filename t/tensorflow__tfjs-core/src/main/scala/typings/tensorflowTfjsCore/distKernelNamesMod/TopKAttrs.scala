package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopKAttrs extends StObject {
  
  var k: Double
  
  var sorted: Boolean
}
object TopKAttrs {
  
  inline def apply(k: Double, sorted: Boolean): TopKAttrs = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopKAttrs]
  }
  
  extension [Self <: TopKAttrs](x: Self) {
    
    inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
  }
}

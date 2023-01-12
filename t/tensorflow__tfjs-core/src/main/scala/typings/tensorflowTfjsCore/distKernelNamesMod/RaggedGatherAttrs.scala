package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaggedGatherAttrs extends StObject {
  
  var outputRaggedRank: Double
}
object RaggedGatherAttrs {
  
  inline def apply(outputRaggedRank: Double): RaggedGatherAttrs = {
    val __obj = js.Dynamic.literal(outputRaggedRank = outputRaggedRank.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaggedGatherAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaggedGatherAttrs] (val x: Self) extends AnyVal {
    
    inline def setOutputRaggedRank(value: Double): Self = StObject.set(x, "outputRaggedRank", value.asInstanceOf[js.Any])
  }
}

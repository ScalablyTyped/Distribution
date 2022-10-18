package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringToHashBucketFastAttrs extends StObject {
  
  var numBuckets: Double
}
object StringToHashBucketFastAttrs {
  
  inline def apply(numBuckets: Double): StringToHashBucketFastAttrs = {
    val __obj = js.Dynamic.literal(numBuckets = numBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringToHashBucketFastAttrs]
  }
  
  extension [Self <: StringToHashBucketFastAttrs](x: Self) {
    
    inline def setNumBuckets(value: Double): Self = StObject.set(x, "numBuckets", value.asInstanceOf[js.Any])
  }
}

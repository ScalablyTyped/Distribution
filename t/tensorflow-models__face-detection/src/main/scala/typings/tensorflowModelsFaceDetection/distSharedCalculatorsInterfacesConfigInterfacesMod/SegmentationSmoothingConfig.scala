package typings.tensorflowModelsFaceDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentationSmoothingConfig extends StObject {
  
  var combineWithPreviousRatio: Double
}
object SegmentationSmoothingConfig {
  
  inline def apply(combineWithPreviousRatio: Double): SegmentationSmoothingConfig = {
    val __obj = js.Dynamic.literal(combineWithPreviousRatio = combineWithPreviousRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentationSmoothingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentationSmoothingConfig] (val x: Self) extends AnyVal {
    
    inline def setCombineWithPreviousRatio(value: Double): Self = StObject.set(x, "combineWithPreviousRatio", value.asInstanceOf[js.Any])
  }
}

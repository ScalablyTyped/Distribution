package typings.tensorflowTfjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightsManifestGroupConfig extends StObject {
  
  /**
    * An ordered list of paths.
    *
    * Paths are intentionally abstract in order to be general. For example, they
    * can be relative URL paths or relative paths on the file system.
    */
  var paths: js.Array[String]
  
  /**
    * Specifications of the weights stored in the paths.
    */
  var weights: js.Array[WeightsManifestEntry]
}
object WeightsManifestGroupConfig {
  
  inline def apply(paths: js.Array[String], weights: js.Array[WeightsManifestEntry]): WeightsManifestGroupConfig = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightsManifestGroupConfig]
  }
  
  extension [Self <: WeightsManifestGroupConfig](x: Self) {
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setWeights(value: js.Array[WeightsManifestEntry]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    inline def setWeightsVarargs(value: WeightsManifestEntry*): Self = StObject.set(x, "weights", js.Array(value*))
  }
}

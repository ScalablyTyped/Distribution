package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiCompilerOptions extends StObject {
  
  /**
  	 * how many Compilers are allows to run at the same time in parallel
  	 */
  var parallelism: js.UndefOr[Double] = js.undefined
}
object MultiCompilerOptions {
  
  inline def apply(): MultiCompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiCompilerOptions]
  }
  
  extension [Self <: MultiCompilerOptions](x: Self) {
    
    inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
  }
}

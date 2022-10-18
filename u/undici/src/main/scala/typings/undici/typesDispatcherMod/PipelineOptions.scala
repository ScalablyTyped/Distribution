package typings.undici.typesDispatcherMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineOptions
  extends StObject
     with RequestOptions {
  
  /** `true` if the `handler` will return an object stream. Default: `false` */
  var objectMode: js.UndefOr[Boolean] = js.undefined
}
object PipelineOptions {
  
  inline def apply(method: HttpMethod, path: String): PipelineOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineOptions]
  }
  
  extension [Self <: PipelineOptions](x: Self) {
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
  }
}

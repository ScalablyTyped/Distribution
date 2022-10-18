package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Nested. */
trait Nested extends StObject {
  
  /** The area of the results the aggregation was restricted to. */
  var path: js.UndefOr[String] = js.undefined
}
object Nested {
  
  inline def apply(): Nested = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nested]
  }
  
  extension [Self <: Nested](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}

package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountCollectionResult extends StObject {
  
  var stats: Total
}
object CountCollectionResult {
  
  inline def apply(stats: Total): CountCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountCollectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountCollectionResult] (val x: Self) extends AnyVal {
    
    inline def setStats(value: Total): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

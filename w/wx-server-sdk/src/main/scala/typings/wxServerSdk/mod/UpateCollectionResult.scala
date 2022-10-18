package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.UpdatedNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpateCollectionResult extends StObject {
  
  var stats: UpdatedNumber
}
object UpateCollectionResult {
  
  inline def apply(stats: UpdatedNumber): UpateCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpateCollectionResult]
  }
  
  extension [Self <: UpateCollectionResult](x: Self) {
    
    inline def setStats(value: UpdatedNumber): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

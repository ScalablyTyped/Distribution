package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.RemovedNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveCollectionResult extends StObject {
  
  var stats: RemovedNumber
}
object RemoveCollectionResult {
  
  inline def apply(stats: RemovedNumber): RemoveCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCollectionResult]
  }
  
  extension [Self <: RemoveCollectionResult](x: Self) {
    
    inline def setStats(value: RemovedNumber): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

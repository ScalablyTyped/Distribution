package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveCollectionResult extends StObject {
  
  var stats: Removed
}
object RemoveCollectionResult {
  
  inline def apply(stats: Removed): RemoveCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCollectionResult]
  }
  
  extension [Self <: RemoveCollectionResult](x: Self) {
    
    inline def setStats(value: Removed): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

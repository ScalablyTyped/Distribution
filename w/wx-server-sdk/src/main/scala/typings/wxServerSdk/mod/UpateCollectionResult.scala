package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpateCollectionResult extends StObject {
  
  var stats: Updated
}
object UpateCollectionResult {
  
  inline def apply(stats: Updated): UpateCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpateCollectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpateCollectionResult] (val x: Self) extends AnyVal {
    
    inline def setStats(value: Updated): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

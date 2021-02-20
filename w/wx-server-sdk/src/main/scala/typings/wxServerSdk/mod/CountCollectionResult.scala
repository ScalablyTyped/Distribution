package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.Total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountCollectionResult extends StObject {
  
  var stats: Total = js.native
}
object CountCollectionResult {
  
  @scala.inline
  def apply(stats: Total): CountCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountCollectionResult]
  }
  
  @scala.inline
  implicit class CountCollectionResultMutableBuilder[Self <: CountCollectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: Total): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

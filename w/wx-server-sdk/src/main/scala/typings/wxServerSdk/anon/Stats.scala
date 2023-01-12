package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var stats: `0`
}
object Stats {
  
  inline def apply(stats: `0`): Stats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
    inline def setStats(value: `0`): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

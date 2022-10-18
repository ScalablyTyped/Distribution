package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsRemoved extends StObject {
  
  var stats: Removed
}
object StatsRemoved {
  
  inline def apply(stats: Removed): StatsRemoved = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsRemoved]
  }
  
  extension [Self <: StatsRemoved](x: Self) {
    
    inline def setStats(value: Removed): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

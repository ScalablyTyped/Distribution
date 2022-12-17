package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats1 extends StObject {
  
  var stats: `1`
}
object Stats1 {
  
  inline def apply(stats: `1`): Stats1 = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats1]
  }
  
  extension [Self <: Stats1](x: Self) {
    
    inline def setStats(value: `1`): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

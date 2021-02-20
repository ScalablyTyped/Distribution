package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats1 extends StObject {
  
  var stats: `1` = js.native
}
object Stats1 {
  
  @scala.inline
  def apply(stats: `1`): Stats1 = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats1]
  }
  
  @scala.inline
  implicit class Stats1MutableBuilder[Self <: Stats1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: `1`): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

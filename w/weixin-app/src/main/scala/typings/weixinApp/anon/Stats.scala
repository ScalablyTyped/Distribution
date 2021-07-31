package typings.weixinApp.anon

import typings.weixinApp.wx.Stat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var stats: Stat
}
object Stats {
  
  @scala.inline
  def apply(stats: Stat): Stats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: Stat): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}

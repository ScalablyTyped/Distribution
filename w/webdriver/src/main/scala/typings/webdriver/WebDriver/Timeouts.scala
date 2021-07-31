package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'script' | 'pageLoad' | 'implicit', number> */
trait Timeouts extends StObject {
  
  var `implicit`: Double
  
  var pageLoad: Double
  
  var script: Double
}
object Timeouts {
  
  @scala.inline
  def apply(`implicit`: Double, pageLoad: Double, script: Double): Timeouts = {
    val __obj = js.Dynamic.literal(pageLoad = pageLoad.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeouts]
  }
  
  @scala.inline
  implicit class TimeoutsMutableBuilder[Self <: Timeouts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImplicit(value: Double): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLoad(value: Double): Self = StObject.set(x, "pageLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: Double): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}

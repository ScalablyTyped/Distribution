package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InetChecksiteData extends StObject {
  
  var ms: Double = js.native
  
  var ok: Boolean = js.native
  
  var status: Double = js.native
  
  var url: String = js.native
}
object InetChecksiteData {
  
  @scala.inline
  def apply(ms: Double, ok: Boolean, status: Double, url: String): InetChecksiteData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InetChecksiteData]
  }
  
  @scala.inline
  implicit class InetChecksiteDataMutableBuilder[Self <: InetChecksiteData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

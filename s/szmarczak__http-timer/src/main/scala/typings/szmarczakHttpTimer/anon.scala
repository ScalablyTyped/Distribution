package typings.szmarczakHttpTimer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dns extends StObject {
    
    var dns: js.UndefOr[Double] = js.undefined
    
    var download: js.UndefOr[Double] = js.undefined
    
    var firstByte: js.UndefOr[Double] = js.undefined
    
    var request: js.UndefOr[Double] = js.undefined
    
    var tcp: js.UndefOr[Double] = js.undefined
    
    var tls: js.UndefOr[Double] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
    
    @JSName("wait")
    var wait_FDns: js.UndefOr[Double] = js.undefined
  }
  object Dns {
    
    inline def apply(): Dns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dns]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dns] (val x: Self) extends AnyVal {
      
      inline def setDns(value: Double): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
      
      inline def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
      
      inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setFirstByte(value: Double): Self = StObject.set(x, "firstByte", value.asInstanceOf[js.Any])
      
      inline def setFirstByteUndefined: Self = StObject.set(x, "firstByte", js.undefined)
      
      inline def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setTcp(value: Double): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
      
      inline def setTls(value: Double): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}

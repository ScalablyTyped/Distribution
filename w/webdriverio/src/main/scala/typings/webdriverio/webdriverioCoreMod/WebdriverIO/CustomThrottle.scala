package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomThrottle
  extends StObject
     with ThrottleOptions {
  
  var downloadThroughput: Double
  
  var latency: Double
  
  var offline: Boolean
  
  var uploadThroughput: Double
}
object CustomThrottle {
  
  @scala.inline
  def apply(downloadThroughput: Double, latency: Double, offline: Boolean, uploadThroughput: Double): CustomThrottle = {
    val __obj = js.Dynamic.literal(downloadThroughput = downloadThroughput.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], uploadThroughput = uploadThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomThrottle]
  }
  
  @scala.inline
  implicit class CustomThrottleMutableBuilder[Self <: CustomThrottle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadThroughput(value: Double): Self = StObject.set(x, "downloadThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadThroughput(value: Double): Self = StObject.set(x, "uploadThroughput", value.asInstanceOf[js.Any])
  }
}

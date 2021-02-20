package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInfo extends StObject {
  
  var block: String = js.native
  
  var bodies: Double = js.native
  
  var browser: String = js.native
  
  var bwIn: Double = js.native
  
  var bwOut: Double = js.native
  
  var connectivity: String = js.native
  
  var fvonly: Double = js.native
  
  var ignoreSSL: Double = js.native
  
  var iq: Double = js.native
  
  var keepua: Double = js.native
  
  var label: String = js.native
  
  var latency: Double = js.native
  
  var location: String = js.native
  
  var mobile: Double = js.native
  
  var netlog: Double = js.native
  
  var noscript: Double = js.native
  
  var plr: String = js.native
  
  var pngss: Double = js.native
  
  var priority: Double = js.native
  
  var runs: Double = js.native
  
  var scripted: Double = js.native
  
  var standards: Double = js.native
  
  var tcpdump: Double = js.native
  
  var timeline: Double = js.native
  
  var trace: Double = js.native
  
  var url: String = js.native
  
  var video: String = js.native
  
  var web10: Double = js.native
}
object TestInfo {
  
  @scala.inline
  def apply(
    block: String,
    bodies: Double,
    browser: String,
    bwIn: Double,
    bwOut: Double,
    connectivity: String,
    fvonly: Double,
    ignoreSSL: Double,
    iq: Double,
    keepua: Double,
    label: String,
    latency: Double,
    location: String,
    mobile: Double,
    netlog: Double,
    noscript: Double,
    plr: String,
    pngss: Double,
    priority: Double,
    runs: Double,
    scripted: Double,
    standards: Double,
    tcpdump: Double,
    timeline: Double,
    trace: Double,
    url: String,
    video: String,
    web10: Double
  ): TestInfo = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], bodies = bodies.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], bwIn = bwIn.asInstanceOf[js.Any], bwOut = bwOut.asInstanceOf[js.Any], connectivity = connectivity.asInstanceOf[js.Any], fvonly = fvonly.asInstanceOf[js.Any], ignoreSSL = ignoreSSL.asInstanceOf[js.Any], iq = iq.asInstanceOf[js.Any], keepua = keepua.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], netlog = netlog.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], plr = plr.asInstanceOf[js.Any], pngss = pngss.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], scripted = scripted.asInstanceOf[js.Any], standards = standards.asInstanceOf[js.Any], tcpdump = tcpdump.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], web10 = web10.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInfo]
  }
  
  @scala.inline
  implicit class TestInfoMutableBuilder[Self <: TestInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodies(value: Double): Self = StObject.set(x, "bodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwIn(value: Double): Self = StObject.set(x, "bwIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwOut(value: Double): Self = StObject.set(x, "bwOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectivity(value: String): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFvonly(value: Double): Self = StObject.set(x, "fvonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSSL(value: Double): Self = StObject.set(x, "ignoreSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIq(value: Double): Self = StObject.set(x, "iq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepua(value: Double): Self = StObject.set(x, "keepua", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Double): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetlog(value: Double): Self = StObject.set(x, "netlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoscript(value: Double): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlr(value: String): Self = StObject.set(x, "plr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPngss(value: Double): Self = StObject.set(x, "pngss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuns(value: Double): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripted(value: Double): Self = StObject.set(x, "scripted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandards(value: Double): Self = StObject.set(x, "standards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpdump(value: Double): Self = StObject.set(x, "tcpdump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: Double): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace(value: Double): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb10(value: Double): Self = StObject.set(x, "web10", value.asInstanceOf[js.Any])
  }
}

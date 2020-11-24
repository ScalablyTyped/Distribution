package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInfo extends js.Object {
  
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
  implicit class TestInfoOps[Self <: TestInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlock(value: String): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodies(value: Double): Self = this.set("bodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwIn(value: Double): Self = this.set("bwIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBwOut(value: Double): Self = this.set("bwOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectivity(value: String): Self = this.set("connectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFvonly(value: Double): Self = this.set("fvonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSSL(value: Double): Self = this.set("ignoreSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIq(value: Double): Self = this.set("iq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepua(value: Double): Self = this.set("keepua", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatency(value: Double): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Double): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetlog(value: Double): Self = this.set("netlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoscript(value: Double): Self = this.set("noscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlr(value: String): Self = this.set("plr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPngss(value: Double): Self = this.set("pngss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuns(value: Double): Self = this.set("runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripted(value: Double): Self = this.set("scripted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandards(value: Double): Self = this.set("standards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpdump(value: Double): Self = this.set("tcpdump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: Double): Self = this.set("timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace(value: Double): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: String): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb10(value: Double): Self = this.set("web10", value.asInstanceOf[js.Any])
  }
}

package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestInfo extends js.Object {
  var block: String
  var bodies: Double
  var browser: String
  var bwIn: Double
  var bwOut: Double
  var connectivity: String
  var fvonly: Double
  var ignoreSSL: Double
  var iq: Double
  var keepua: Double
  var label: String
  var latency: Double
  var location: String
  var mobile: Double
  var netlog: Double
  var noscript: Double
  var plr: String
  var pngss: Double
  var priority: Double
  var runs: Double
  var scripted: Double
  var standards: Double
  var tcpdump: Double
  var timeline: Double
  var trace: Double
  var url: String
  var video: String
  var web10: Double
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
}


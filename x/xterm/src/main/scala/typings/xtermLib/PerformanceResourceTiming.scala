package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PerformanceResourceTiming extends PerformanceEntry {
  val connectEnd: scala.Double
  val connectStart: scala.Double
  val decodedBodySize: scala.Double
  val domainLookupEnd: scala.Double
  val domainLookupStart: scala.Double
  val encodedBodySize: scala.Double
  val fetchStart: scala.Double
  val initiatorType: java.lang.String
  val nextHopProtocol: java.lang.String
  val redirectEnd: scala.Double
  val redirectStart: scala.Double
  val requestStart: scala.Double
  val responseEnd: scala.Double
  val responseStart: scala.Double
  val secureConnectionStart: scala.Double
  val transferSize: scala.Double
  val workerStart: scala.Double
}

@JSGlobal("PerformanceResourceTiming")
@js.native
object PerformanceResourceTiming
  extends ScalablyTyped.runtime.Instantiable0[PerformanceResourceTiming]


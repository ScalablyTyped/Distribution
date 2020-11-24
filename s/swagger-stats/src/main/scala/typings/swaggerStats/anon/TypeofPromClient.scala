package typings.swaggerStats.anon

import org.scalablytyped.runtime.Instantiable1
import typings.promClient.mod.CounterConfiguration
import typings.promClient.mod.DefaultMetricsCollectorConfiguration
import typings.promClient.mod.GaugeConfiguration
import typings.promClient.mod.HistogramConfiguration
import typings.promClient.mod.Registry
import typings.promClient.mod.SummaryConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPromClient extends js.Object {
  
  var AggregatorRegistry: TypeofAggregatorRegistry = js.native
  
  var Counter: Instantiable1[
    /* configuration */ CounterConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typings.promClient.mod.Counter[String]
  ] = js.native
  
  var Gauge: Instantiable1[
    /* configuration */ GaugeConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typings.promClient.mod.Gauge[String]
  ] = js.native
  
  var Histogram: Instantiable1[
    /* configuration */ HistogramConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typings.promClient.mod.Histogram[String]
  ] = js.native
  
  var Pushgateway: Instantiable1[/* url */ String, typings.promClient.mod.Pushgateway] = js.native
  
  var Registry: TypeofRegistry = js.native
  
  var Summary: Instantiable1[
    /* configuration */ SummaryConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typings.promClient.mod.Summary[String]
  ] = js.native
  
  def collectDefaultMetrics(): Unit = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): Unit = js.native
  
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  
  val register: Registry = js.native
  
  def validateMetricName(name: String): Boolean = js.native
}

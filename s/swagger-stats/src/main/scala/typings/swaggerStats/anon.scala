package typings.swaggerStats

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import typings.promClient.mod.AggregatorRegistry
import typings.promClient.mod.CounterConfiguration
import typings.promClient.mod.DefaultMetricsCollectorConfiguration
import typings.promClient.mod.GaugeConfiguration
import typings.promClient.mod.HistogramConfiguration
import typings.promClient.mod.Registry
import typings.promClient.mod.SummaryConfiguration
import typings.std.Record
import typings.swaggerStats.mod.APIOperationDefinition
import typings.swaggerStats.mod.APIOperationStats
import typings.swaggerStats.mod.ReqResStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var clength: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var params: js.UndefOr[Record[String, Any]] = js.undefined
    
    var query: js.UndefOr[Record[String, Any]] = js.undefined
    
    var route_path: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object Body {
    
    inline def apply(url: String): Body = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setClength(value: Double): Self = StObject.set(x, "clength", value.asInstanceOf[js.Any])
      
      inline def setClengthUndefined: Self = StObject.set(x, "clength", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRoute_path(value: String): Self = StObject.set(x, "route_path", value.asInstanceOf[js.Any])
      
      inline def setRoute_pathUndefined: Self = StObject.set(x, "route_path", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bucketcurrent extends StObject {
    
    var bucket_current: Double
    
    var bucket_duration: Double
    
    var length: Double
  }
  object Bucketcurrent {
    
    inline def apply(bucket_current: Double, bucket_duration: Double, length: Double): Bucketcurrent = {
      val __obj = js.Dynamic.literal(bucket_current = bucket_current.asInstanceOf[js.Any], bucket_duration = bucket_duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucketcurrent]
    }
    
    extension [Self <: Bucketcurrent](x: Self) {
      
      inline def setBucket_current(value: Double): Self = StObject.set(x, "bucket_current", value.asInstanceOf[js.Any])
      
      inline def setBucket_duration(value: Double): Self = StObject.set(x, "bucket_duration", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Class extends StObject {
    
    var `class`: String
    
    var clength: js.UndefOr[Double] = js.undefined
    
    var code: String
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var phrase: String
  }
  object Class {
    
    inline def apply(`class`: String, code: String, phrase: String): Class = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], phrase = phrase.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    extension [Self <: Class](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClength(value: Double): Self = StObject.set(x, "clength", value.asInstanceOf[js.Any])
      
      inline def setClengthUndefined: Self = StObject.set(x, "clength", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    }
  }
  
  trait Deprecated extends StObject {
    
    var deprecated: js.UndefOr[String] = js.undefined
    
    var operationId: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[String] = js.undefined
    
    var path: String
    
    var query: String
    
    var swagger: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[String] = js.undefined
  }
  object Deprecated {
    
    inline def apply(path: String, query: String): Deprecated = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deprecated]
    }
    
    extension [Self <: Deprecated](x: Self) {
      
      inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setSwagger(value: String): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
      
      inline def setSwaggerUndefined: Self = StObject.set(x, "swagger", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait Hostname extends StObject {
    
    var hostname: String
    
    var ip: String
    
    var name: String
    
    var version: String
  }
  object Hostname {
    
    inline def apply(hostname: String, ip: String, name: String, version: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    extension [Self <: Hostname](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationDefinition> */
  trait RecordHTTPMethodAPIOperat extends StObject {
    
    var DELETE: APIOperationDefinition
    
    var GET: APIOperationDefinition
    
    var HEAD: APIOperationDefinition
    
    var OPTIONS: APIOperationDefinition
    
    var PATCH: APIOperationDefinition
    
    var POST: APIOperationDefinition
    
    var PUT: APIOperationDefinition
    
    var TRACE: APIOperationDefinition
  }
  object RecordHTTPMethodAPIOperat {
    
    inline def apply(
      DELETE: APIOperationDefinition,
      GET: APIOperationDefinition,
      HEAD: APIOperationDefinition,
      OPTIONS: APIOperationDefinition,
      PATCH: APIOperationDefinition,
      POST: APIOperationDefinition,
      PUT: APIOperationDefinition,
      TRACE: APIOperationDefinition
    ): RecordHTTPMethodAPIOperat = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], HEAD = HEAD.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], PATCH = PATCH.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordHTTPMethodAPIOperat]
    }
    
    extension [Self <: RecordHTTPMethodAPIOperat](x: Self) {
      
      inline def setDELETE(value: APIOperationDefinition): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setGET(value: APIOperationDefinition): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      inline def setHEAD(value: APIOperationDefinition): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
      
      inline def setOPTIONS(value: APIOperationDefinition): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setPATCH(value: APIOperationDefinition): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
      
      inline def setPOST(value: APIOperationDefinition): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      inline def setPUT(value: APIOperationDefinition): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
      
      inline def setTRACE(value: APIOperationDefinition): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationStats> */
  trait RecordHTTPMethodAPIOperatDELETE extends StObject {
    
    var DELETE: APIOperationStats
    
    var GET: APIOperationStats
    
    var HEAD: APIOperationStats
    
    var OPTIONS: APIOperationStats
    
    var PATCH: APIOperationStats
    
    var POST: APIOperationStats
    
    var PUT: APIOperationStats
    
    var TRACE: APIOperationStats
  }
  object RecordHTTPMethodAPIOperatDELETE {
    
    inline def apply(
      DELETE: APIOperationStats,
      GET: APIOperationStats,
      HEAD: APIOperationStats,
      OPTIONS: APIOperationStats,
      PATCH: APIOperationStats,
      POST: APIOperationStats,
      PUT: APIOperationStats,
      TRACE: APIOperationStats
    ): RecordHTTPMethodAPIOperatDELETE = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], HEAD = HEAD.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], PATCH = PATCH.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordHTTPMethodAPIOperatDELETE]
    }
    
    extension [Self <: RecordHTTPMethodAPIOperatDELETE](x: Self) {
      
      inline def setDELETE(value: APIOperationStats): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setGET(value: APIOperationStats): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      inline def setHEAD(value: APIOperationStats): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
      
      inline def setOPTIONS(value: APIOperationStats): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setPATCH(value: APIOperationStats): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
      
      inline def setPOST(value: APIOperationStats): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      inline def setPUT(value: APIOperationStats): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
      
      inline def setTRACE(value: APIOperationStats): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.ReqResStats> */
  trait RecordHTTPMethodReqResSta extends StObject {
    
    var DELETE: ReqResStats
    
    var GET: ReqResStats
    
    var HEAD: ReqResStats
    
    var OPTIONS: ReqResStats
    
    var PATCH: ReqResStats
    
    var POST: ReqResStats
    
    var PUT: ReqResStats
    
    var TRACE: ReqResStats
  }
  object RecordHTTPMethodReqResSta {
    
    inline def apply(
      DELETE: ReqResStats,
      GET: ReqResStats,
      HEAD: ReqResStats,
      OPTIONS: ReqResStats,
      PATCH: ReqResStats,
      POST: ReqResStats,
      PUT: ReqResStats,
      TRACE: ReqResStats
    ): RecordHTTPMethodReqResSta = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], HEAD = HEAD.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], PATCH = PATCH.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordHTTPMethodReqResSta]
    }
    
    extension [Self <: RecordHTTPMethodReqResSta](x: Self) {
      
      inline def setDELETE(value: ReqResStats): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setGET(value: ReqResStats): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      inline def setHEAD(value: ReqResStats): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
      
      inline def setOPTIONS(value: ReqResStats): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setPATCH(value: ReqResStats): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
      
      inline def setPOST(value: ReqResStats): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      inline def setPUT(value: ReqResStats): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
      
      inline def setTRACE(value: ReqResStats): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethodSubset, swagger-stats.swagger-stats.ReqResStats> */
  trait RecordHTTPMethodSubsetReq extends StObject {
    
    var DELETE: ReqResStats
    
    var GET: ReqResStats
    
    var POST: ReqResStats
    
    var PUT: ReqResStats
  }
  object RecordHTTPMethodSubsetReq {
    
    inline def apply(DELETE: ReqResStats, GET: ReqResStats, POST: ReqResStats, PUT: ReqResStats): RecordHTTPMethodSubsetReq = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordHTTPMethodSubsetReq]
    }
    
    extension [Self <: RecordHTTPMethodSubsetReq](x: Self) {
      
      inline def setDELETE(value: ReqResStats): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      inline def setGET(value: ReqResStats): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      inline def setPOST(value: ReqResStats): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      inline def setPUT(value: ReqResStats): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var request: Body
    
    var response: Class
  }
  object Request {
    
    inline def apply(request: Body, response: Class): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setRequest(value: Body): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Class): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofAggregatorRegistry
    extends StObject
       with Instantiable0[AggregatorRegistry] {
    
    /**
    	 * Creates a new Registry instance from an array of metrics that were
    	 * created by `registry.getMetricsAsJSON()`. Metrics are aggregated using
    	 * the method specified by their `aggregator` property, or by summation if
    	 * `aggregator` is undefined.
    	 * @param {Array} metricsArr Array of metrics, each of which created by
    	 *   `registry.getMetricsAsJSON()`.
    	 * @return {Registry} aggregated registry.
    	 */
    def aggregate(metricsArr: js.Array[js.Object]): Registry = js.native
    
    // TODO Promise?
    /**
    	 * Sets the registry or registries to be aggregated. Call from workers to
    	 * use a registry/registries other than the default global registry.
    	 * @param {Array<Registry>|Registry} regs Registry or registries to be
    	 *   aggregated.
    	 * @return {void}
    	 */
    def setRegistries(regs: js.Array[Registry]): Unit = js.native
    def setRegistries(regs: Registry): Unit = js.native
  }
  
  @js.native
  trait TypeofPromClient extends StObject {
    
    var AggregatorRegistry: TypeofAggregatorRegistry = js.native
    
    var Counter: Instantiable1[
        /* configuration */ CounterConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        typings.promClient.mod.Counter[String]
      ] = js.native
    
    var Gauge: Instantiable1[
        /* configuration */ GaugeConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        typings.promClient.mod.Gauge[String]
      ] = js.native
    
    var Histogram: Instantiable1[
        /* configuration */ HistogramConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        typings.promClient.mod.Histogram[String]
      ] = js.native
    
    var Pushgateway: Instantiable1[/* url */ String, typings.promClient.mod.Pushgateway] = js.native
    
    var Registry: TypeofRegistry = js.native
    
    var Summary: Instantiable1[
        /* configuration */ SummaryConfiguration[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        typings.promClient.mod.Summary[String]
      ] = js.native
    
    def collectDefaultMetrics(): Unit = js.native
    def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): Unit = js.native
    
    val contentType: String = js.native
    
    def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
    
    def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
    
    val register: Registry = js.native
    
    def validateMetricName(name: String): Boolean = js.native
  }
  
  @js.native
  trait TypeofRegistry
    extends StObject
       with Instantiable0[Registry] {
    
    /**
    	 * Merge registers
    	 * @param registers The registers you want to merge together
    	 */
    def merge(registers: js.Array[Registry]): Registry = js.native
  }
}

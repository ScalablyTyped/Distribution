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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var clength: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.native
    
    var params: js.UndefOr[Record[String, _]] = js.native
    
    var query: js.UndefOr[Record[String, _]] = js.native
    
    var route_path: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(url: String): Body = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setClength(value: Double): Self = StObject.set(x, "clength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClengthUndefined: Self = StObject.set(x, "clength", js.undefined)
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setParams(value: Record[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuery(value: Record[String, _]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRoute_path(value: String): Self = StObject.set(x, "route_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute_pathUndefined: Self = StObject.set(x, "route_path", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bucketcurrent extends StObject {
    
    var bucket_current: Double = js.native
    
    var bucket_duration: Double = js.native
    
    var length: Double = js.native
  }
  object Bucketcurrent {
    
    @scala.inline
    def apply(bucket_current: Double, bucket_duration: Double, length: Double): Bucketcurrent = {
      val __obj = js.Dynamic.literal(bucket_current = bucket_current.asInstanceOf[js.Any], bucket_duration = bucket_duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucketcurrent]
    }
    
    @scala.inline
    implicit class BucketcurrentMutableBuilder[Self <: Bucketcurrent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket_current(value: Double): Self = StObject.set(x, "bucket_current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucket_duration(value: Double): Self = StObject.set(x, "bucket_duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Class extends StObject {
    
    var `class`: String = js.native
    
    var clength: js.UndefOr[Double] = js.native
    
    var code: String = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var phrase: String = js.native
  }
  object Class {
    
    @scala.inline
    def apply(`class`: String, code: String, phrase: String): Class = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], phrase = phrase.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    @scala.inline
    implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClength(value: Double): Self = StObject.set(x, "clength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClengthUndefined: Self = StObject.set(x, "clength", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deprecated extends StObject {
    
    var deprecated: js.UndefOr[String] = js.native
    
    var operationId: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    var query: String = js.native
    
    var swagger: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[String] = js.native
  }
  object Deprecated {
    
    @scala.inline
    def apply(path: String, query: String): Deprecated = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deprecated]
    }
    
    @scala.inline
    implicit class DeprecatedMutableBuilder[Self <: Deprecated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      @scala.inline
      def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwagger(value: String): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerUndefined: Self = StObject.set(x, "swagger", js.undefined)
      
      @scala.inline
      def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait Hostname extends StObject {
    
    var hostname: String = js.native
    
    var ip: String = js.native
    
    var name: String = js.native
    
    var version: String = js.native
  }
  object Hostname {
    
    @scala.inline
    def apply(hostname: String, ip: String, name: String, version: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationDefinition> */
  @js.native
  trait RecordHTTPMethodAPIOperat extends StObject {
    
    var DELETE: APIOperationDefinition = js.native
    
    var GET: APIOperationDefinition = js.native
    
    var HEAD: APIOperationDefinition = js.native
    
    var OPTIONS: APIOperationDefinition = js.native
    
    var PATCH: APIOperationDefinition = js.native
    
    var POST: APIOperationDefinition = js.native
    
    var PUT: APIOperationDefinition = js.native
    
    var TRACE: APIOperationDefinition = js.native
  }
  object RecordHTTPMethodAPIOperat {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RecordHTTPMethodAPIOperatMutableBuilder[Self <: RecordHTTPMethodAPIOperat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDELETE(value: APIOperationDefinition): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET(value: APIOperationDefinition): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEAD(value: APIOperationDefinition): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPTIONS(value: APIOperationDefinition): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPATCH(value: APIOperationDefinition): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOST(value: APIOperationDefinition): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUT(value: APIOperationDefinition): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRACE(value: APIOperationDefinition): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationStats> */
  @js.native
  trait RecordHTTPMethodAPIOperatDELETE extends StObject {
    
    var DELETE: APIOperationStats = js.native
    
    var GET: APIOperationStats = js.native
    
    var HEAD: APIOperationStats = js.native
    
    var OPTIONS: APIOperationStats = js.native
    
    var PATCH: APIOperationStats = js.native
    
    var POST: APIOperationStats = js.native
    
    var PUT: APIOperationStats = js.native
    
    var TRACE: APIOperationStats = js.native
  }
  object RecordHTTPMethodAPIOperatDELETE {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RecordHTTPMethodAPIOperatDELETEMutableBuilder[Self <: RecordHTTPMethodAPIOperatDELETE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDELETE(value: APIOperationStats): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET(value: APIOperationStats): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEAD(value: APIOperationStats): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPTIONS(value: APIOperationStats): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPATCH(value: APIOperationStats): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOST(value: APIOperationStats): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUT(value: APIOperationStats): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRACE(value: APIOperationStats): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.ReqResStats> */
  @js.native
  trait RecordHTTPMethodReqResSta extends StObject {
    
    var DELETE: ReqResStats = js.native
    
    var GET: ReqResStats = js.native
    
    var HEAD: ReqResStats = js.native
    
    var OPTIONS: ReqResStats = js.native
    
    var PATCH: ReqResStats = js.native
    
    var POST: ReqResStats = js.native
    
    var PUT: ReqResStats = js.native
    
    var TRACE: ReqResStats = js.native
  }
  object RecordHTTPMethodReqResSta {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RecordHTTPMethodReqResStaMutableBuilder[Self <: RecordHTTPMethodReqResSta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDELETE(value: ReqResStats): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET(value: ReqResStats): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEAD(value: ReqResStats): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPTIONS(value: ReqResStats): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPATCH(value: ReqResStats): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOST(value: ReqResStats): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUT(value: ReqResStats): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRACE(value: ReqResStats): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethodSubset, swagger-stats.swagger-stats.ReqResStats> */
  @js.native
  trait RecordHTTPMethodSubsetReq extends StObject {
    
    var DELETE: ReqResStats = js.native
    
    var GET: ReqResStats = js.native
    
    var POST: ReqResStats = js.native
    
    var PUT: ReqResStats = js.native
  }
  object RecordHTTPMethodSubsetReq {
    
    @scala.inline
    def apply(DELETE: ReqResStats, GET: ReqResStats, POST: ReqResStats, PUT: ReqResStats): RecordHTTPMethodSubsetReq = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordHTTPMethodSubsetReq]
    }
    
    @scala.inline
    implicit class RecordHTTPMethodSubsetReqMutableBuilder[Self <: RecordHTTPMethodSubsetReq] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDELETE(value: ReqResStats): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET(value: ReqResStats): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOST(value: ReqResStats): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUT(value: ReqResStats): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    var request: Body = js.native
    
    var response: Class = js.native
  }
  object Request {
    
    @scala.inline
    def apply(request: Body, response: Class): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Body): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Class): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofAggregatorRegistry extends Instantiable0[AggregatorRegistry] {
    
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
  
  @js.native
  trait TypeofRegistry extends Instantiable0[Registry] {
    
    /**
    	 * Merge registers
    	 * @param registers The registers you want to merge together
    	 */
    def merge(registers: js.Array[Registry]): Registry = js.native
  }
}

package typings.swaggerStats

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.fastify.instanceMod.FastifyInstance
import typings.fastify.loggerMod.FastifyLoggerInstance
import typings.fastify.utilsMod.RawReplyDefaultExpression
import typings.fastify.utilsMod.RawRequestDefaultExpression
import typings.fastify.utilsMod.RawServerDefault
import typings.hapiHapi.mod.Server_
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import typings.swaggerStats.anon.Bucketcurrent
import typings.swaggerStats.anon.Deprecated
import typings.swaggerStats.anon.Hostname
import typings.swaggerStats.anon.RecordHTTPMethodAPIOperat
import typings.swaggerStats.anon.RecordHTTPMethodAPIOperatDELETE
import typings.swaggerStats.anon.RecordHTTPMethodReqResSta
import typings.swaggerStats.anon.RecordHTTPMethodSubsetReq
import typings.swaggerStats.anon.Request
import typings.swaggerStats.anon.TypeofPromClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-stats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCoreStats(): CoreStats = ^.asInstanceOf[js.Dynamic].applyDynamic("getCoreStats")().asInstanceOf[CoreStats]
  
  inline def getFastifyPlugin(
    fastify: FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyLoggerInstance
    ],
    opts: SWStats,
    done: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFastifyPlugin")(fastify.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object getHapiPlugin {
    
    @JSImport("swagger-stats", "getHapiPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("swagger-stats", "getHapiPlugin.name")
    @js.native
    val name: String = js.native
    
    inline def register(server: Server_): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(server.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def register(server: Server_, opts: SWStats): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(server.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("swagger-stats", "getHapiPlugin.version")
    @js.native
    val version: String = js.native
  }
  
  inline def getMiddleware(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMiddleware")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def getMiddleware(opts: SWStats): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMiddleware")(opts.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def getPromClient(): TypeofPromClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getPromClient")().asInstanceOf[TypeofPromClient]
  
  inline def getPromStats(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPromStats")().asInstanceOf[String]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  trait APIOperationDefinition extends StObject {
    
    var deprecated: Boolean
    
    var description: js.UndefOr[String] = js.undefined
    
    var operationId: js.UndefOr[String] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var swagger: Boolean
    
    var tags: js.UndefOr[js.Any] = js.undefined
  }
  object APIOperationDefinition {
    
    inline def apply(deprecated: Boolean, swagger: Boolean): APIOperationDefinition = {
      val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIOperationDefinition]
    }
    
    extension [Self <: APIOperationDefinition](x: Self) {
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSwagger(value: Boolean): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait APIOperationStats extends StObject {
    
    var defs: js.UndefOr[APIOperationDefinition] = js.undefined
    
    var details: js.UndefOr[APIOperationDefinition] = js.undefined
    
    var stats: js.UndefOr[APIOperationDefinition] = js.undefined
  }
  object APIOperationStats {
    
    inline def apply(): APIOperationStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIOperationStats]
    }
    
    extension [Self <: APIOperationStats](x: Self) {
      
      inline def setDefs(value: APIOperationDefinition): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      inline def setDetails(value: APIOperationDefinition): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setStats(value: APIOperationDefinition): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  trait CoreStats extends StObject {
    
    var all: ReqResStats
    
    var apdexThreshold: Double
    
    var apidefs: js.UndefOr[Record[String, RecordHTTPMethodAPIOperat]] = js.undefined
    
    var apiop: js.UndefOr[Record[String, RecordHTTPMethodAPIOperatDELETE]] = js.undefined
    
    var apistats: js.UndefOr[Record[String, RecordHTTPMethodReqResSta]] = js.undefined
    
    var egress: ReqResStats
    
    var errors: js.UndefOr[ErrorsStats] = js.undefined
    
    var hostname: String
    
    var ip: String
    
    var lasterrors: js.UndefOr[js.Array[RequestResponseRecord]] = js.undefined
    
    var longestreq: js.UndefOr[js.Array[RequestResponseRecord]] = js.undefined
    
    var method: js.UndefOr[RecordHTTPMethodSubsetReq] = js.undefined
    
    var name: String
    
    var startts: Double
    
    var sys: SysStats
    
    var timeline: js.UndefOr[TimelineStats] = js.undefined
    
    var version: String
  }
  object CoreStats {
    
    inline def apply(
      all: ReqResStats,
      apdexThreshold: Double,
      egress: ReqResStats,
      hostname: String,
      ip: String,
      name: String,
      startts: Double,
      sys: SysStats,
      version: String
    ): CoreStats = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], apdexThreshold = apdexThreshold.asInstanceOf[js.Any], egress = egress.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startts = startts.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoreStats]
    }
    
    extension [Self <: CoreStats](x: Self) {
      
      inline def setAll(value: ReqResStats): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setApdexThreshold(value: Double): Self = StObject.set(x, "apdexThreshold", value.asInstanceOf[js.Any])
      
      inline def setApidefs(value: Record[String, RecordHTTPMethodAPIOperat]): Self = StObject.set(x, "apidefs", value.asInstanceOf[js.Any])
      
      inline def setApidefsUndefined: Self = StObject.set(x, "apidefs", js.undefined)
      
      inline def setApiop(value: Record[String, RecordHTTPMethodAPIOperatDELETE]): Self = StObject.set(x, "apiop", value.asInstanceOf[js.Any])
      
      inline def setApiopUndefined: Self = StObject.set(x, "apiop", js.undefined)
      
      inline def setApistats(value: Record[String, RecordHTTPMethodReqResSta]): Self = StObject.set(x, "apistats", value.asInstanceOf[js.Any])
      
      inline def setApistatsUndefined: Self = StObject.set(x, "apistats", js.undefined)
      
      inline def setEgress(value: ReqResStats): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: ErrorsStats): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setLasterrors(value: js.Array[RequestResponseRecord]): Self = StObject.set(x, "lasterrors", value.asInstanceOf[js.Any])
      
      inline def setLasterrorsUndefined: Self = StObject.set(x, "lasterrors", js.undefined)
      
      inline def setLasterrorsVarargs(value: RequestResponseRecord*): Self = StObject.set(x, "lasterrors", js.Array(value :_*))
      
      inline def setLongestreq(value: js.Array[RequestResponseRecord]): Self = StObject.set(x, "longestreq", value.asInstanceOf[js.Any])
      
      inline def setLongestreqUndefined: Self = StObject.set(x, "longestreq", js.undefined)
      
      inline def setLongestreqVarargs(value: RequestResponseRecord*): Self = StObject.set(x, "longestreq", js.Array(value :_*))
      
      inline def setMethod(value: RecordHTTPMethodSubsetReq): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStartts(value: Double): Self = StObject.set(x, "startts", value.asInstanceOf[js.Any])
      
      inline def setSys(value: SysStats): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      inline def setTimeline(value: TimelineStats): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorsStats extends StObject {
    
    var statuscode: Record[Double, Double]
    
    var topnotfound: Record[String, Double]
    
    var topservererror: Record[String, Double]
  }
  object ErrorsStats {
    
    inline def apply(
      statuscode: Record[Double, Double],
      topnotfound: Record[String, Double],
      topservererror: Record[String, Double]
    ): ErrorsStats = {
      val __obj = js.Dynamic.literal(statuscode = statuscode.asInstanceOf[js.Any], topnotfound = topnotfound.asInstanceOf[js.Any], topservererror = topservererror.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorsStats]
    }
    
    extension [Self <: ErrorsStats](x: Self) {
      
      inline def setStatuscode(value: Record[Double, Double]): Self = StObject.set(x, "statuscode", value.asInstanceOf[js.Any])
      
      inline def setTopnotfound(value: Record[String, Double]): Self = StObject.set(x, "topnotfound", value.asInstanceOf[js.Any])
      
      inline def setTopservererror(value: Record[String, Double]): Self = StObject.set(x, "topservererror", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.swaggerStats.swaggerStatsStrings.HEAD
    - typings.swaggerStats.swaggerStatsStrings.OPTIONS
    - typings.swaggerStats.swaggerStatsStrings.TRACE
    - typings.swaggerStats.swaggerStatsStrings.PATCH
    - typings.swaggerStats.swaggerStatsStrings.GET
    - typings.swaggerStats.swaggerStatsStrings.POST
    - typings.swaggerStats.swaggerStatsStrings.PUT
    - typings.swaggerStats.swaggerStatsStrings.DELETE
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    inline def DELETE: typings.swaggerStats.swaggerStatsStrings.DELETE = "DELETE".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.DELETE]
    
    inline def GET: typings.swaggerStats.swaggerStatsStrings.GET = "GET".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.GET]
    
    inline def HEAD: typings.swaggerStats.swaggerStatsStrings.HEAD = "HEAD".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.HEAD]
    
    inline def OPTIONS: typings.swaggerStats.swaggerStatsStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.OPTIONS]
    
    inline def PATCH: typings.swaggerStats.swaggerStatsStrings.PATCH = "PATCH".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.PATCH]
    
    inline def POST: typings.swaggerStats.swaggerStatsStrings.POST = "POST".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.POST]
    
    inline def PUT: typings.swaggerStats.swaggerStatsStrings.PUT = "PUT".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.PUT]
    
    inline def TRACE: typings.swaggerStats.swaggerStatsStrings.TRACE = "TRACE".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.TRACE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.swaggerStats.swaggerStatsStrings.GET
    - typings.swaggerStats.swaggerStatsStrings.POST
    - typings.swaggerStats.swaggerStatsStrings.PUT
    - typings.swaggerStats.swaggerStatsStrings.DELETE
  */
  trait HTTPMethodSubset extends StObject
  object HTTPMethodSubset {
    
    inline def DELETE: typings.swaggerStats.swaggerStatsStrings.DELETE = "DELETE".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.DELETE]
    
    inline def GET: typings.swaggerStats.swaggerStatsStrings.GET = "GET".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.GET]
    
    inline def POST: typings.swaggerStats.swaggerStatsStrings.POST = "POST".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.POST]
    
    inline def PUT: typings.swaggerStats.swaggerStatsStrings.PUT = "PUT".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.PUT]
  }
  
  trait ReqResStats extends StObject {
    
    var apdex_satisfied: Double
    
    var apdex_score: Double
    
    var apdex_threshold: Double
    
    var apdex_tolerated: Double
    
    var avg_req_clength: Double
    
    var avg_res_clength: Double
    
    var avg_time: Double
    
    var client_error: Double
    
    var err_rate: Double
    
    var errors: Double
    
    var info: Double
    
    var max_req_clength: Double
    
    var max_res_clength: Double
    
    var max_time: Double
    
    var redirect: Double
    
    var req_rate: Double
    
    var requests: Double
    
    var responses: Double
    
    var server_error: Double
    
    var success: Double
    
    var total_req_clength: Double
    
    var total_res_clength: Double
    
    var total_time: Double
  }
  object ReqResStats {
    
    inline def apply(
      apdex_satisfied: Double,
      apdex_score: Double,
      apdex_threshold: Double,
      apdex_tolerated: Double,
      avg_req_clength: Double,
      avg_res_clength: Double,
      avg_time: Double,
      client_error: Double,
      err_rate: Double,
      errors: Double,
      info: Double,
      max_req_clength: Double,
      max_res_clength: Double,
      max_time: Double,
      redirect: Double,
      req_rate: Double,
      requests: Double,
      responses: Double,
      server_error: Double,
      success: Double,
      total_req_clength: Double,
      total_res_clength: Double,
      total_time: Double
    ): ReqResStats = {
      val __obj = js.Dynamic.literal(apdex_satisfied = apdex_satisfied.asInstanceOf[js.Any], apdex_score = apdex_score.asInstanceOf[js.Any], apdex_threshold = apdex_threshold.asInstanceOf[js.Any], apdex_tolerated = apdex_tolerated.asInstanceOf[js.Any], avg_req_clength = avg_req_clength.asInstanceOf[js.Any], avg_res_clength = avg_res_clength.asInstanceOf[js.Any], avg_time = avg_time.asInstanceOf[js.Any], client_error = client_error.asInstanceOf[js.Any], err_rate = err_rate.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], max_req_clength = max_req_clength.asInstanceOf[js.Any], max_res_clength = max_res_clength.asInstanceOf[js.Any], max_time = max_time.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], req_rate = req_rate.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], server_error = server_error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total_req_clength = total_req_clength.asInstanceOf[js.Any], total_res_clength = total_res_clength.asInstanceOf[js.Any], total_time = total_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReqResStats]
    }
    
    extension [Self <: ReqResStats](x: Self) {
      
      inline def setApdex_satisfied(value: Double): Self = StObject.set(x, "apdex_satisfied", value.asInstanceOf[js.Any])
      
      inline def setApdex_score(value: Double): Self = StObject.set(x, "apdex_score", value.asInstanceOf[js.Any])
      
      inline def setApdex_threshold(value: Double): Self = StObject.set(x, "apdex_threshold", value.asInstanceOf[js.Any])
      
      inline def setApdex_tolerated(value: Double): Self = StObject.set(x, "apdex_tolerated", value.asInstanceOf[js.Any])
      
      inline def setAvg_req_clength(value: Double): Self = StObject.set(x, "avg_req_clength", value.asInstanceOf[js.Any])
      
      inline def setAvg_res_clength(value: Double): Self = StObject.set(x, "avg_res_clength", value.asInstanceOf[js.Any])
      
      inline def setAvg_time(value: Double): Self = StObject.set(x, "avg_time", value.asInstanceOf[js.Any])
      
      inline def setClient_error(value: Double): Self = StObject.set(x, "client_error", value.asInstanceOf[js.Any])
      
      inline def setErr_rate(value: Double): Self = StObject.set(x, "err_rate", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setMax_req_clength(value: Double): Self = StObject.set(x, "max_req_clength", value.asInstanceOf[js.Any])
      
      inline def setMax_res_clength(value: Double): Self = StObject.set(x, "max_res_clength", value.asInstanceOf[js.Any])
      
      inline def setMax_time(value: Double): Self = StObject.set(x, "max_time", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: Double): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setReq_rate(value: Double): Self = StObject.set(x, "req_rate", value.asInstanceOf[js.Any])
      
      inline def setRequests(value: Double): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setResponses(value: Double): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setServer_error(value: Double): Self = StObject.set(x, "server_error", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTotal_req_clength(value: Double): Self = StObject.set(x, "total_req_clength", value.asInstanceOf[js.Any])
      
      inline def setTotal_res_clength(value: Double): Self = StObject.set(x, "total_res_clength", value.asInstanceOf[js.Any])
      
      inline def setTotal_time(value: Double): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResponseRecord
    extends StObject
       with /* field */ StringDictionary[js.Any] {
    
    var `@timestamp`: String
    
    var api: Deprecated
    
    var attrs: js.UndefOr[Record[String, String]] = js.undefined
    
    var attrsint: js.UndefOr[Record[String, Double]] = js.undefined
    
    var endts: Double
    
    var http: Request
    
    var ip: String
    
    var method: String
    
    var node: Hostname
    
    var path: String
    
    var port: String
    
    var query: String
    
    var real_ip: String
    
    var responsetime: Double
    
    var startts: Double
  }
  object RequestResponseRecord {
    
    inline def apply(
      `@timestamp`: String,
      api: Deprecated,
      endts: Double,
      http: Request,
      ip: String,
      method: String,
      node: Hostname,
      path: String,
      port: String,
      query: String,
      real_ip: String,
      responsetime: Double,
      startts: Double
    ): RequestResponseRecord = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], endts = endts.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], real_ip = real_ip.asInstanceOf[js.Any], responsetime = responsetime.asInstanceOf[js.Any], startts = startts.asInstanceOf[js.Any])
      __obj.updateDynamic("@timestamp")(`@timestamp`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResponseRecord]
    }
    
    extension [Self <: RequestResponseRecord](x: Self) {
      
      inline def `set@timestamp`(value: String): Self = StObject.set(x, "@timestamp", value.asInstanceOf[js.Any])
      
      inline def setApi(value: Deprecated): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setAttrsint(value: Record[String, Double]): Self = StObject.set(x, "attrsint", value.asInstanceOf[js.Any])
      
      inline def setAttrsintUndefined: Self = StObject.set(x, "attrsint", js.undefined)
      
      inline def setEndts(value: Double): Self = StObject.set(x, "endts", value.asInstanceOf[js.Any])
      
      inline def setHttp(value: Request): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Hostname): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReal_ip(value: String): Self = StObject.set(x, "real_ip", value.asInstanceOf[js.Any])
      
      inline def setResponsetime(value: Double): Self = StObject.set(x, "responsetime", value.asInstanceOf[js.Any])
      
      inline def setStartts(value: Double): Self = StObject.set(x, "startts", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  hostname :string,   name :string,   version :string,   ip :string,   swaggerSpec :std.Record<any, any>,   uriPath :string,   timelineBucketDuration :number,   durationBuckets :std.Array<number>,   requestSizeBuckets :std.Array<number>,   responseSizeBuckets :std.Array<number>,   apdexThreshold :number, onResponseFinish (req : node.http.IncomingMessage, res : node.http.ServerResponse, rrr : swagger-stats.swagger-stats.RequestResponseRecord): void,   authentication :boolean, onAuthenticate (req : node.http.IncomingMessage, username : string, password : string): boolean,   sessionMaxAge :number,   elasticsearch :string,   elasticsearchIndexPrefix :string,   elasticsearchUsername :string,   elasticsearchPassword :string,   swaggerOnly :boolean,   metricsPrefix :string,   enableEgress :boolean}> */
  trait SWStats extends StObject {
    
    var apdexThreshold: js.UndefOr[Double] = js.undefined
    
    var authentication: js.UndefOr[Boolean] = js.undefined
    
    var durationBuckets: js.UndefOr[js.Array[Double]] = js.undefined
    
    var elasticsearch: js.UndefOr[String] = js.undefined
    
    var elasticsearchIndexPrefix: js.UndefOr[String] = js.undefined
    
    var elasticsearchPassword: js.UndefOr[String] = js.undefined
    
    var elasticsearchUsername: js.UndefOr[String] = js.undefined
    
    var enableEgress: js.UndefOr[Boolean] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var metricsPrefix: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAuthenticate: js.UndefOr[
        js.Function3[/* req */ IncomingMessage, /* username */ String, /* password */ String, Boolean]
      ] = js.undefined
    
    var onResponseFinish: js.UndefOr[
        js.Function3[
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* rrr */ RequestResponseRecord, 
          Unit
        ]
      ] = js.undefined
    
    var requestSizeBuckets: js.UndefOr[js.Array[Double]] = js.undefined
    
    var responseSizeBuckets: js.UndefOr[js.Array[Double]] = js.undefined
    
    var sessionMaxAge: js.UndefOr[Double] = js.undefined
    
    var swaggerOnly: js.UndefOr[Boolean] = js.undefined
    
    var swaggerSpec: js.UndefOr[Record[js.Any, js.Any]] = js.undefined
    
    var timelineBucketDuration: js.UndefOr[Double] = js.undefined
    
    var uriPath: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object SWStats {
    
    inline def apply(): SWStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SWStats]
    }
    
    extension [Self <: SWStats](x: Self) {
      
      inline def setApdexThreshold(value: Double): Self = StObject.set(x, "apdexThreshold", value.asInstanceOf[js.Any])
      
      inline def setApdexThresholdUndefined: Self = StObject.set(x, "apdexThreshold", js.undefined)
      
      inline def setAuthentication(value: Boolean): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      inline def setDurationBuckets(value: js.Array[Double]): Self = StObject.set(x, "durationBuckets", value.asInstanceOf[js.Any])
      
      inline def setDurationBucketsUndefined: Self = StObject.set(x, "durationBuckets", js.undefined)
      
      inline def setDurationBucketsVarargs(value: Double*): Self = StObject.set(x, "durationBuckets", js.Array(value :_*))
      
      inline def setElasticsearch(value: String): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchIndexPrefix(value: String): Self = StObject.set(x, "elasticsearchIndexPrefix", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchIndexPrefixUndefined: Self = StObject.set(x, "elasticsearchIndexPrefix", js.undefined)
      
      inline def setElasticsearchPassword(value: String): Self = StObject.set(x, "elasticsearchPassword", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchPasswordUndefined: Self = StObject.set(x, "elasticsearchPassword", js.undefined)
      
      inline def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
      
      inline def setElasticsearchUsername(value: String): Self = StObject.set(x, "elasticsearchUsername", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchUsernameUndefined: Self = StObject.set(x, "elasticsearchUsername", js.undefined)
      
      inline def setEnableEgress(value: Boolean): Self = StObject.set(x, "enableEgress", value.asInstanceOf[js.Any])
      
      inline def setEnableEgressUndefined: Self = StObject.set(x, "enableEgress", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setMetricsPrefix(value: String): Self = StObject.set(x, "metricsPrefix", value.asInstanceOf[js.Any])
      
      inline def setMetricsPrefixUndefined: Self = StObject.set(x, "metricsPrefix", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAuthenticate(value: (/* req */ IncomingMessage, /* username */ String, /* password */ String) => Boolean): Self = StObject.set(x, "onAuthenticate", js.Any.fromFunction3(value))
      
      inline def setOnAuthenticateUndefined: Self = StObject.set(x, "onAuthenticate", js.undefined)
      
      inline def setOnResponseFinish(
        value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* rrr */ RequestResponseRecord) => Unit
      ): Self = StObject.set(x, "onResponseFinish", js.Any.fromFunction3(value))
      
      inline def setOnResponseFinishUndefined: Self = StObject.set(x, "onResponseFinish", js.undefined)
      
      inline def setRequestSizeBuckets(value: js.Array[Double]): Self = StObject.set(x, "requestSizeBuckets", value.asInstanceOf[js.Any])
      
      inline def setRequestSizeBucketsUndefined: Self = StObject.set(x, "requestSizeBuckets", js.undefined)
      
      inline def setRequestSizeBucketsVarargs(value: Double*): Self = StObject.set(x, "requestSizeBuckets", js.Array(value :_*))
      
      inline def setResponseSizeBuckets(value: js.Array[Double]): Self = StObject.set(x, "responseSizeBuckets", value.asInstanceOf[js.Any])
      
      inline def setResponseSizeBucketsUndefined: Self = StObject.set(x, "responseSizeBuckets", js.undefined)
      
      inline def setResponseSizeBucketsVarargs(value: Double*): Self = StObject.set(x, "responseSizeBuckets", js.Array(value :_*))
      
      inline def setSessionMaxAge(value: Double): Self = StObject.set(x, "sessionMaxAge", value.asInstanceOf[js.Any])
      
      inline def setSessionMaxAgeUndefined: Self = StObject.set(x, "sessionMaxAge", js.undefined)
      
      inline def setSwaggerOnly(value: Boolean): Self = StObject.set(x, "swaggerOnly", value.asInstanceOf[js.Any])
      
      inline def setSwaggerOnlyUndefined: Self = StObject.set(x, "swaggerOnly", js.undefined)
      
      inline def setSwaggerSpec(value: Record[js.Any, js.Any]): Self = StObject.set(x, "swaggerSpec", value.asInstanceOf[js.Any])
      
      inline def setSwaggerSpecUndefined: Self = StObject.set(x, "swaggerSpec", js.undefined)
      
      inline def setTimelineBucketDuration(value: Double): Self = StObject.set(x, "timelineBucketDuration", value.asInstanceOf[js.Any])
      
      inline def setTimelineBucketDurationUndefined: Self = StObject.set(x, "timelineBucketDuration", js.undefined)
      
      inline def setUriPath(value: String): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
      
      inline def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait SysStats extends StObject {
    
    var cpu: Double
    
    var external: Double
    
    var heapTotal: Double
    
    var heapUsed: Double
    
    var rss: Double
  }
  object SysStats {
    
    inline def apply(cpu: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): SysStats = {
      val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
      __obj.asInstanceOf[SysStats]
    }
    
    extension [Self <: SysStats](x: Self) {
      
      inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setHeapTotal(value: Double): Self = StObject.set(x, "heapTotal", value.asInstanceOf[js.Any])
      
      inline def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
      
      inline def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimelineStats extends StObject {
    
    var data: Record[String, TimelineStatsData]
    
    var settings: Bucketcurrent
  }
  object TimelineStats {
    
    inline def apply(data: Record[String, TimelineStatsData], settings: Bucketcurrent): TimelineStats = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineStats]
    }
    
    extension [Self <: TimelineStats](x: Self) {
      
      inline def setData(value: Record[String, TimelineStatsData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: Bucketcurrent): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimelineStatsData extends StObject {
    
    var stats: ReqResStats
    
    var sys: SysStats
  }
  object TimelineStatsData {
    
    inline def apply(stats: ReqResStats, sys: SysStats): TimelineStatsData = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineStatsData]
    }
    
    extension [Self <: TimelineStatsData](x: Self) {
      
      inline def setStats(value: ReqResStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setSys(value: SysStats): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}

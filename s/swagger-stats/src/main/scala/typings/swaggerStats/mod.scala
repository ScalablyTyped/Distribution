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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-stats", "getCoreStats")
  @js.native
  def getCoreStats(): CoreStats = js.native
  
  @JSImport("swagger-stats", "getFastifyPlugin")
  @js.native
  def getFastifyPlugin(
    fastify: FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyLoggerInstance
    ],
    opts: SWStats,
    done: js.Function0[Unit]
  ): Unit = js.native
  
  object getHapiPlugin {
    
    @JSImport("swagger-stats", "getHapiPlugin.name")
    @js.native
    val name: String = js.native
    
    @JSImport("swagger-stats", "getHapiPlugin.register")
    @js.native
    def register(server: Server_): js.Promise[Unit] = js.native
    @JSImport("swagger-stats", "getHapiPlugin.register")
    @js.native
    def register(server: Server_, opts: SWStats): js.Promise[Unit] = js.native
    
    @JSImport("swagger-stats", "getHapiPlugin.version")
    @js.native
    val version: String = js.native
  }
  
  @JSImport("swagger-stats", "getMiddleware")
  @js.native
  def getMiddleware(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("swagger-stats", "getMiddleware")
  @js.native
  def getMiddleware(opts: SWStats): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("swagger-stats", "getPromClient")
  @js.native
  def getPromClient(): TypeofPromClient = js.native
  
  @JSImport("swagger-stats", "getPromStats")
  @js.native
  def getPromStats(): String = js.native
  
  @JSImport("swagger-stats", "stop")
  @js.native
  def stop(): Unit = js.native
  
  @js.native
  trait APIOperationDefinition extends StObject {
    
    var deprecated: Boolean = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var operationId: js.UndefOr[String] = js.native
    
    var summary: js.UndefOr[String] = js.native
    
    var swagger: Boolean = js.native
    
    var tags: js.UndefOr[js.Any] = js.native
  }
  object APIOperationDefinition {
    
    @scala.inline
    def apply(deprecated: Boolean, swagger: Boolean): APIOperationDefinition = {
      val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIOperationDefinition]
    }
    
    @scala.inline
    implicit class APIOperationDefinitionMutableBuilder[Self <: APIOperationDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setSwagger(value: Boolean): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait APIOperationStats extends StObject {
    
    var defs: js.UndefOr[APIOperationDefinition] = js.native
    
    var details: js.UndefOr[APIOperationDefinition] = js.native
    
    var stats: js.UndefOr[APIOperationDefinition] = js.native
  }
  object APIOperationStats {
    
    @scala.inline
    def apply(): APIOperationStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIOperationStats]
    }
    
    @scala.inline
    implicit class APIOperationStatsMutableBuilder[Self <: APIOperationStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefs(value: APIOperationDefinition): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      @scala.inline
      def setDetails(value: APIOperationDefinition): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setStats(value: APIOperationDefinition): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  @js.native
  trait CoreStats extends StObject {
    
    var all: ReqResStats = js.native
    
    var apdexThreshold: Double = js.native
    
    var apidefs: js.UndefOr[Record[String, RecordHTTPMethodAPIOperat]] = js.native
    
    var apiop: js.UndefOr[Record[String, RecordHTTPMethodAPIOperatDELETE]] = js.native
    
    var apistats: js.UndefOr[Record[String, RecordHTTPMethodReqResSta]] = js.native
    
    var egress: ReqResStats = js.native
    
    var errors: js.UndefOr[ErrorsStats] = js.native
    
    var hostname: String = js.native
    
    var ip: String = js.native
    
    var lasterrors: js.UndefOr[js.Array[RequestResponseRecord]] = js.native
    
    var longestreq: js.UndefOr[js.Array[RequestResponseRecord]] = js.native
    
    var method: js.UndefOr[RecordHTTPMethodSubsetReq] = js.native
    
    var name: String = js.native
    
    var startts: Double = js.native
    
    var sys: SysStats = js.native
    
    var timeline: js.UndefOr[TimelineStats] = js.native
    
    var version: String = js.native
  }
  object CoreStats {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CoreStatsMutableBuilder[Self <: CoreStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: ReqResStats): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApdexThreshold(value: Double): Self = StObject.set(x, "apdexThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApidefs(value: Record[String, RecordHTTPMethodAPIOperat]): Self = StObject.set(x, "apidefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApidefsUndefined: Self = StObject.set(x, "apidefs", js.undefined)
      
      @scala.inline
      def setApiop(value: Record[String, RecordHTTPMethodAPIOperatDELETE]): Self = StObject.set(x, "apiop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiopUndefined: Self = StObject.set(x, "apiop", js.undefined)
      
      @scala.inline
      def setApistats(value: Record[String, RecordHTTPMethodReqResSta]): Self = StObject.set(x, "apistats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApistatsUndefined: Self = StObject.set(x, "apistats", js.undefined)
      
      @scala.inline
      def setEgress(value: ReqResStats): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: ErrorsStats): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLasterrors(value: js.Array[RequestResponseRecord]): Self = StObject.set(x, "lasterrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLasterrorsUndefined: Self = StObject.set(x, "lasterrors", js.undefined)
      
      @scala.inline
      def setLasterrorsVarargs(value: RequestResponseRecord*): Self = StObject.set(x, "lasterrors", js.Array(value :_*))
      
      @scala.inline
      def setLongestreq(value: js.Array[RequestResponseRecord]): Self = StObject.set(x, "longestreq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongestreqUndefined: Self = StObject.set(x, "longestreq", js.undefined)
      
      @scala.inline
      def setLongestreqVarargs(value: RequestResponseRecord*): Self = StObject.set(x, "longestreq", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: RecordHTTPMethodSubsetReq): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartts(value: Double): Self = StObject.set(x, "startts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: SysStats): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeline(value: TimelineStats): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorsStats extends StObject {
    
    var statuscode: Record[Double, Double] = js.native
    
    var topnotfound: Record[String, Double] = js.native
    
    var topservererror: Record[String, Double] = js.native
  }
  object ErrorsStats {
    
    @scala.inline
    def apply(
      statuscode: Record[Double, Double],
      topnotfound: Record[String, Double],
      topservererror: Record[String, Double]
    ): ErrorsStats = {
      val __obj = js.Dynamic.literal(statuscode = statuscode.asInstanceOf[js.Any], topnotfound = topnotfound.asInstanceOf[js.Any], topservererror = topservererror.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorsStats]
    }
    
    @scala.inline
    implicit class ErrorsStatsMutableBuilder[Self <: ErrorsStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatuscode(value: Record[Double, Double]): Self = StObject.set(x, "statuscode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopnotfound(value: Record[String, Double]): Self = StObject.set(x, "topnotfound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopservererror(value: Record[String, Double]): Self = StObject.set(x, "topservererror", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def DELETE: typings.swaggerStats.swaggerStatsStrings.DELETE = "DELETE".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.DELETE]
    
    @scala.inline
    def GET: typings.swaggerStats.swaggerStatsStrings.GET = "GET".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.GET]
    
    @scala.inline
    def HEAD: typings.swaggerStats.swaggerStatsStrings.HEAD = "HEAD".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typings.swaggerStats.swaggerStatsStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typings.swaggerStats.swaggerStatsStrings.PATCH = "PATCH".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.PATCH]
    
    @scala.inline
    def POST: typings.swaggerStats.swaggerStatsStrings.POST = "POST".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.POST]
    
    @scala.inline
    def PUT: typings.swaggerStats.swaggerStatsStrings.PUT = "PUT".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.PUT]
    
    @scala.inline
    def TRACE: typings.swaggerStats.swaggerStatsStrings.TRACE = "TRACE".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.TRACE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.swaggerStats.swaggerStatsStrings.GET
    - typings.swaggerStats.swaggerStatsStrings.POST
    - typings.swaggerStats.swaggerStatsStrings.PUT
    - typings.swaggerStats.swaggerStatsStrings.DELETE
  */
  trait HTTPMethodSubset extends StObject
  object HTTPMethodSubset {
    
    @scala.inline
    def DELETE: typings.swaggerStats.swaggerStatsStrings.DELETE = "DELETE".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.DELETE]
    
    @scala.inline
    def GET: typings.swaggerStats.swaggerStatsStrings.GET = "GET".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.GET]
    
    @scala.inline
    def POST: typings.swaggerStats.swaggerStatsStrings.POST = "POST".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.POST]
    
    @scala.inline
    def PUT: typings.swaggerStats.swaggerStatsStrings.PUT = "PUT".asInstanceOf[typings.swaggerStats.swaggerStatsStrings.PUT]
  }
  
  @js.native
  trait ReqResStats extends StObject {
    
    var apdex_satisfied: Double = js.native
    
    var apdex_score: Double = js.native
    
    var apdex_threshold: Double = js.native
    
    var apdex_tolerated: Double = js.native
    
    var avg_req_clength: Double = js.native
    
    var avg_res_clength: Double = js.native
    
    var avg_time: Double = js.native
    
    var client_error: Double = js.native
    
    var err_rate: Double = js.native
    
    var errors: Double = js.native
    
    var info: Double = js.native
    
    var max_req_clength: Double = js.native
    
    var max_res_clength: Double = js.native
    
    var max_time: Double = js.native
    
    var redirect: Double = js.native
    
    var req_rate: Double = js.native
    
    var requests: Double = js.native
    
    var responses: Double = js.native
    
    var server_error: Double = js.native
    
    var success: Double = js.native
    
    var total_req_clength: Double = js.native
    
    var total_res_clength: Double = js.native
    
    var total_time: Double = js.native
  }
  object ReqResStats {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ReqResStatsMutableBuilder[Self <: ReqResStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApdex_satisfied(value: Double): Self = StObject.set(x, "apdex_satisfied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApdex_score(value: Double): Self = StObject.set(x, "apdex_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApdex_threshold(value: Double): Self = StObject.set(x, "apdex_threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApdex_tolerated(value: Double): Self = StObject.set(x, "apdex_tolerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvg_req_clength(value: Double): Self = StObject.set(x, "avg_req_clength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvg_res_clength(value: Double): Self = StObject.set(x, "avg_res_clength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvg_time(value: Double): Self = StObject.set(x, "avg_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_error(value: Double): Self = StObject.set(x, "client_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErr_rate(value: Double): Self = StObject.set(x, "err_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_req_clength(value: Double): Self = StObject.set(x, "max_req_clength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_res_clength(value: Double): Self = StObject.set(x, "max_res_clength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_time(value: Double): Self = StObject.set(x, "max_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect(value: Double): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq_rate(value: Double): Self = StObject.set(x, "req_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequests(value: Double): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponses(value: Double): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer_error(value: Double): Self = StObject.set(x, "server_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_req_clength(value: Double): Self = StObject.set(x, "total_req_clength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_res_clength(value: Double): Self = StObject.set(x, "total_res_clength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_time(value: Double): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestResponseRecord
    extends /* field */ StringDictionary[js.Any] {
    
    var `@timestamp`: String = js.native
    
    var api: Deprecated = js.native
    
    var attrs: js.UndefOr[Record[String, String]] = js.native
    
    var attrsint: js.UndefOr[Record[String, Double]] = js.native
    
    var endts: Double = js.native
    
    var http: Request = js.native
    
    var ip: String = js.native
    
    var method: String = js.native
    
    var node: Hostname = js.native
    
    var path: String = js.native
    
    var port: String = js.native
    
    var query: String = js.native
    
    var real_ip: String = js.native
    
    var responsetime: Double = js.native
    
    var startts: Double = js.native
  }
  object RequestResponseRecord {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RequestResponseRecordMutableBuilder[Self <: RequestResponseRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@timestamp`(value: String): Self = StObject.set(x, "@timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi(value: Deprecated): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setAttrsint(value: Record[String, Double]): Self = StObject.set(x, "attrsint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsintUndefined: Self = StObject.set(x, "attrsint", js.undefined)
      
      @scala.inline
      def setEndts(value: Double): Self = StObject.set(x, "endts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp(value: Request): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Hostname): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReal_ip(value: String): Self = StObject.set(x, "real_ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsetime(value: Double): Self = StObject.set(x, "responsetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartts(value: Double): Self = StObject.set(x, "startts", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  hostname :string,   name :string,   version :string,   ip :string,   swaggerSpec :std.Record<any, any>,   uriPath :string,   timelineBucketDuration :number,   durationBuckets :std.Array<number>,   requestSizeBuckets :std.Array<number>,   responseSizeBuckets :std.Array<number>,   apdexThreshold :number, onResponseFinish (req : node.http.IncomingMessage, res : node.http.ServerResponse, rrr : swagger-stats.swagger-stats.RequestResponseRecord): void,   authentication :boolean, onAuthenticate (req : node.http.IncomingMessage, username : string, password : string): boolean,   sessionMaxAge :number,   elasticsearch :string,   elasticsearchIndexPrefix :string,   elasticsearchUsername :string,   elasticsearchPassword :string,   swaggerOnly :boolean,   metricsPrefix :string,   enableEgress :boolean}> */
  @js.native
  trait SWStats extends StObject {
    
    var apdexThreshold: js.UndefOr[Double] = js.native
    
    var authentication: js.UndefOr[Boolean] = js.native
    
    var durationBuckets: js.UndefOr[js.Array[Double]] = js.native
    
    var elasticsearch: js.UndefOr[String] = js.native
    
    var elasticsearchIndexPrefix: js.UndefOr[String] = js.native
    
    var elasticsearchPassword: js.UndefOr[String] = js.native
    
    var elasticsearchUsername: js.UndefOr[String] = js.native
    
    var enableEgress: js.UndefOr[Boolean] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var ip: js.UndefOr[String] = js.native
    
    var metricsPrefix: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onAuthenticate: js.UndefOr[
        js.Function3[/* req */ IncomingMessage, /* username */ String, /* password */ String, Boolean]
      ] = js.native
    
    var onResponseFinish: js.UndefOr[
        js.Function3[
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          /* rrr */ RequestResponseRecord, 
          Unit
        ]
      ] = js.native
    
    var requestSizeBuckets: js.UndefOr[js.Array[Double]] = js.native
    
    var responseSizeBuckets: js.UndefOr[js.Array[Double]] = js.native
    
    var sessionMaxAge: js.UndefOr[Double] = js.native
    
    var swaggerOnly: js.UndefOr[Boolean] = js.native
    
    var swaggerSpec: js.UndefOr[Record[_, _]] = js.native
    
    var timelineBucketDuration: js.UndefOr[Double] = js.native
    
    var uriPath: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object SWStats {
    
    @scala.inline
    def apply(): SWStats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SWStats]
    }
    
    @scala.inline
    implicit class SWStatsMutableBuilder[Self <: SWStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApdexThreshold(value: Double): Self = StObject.set(x, "apdexThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApdexThresholdUndefined: Self = StObject.set(x, "apdexThreshold", js.undefined)
      
      @scala.inline
      def setAuthentication(value: Boolean): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
      
      @scala.inline
      def setDurationBuckets(value: js.Array[Double]): Self = StObject.set(x, "durationBuckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationBucketsUndefined: Self = StObject.set(x, "durationBuckets", js.undefined)
      
      @scala.inline
      def setDurationBucketsVarargs(value: Double*): Self = StObject.set(x, "durationBuckets", js.Array(value :_*))
      
      @scala.inline
      def setElasticsearch(value: String): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchIndexPrefix(value: String): Self = StObject.set(x, "elasticsearchIndexPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchIndexPrefixUndefined: Self = StObject.set(x, "elasticsearchIndexPrefix", js.undefined)
      
      @scala.inline
      def setElasticsearchPassword(value: String): Self = StObject.set(x, "elasticsearchPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchPasswordUndefined: Self = StObject.set(x, "elasticsearchPassword", js.undefined)
      
      @scala.inline
      def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
      
      @scala.inline
      def setElasticsearchUsername(value: String): Self = StObject.set(x, "elasticsearchUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchUsernameUndefined: Self = StObject.set(x, "elasticsearchUsername", js.undefined)
      
      @scala.inline
      def setEnableEgress(value: Boolean): Self = StObject.set(x, "enableEgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableEgressUndefined: Self = StObject.set(x, "enableEgress", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setMetricsPrefix(value: String): Self = StObject.set(x, "metricsPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsPrefixUndefined: Self = StObject.set(x, "metricsPrefix", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnAuthenticate(value: (/* req */ IncomingMessage, /* username */ String, /* password */ String) => Boolean): Self = StObject.set(x, "onAuthenticate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnAuthenticateUndefined: Self = StObject.set(x, "onAuthenticate", js.undefined)
      
      @scala.inline
      def setOnResponseFinish(
        value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* rrr */ RequestResponseRecord) => Unit
      ): Self = StObject.set(x, "onResponseFinish", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnResponseFinishUndefined: Self = StObject.set(x, "onResponseFinish", js.undefined)
      
      @scala.inline
      def setRequestSizeBuckets(value: js.Array[Double]): Self = StObject.set(x, "requestSizeBuckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestSizeBucketsUndefined: Self = StObject.set(x, "requestSizeBuckets", js.undefined)
      
      @scala.inline
      def setRequestSizeBucketsVarargs(value: Double*): Self = StObject.set(x, "requestSizeBuckets", js.Array(value :_*))
      
      @scala.inline
      def setResponseSizeBuckets(value: js.Array[Double]): Self = StObject.set(x, "responseSizeBuckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseSizeBucketsUndefined: Self = StObject.set(x, "responseSizeBuckets", js.undefined)
      
      @scala.inline
      def setResponseSizeBucketsVarargs(value: Double*): Self = StObject.set(x, "responseSizeBuckets", js.Array(value :_*))
      
      @scala.inline
      def setSessionMaxAge(value: Double): Self = StObject.set(x, "sessionMaxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionMaxAgeUndefined: Self = StObject.set(x, "sessionMaxAge", js.undefined)
      
      @scala.inline
      def setSwaggerOnly(value: Boolean): Self = StObject.set(x, "swaggerOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerOnlyUndefined: Self = StObject.set(x, "swaggerOnly", js.undefined)
      
      @scala.inline
      def setSwaggerSpec(value: Record[_, _]): Self = StObject.set(x, "swaggerSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwaggerSpecUndefined: Self = StObject.set(x, "swaggerSpec", js.undefined)
      
      @scala.inline
      def setTimelineBucketDuration(value: Double): Self = StObject.set(x, "timelineBucketDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelineBucketDurationUndefined: Self = StObject.set(x, "timelineBucketDuration", js.undefined)
      
      @scala.inline
      def setUriPath(value: String): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait SysStats extends StObject {
    
    var cpu: Double = js.native
    
    var external: Double = js.native
    
    var heapTotal: Double = js.native
    
    var heapUsed: Double = js.native
    
    var rss: Double = js.native
  }
  object SysStats {
    
    @scala.inline
    def apply(cpu: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): SysStats = {
      val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
      __obj.asInstanceOf[SysStats]
    }
    
    @scala.inline
    implicit class SysStatsMutableBuilder[Self <: SysStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeapTotal(value: Double): Self = StObject.set(x, "heapTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimelineStats extends StObject {
    
    var data: Record[String, TimelineStatsData] = js.native
    
    var settings: Bucketcurrent = js.native
  }
  object TimelineStats {
    
    @scala.inline
    def apply(data: Record[String, TimelineStatsData], settings: Bucketcurrent): TimelineStats = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineStats]
    }
    
    @scala.inline
    implicit class TimelineStatsMutableBuilder[Self <: TimelineStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Record[String, TimelineStatsData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: Bucketcurrent): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimelineStatsData extends StObject {
    
    var stats: ReqResStats = js.native
    
    var sys: SysStats = js.native
  }
  object TimelineStatsData {
    
    @scala.inline
    def apply(stats: ReqResStats, sys: SysStats): TimelineStatsData = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineStatsData]
    }
    
    @scala.inline
    implicit class TimelineStatsDataMutableBuilder[Self <: TimelineStatsData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStats(value: ReqResStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: SysStats): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}

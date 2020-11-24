package typings.swaggerStats.mod

import typings.std.Record
import typings.swaggerStats.anon.RecordHTTPMethodAPIOperat
import typings.swaggerStats.anon.RecordHTTPMethodAPIOperatDELETE
import typings.swaggerStats.anon.RecordHTTPMethodReqResSta
import typings.swaggerStats.anon.RecordHTTPMethodSubsetReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreStats extends js.Object {
  
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
  implicit class CoreStatsOps[Self <: CoreStats] (val x: Self) extends AnyVal {
    
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
    def setAll(value: ReqResStats): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApdexThreshold(value: Double): Self = this.set("apdexThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgress(value: ReqResStats): Self = this.set("egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartts(value: Double): Self = this.set("startts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: SysStats): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApidefs(value: Record[String, RecordHTTPMethodAPIOperat]): Self = this.set("apidefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApidefs: Self = this.set("apidefs", js.undefined)
    
    @scala.inline
    def setApiop(value: Record[String, RecordHTTPMethodAPIOperatDELETE]): Self = this.set("apiop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiop: Self = this.set("apiop", js.undefined)
    
    @scala.inline
    def setApistats(value: Record[String, RecordHTTPMethodReqResSta]): Self = this.set("apistats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApistats: Self = this.set("apistats", js.undefined)
    
    @scala.inline
    def setErrors(value: ErrorsStats): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setLasterrorsVarargs(value: RequestResponseRecord*): Self = this.set("lasterrors", js.Array(value :_*))
    
    @scala.inline
    def setLasterrors(value: js.Array[RequestResponseRecord]): Self = this.set("lasterrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLasterrors: Self = this.set("lasterrors", js.undefined)
    
    @scala.inline
    def setLongestreqVarargs(value: RequestResponseRecord*): Self = this.set("longestreq", js.Array(value :_*))
    
    @scala.inline
    def setLongestreq(value: js.Array[RequestResponseRecord]): Self = this.set("longestreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongestreq: Self = this.set("longestreq", js.undefined)
    
    @scala.inline
    def setMethod(value: RecordHTTPMethodSubsetReq): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setTimeline(value: TimelineStats): Self = this.set("timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeline: Self = this.set("timeline", js.undefined)
  }
}

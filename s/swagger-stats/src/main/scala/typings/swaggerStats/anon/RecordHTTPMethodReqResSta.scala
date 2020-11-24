package typings.swaggerStats.anon

import typings.swaggerStats.mod.ReqResStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.ReqResStats> */
@js.native
trait RecordHTTPMethodReqResSta extends js.Object {
  
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
  implicit class RecordHTTPMethodReqResStaOps[Self <: RecordHTTPMethodReqResSta] (val x: Self) extends AnyVal {
    
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
    def setDELETE(value: ReqResStats): Self = this.set("DELETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGET(value: ReqResStats): Self = this.set("GET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAD(value: ReqResStats): Self = this.set("HEAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPTIONS(value: ReqResStats): Self = this.set("OPTIONS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPATCH(value: ReqResStats): Self = this.set("PATCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOST(value: ReqResStats): Self = this.set("POST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUT(value: ReqResStats): Self = this.set("PUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRACE(value: ReqResStats): Self = this.set("TRACE", value.asInstanceOf[js.Any])
  }
}

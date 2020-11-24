package typings.swaggerStats.anon

import typings.swaggerStats.mod.APIOperationStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationStats> */
@js.native
trait RecordHTTPMethodAPIOperatDELETE extends js.Object {
  
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
  implicit class RecordHTTPMethodAPIOperatDELETEOps[Self <: RecordHTTPMethodAPIOperatDELETE] (val x: Self) extends AnyVal {
    
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
    def setDELETE(value: APIOperationStats): Self = this.set("DELETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGET(value: APIOperationStats): Self = this.set("GET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAD(value: APIOperationStats): Self = this.set("HEAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPTIONS(value: APIOperationStats): Self = this.set("OPTIONS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPATCH(value: APIOperationStats): Self = this.set("PATCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOST(value: APIOperationStats): Self = this.set("POST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUT(value: APIOperationStats): Self = this.set("PUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRACE(value: APIOperationStats): Self = this.set("TRACE", value.asInstanceOf[js.Any])
  }
}

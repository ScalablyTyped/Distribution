package typings.swaggerStats.anon

import typings.swaggerStats.mod.APIOperationDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationDefinition> */
@js.native
trait RecordHTTPMethodAPIOperat extends js.Object {
  
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
  implicit class RecordHTTPMethodAPIOperatOps[Self <: RecordHTTPMethodAPIOperat] (val x: Self) extends AnyVal {
    
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
    def setDELETE(value: APIOperationDefinition): Self = this.set("DELETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGET(value: APIOperationDefinition): Self = this.set("GET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEAD(value: APIOperationDefinition): Self = this.set("HEAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPTIONS(value: APIOperationDefinition): Self = this.set("OPTIONS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPATCH(value: APIOperationDefinition): Self = this.set("PATCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOST(value: APIOperationDefinition): Self = this.set("POST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUT(value: APIOperationDefinition): Self = this.set("PUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRACE(value: APIOperationDefinition): Self = this.set("TRACE", value.asInstanceOf[js.Any])
  }
}

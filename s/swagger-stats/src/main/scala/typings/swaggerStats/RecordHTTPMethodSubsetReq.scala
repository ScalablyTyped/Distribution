package typings.swaggerStats

import typings.swaggerStats.mod.ReqResStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethodSubset, swagger-stats.swagger-stats.ReqResStats> */
trait RecordHTTPMethodSubsetReq extends js.Object {
  var DELETE: ReqResStats
  var GET: ReqResStats
  var POST: ReqResStats
  var PUT: ReqResStats
}

object RecordHTTPMethodSubsetReq {
  @scala.inline
  def apply(DELETE: ReqResStats, GET: ReqResStats, POST: ReqResStats, PUT: ReqResStats): RecordHTTPMethodSubsetReq = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecordHTTPMethodSubsetReq]
  }
}


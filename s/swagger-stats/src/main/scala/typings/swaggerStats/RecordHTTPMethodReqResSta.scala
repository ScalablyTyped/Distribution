package typings.swaggerStats

import typings.swaggerStats.mod.ReqResStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.ReqResStats> */
trait RecordHTTPMethodReqResSta extends js.Object {
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
}


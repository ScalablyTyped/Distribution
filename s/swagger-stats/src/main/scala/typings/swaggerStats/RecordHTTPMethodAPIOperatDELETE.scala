package typings.swaggerStats

import typings.swaggerStats.mod.APIOperationStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationStats> */
trait RecordHTTPMethodAPIOperatDELETE extends js.Object {
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
}


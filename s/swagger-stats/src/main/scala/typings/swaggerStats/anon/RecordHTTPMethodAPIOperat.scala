package typings.swaggerStats.anon

import typings.swaggerStats.mod.APIOperationDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<swagger-stats.swagger-stats.HTTPMethod, swagger-stats.swagger-stats.APIOperationDefinition> */
trait RecordHTTPMethodAPIOperat extends js.Object {
  var DELETE: APIOperationDefinition
  var GET: APIOperationDefinition
  var HEAD: APIOperationDefinition
  var OPTIONS: APIOperationDefinition
  var PATCH: APIOperationDefinition
  var POST: APIOperationDefinition
  var PUT: APIOperationDefinition
  var TRACE: APIOperationDefinition
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
}


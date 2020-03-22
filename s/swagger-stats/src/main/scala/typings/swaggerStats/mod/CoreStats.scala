package typings.swaggerStats.mod

import typings.std.Record
import typings.swaggerStats.RecordHTTPMethodAPIOperat
import typings.swaggerStats.RecordHTTPMethodAPIOperatDELETE
import typings.swaggerStats.RecordHTTPMethodReqResSta
import typings.swaggerStats.RecordHTTPMethodSubsetReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreStats extends js.Object {
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
    version: String,
    apidefs: Record[String, RecordHTTPMethodAPIOperat] = null,
    apiop: Record[String, RecordHTTPMethodAPIOperatDELETE] = null,
    apistats: Record[String, RecordHTTPMethodReqResSta] = null,
    errors: ErrorsStats = null,
    lasterrors: js.Array[RequestResponseRecord] = null,
    longestreq: js.Array[RequestResponseRecord] = null,
    method: RecordHTTPMethodSubsetReq = null,
    timeline: TimelineStats = null
  ): CoreStats = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], apdexThreshold = apdexThreshold.asInstanceOf[js.Any], egress = egress.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startts = startts.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (apidefs != null) __obj.updateDynamic("apidefs")(apidefs.asInstanceOf[js.Any])
    if (apiop != null) __obj.updateDynamic("apiop")(apiop.asInstanceOf[js.Any])
    if (apistats != null) __obj.updateDynamic("apistats")(apistats.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (lasterrors != null) __obj.updateDynamic("lasterrors")(lasterrors.asInstanceOf[js.Any])
    if (longestreq != null) __obj.updateDynamic("longestreq")(longestreq.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (timeline != null) __obj.updateDynamic("timeline")(timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreStats]
  }
}


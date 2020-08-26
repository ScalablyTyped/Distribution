package typings.swaggerStats.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  hostname :string,   name :string,   version :string,   ip :string,   swaggerSpec :std.Record<any, any>,   uriPath :string,   timelineBucketDuration :number,   durationBuckets :std.Array<number>,   requestSizeBuckets :std.Array<number>,   responseSizeBuckets :std.Array<number>,   apdexThreshold :number, onResponseFinish (req : node.http.IncomingMessage, res : node.http.ServerResponse, rrr : swagger-stats.swagger-stats.RequestResponseRecord): void,   authentication :boolean, onAuthenticate (req : node.http.IncomingMessage, username : string, password : string): boolean,   sessionMaxAge :number,   elasticsearch :string,   elasticsearchIndexPrefix :string,   elasticsearchUsername :string,   elasticsearchPassword :string,   swaggerOnly :boolean,   metricsPrefix :string,   enableEgress :boolean}> */
@js.native
trait SWStats extends js.Object {
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
  implicit class SWStatsOps[Self <: SWStats] (val x: Self) extends AnyVal {
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
    def setApdexThreshold(value: Double): Self = this.set("apdexThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApdexThreshold: Self = this.set("apdexThreshold", js.undefined)
    @scala.inline
    def setAuthentication(value: Boolean): Self = this.set("authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    @scala.inline
    def setDurationBucketsVarargs(value: Double*): Self = this.set("durationBuckets", js.Array(value :_*))
    @scala.inline
    def setDurationBuckets(value: js.Array[Double]): Self = this.set("durationBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationBuckets: Self = this.set("durationBuckets", js.undefined)
    @scala.inline
    def setElasticsearch(value: String): Self = this.set("elasticsearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearch: Self = this.set("elasticsearch", js.undefined)
    @scala.inline
    def setElasticsearchIndexPrefix(value: String): Self = this.set("elasticsearchIndexPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchIndexPrefix: Self = this.set("elasticsearchIndexPrefix", js.undefined)
    @scala.inline
    def setElasticsearchPassword(value: String): Self = this.set("elasticsearchPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchPassword: Self = this.set("elasticsearchPassword", js.undefined)
    @scala.inline
    def setElasticsearchUsername(value: String): Self = this.set("elasticsearchUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchUsername: Self = this.set("elasticsearchUsername", js.undefined)
    @scala.inline
    def setEnableEgress(value: Boolean): Self = this.set("enableEgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableEgress: Self = this.set("enableEgress", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setMetricsPrefix(value: String): Self = this.set("metricsPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricsPrefix: Self = this.set("metricsPrefix", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnAuthenticate(value: (/* req */ IncomingMessage, /* username */ String, /* password */ String) => Boolean): Self = this.set("onAuthenticate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnAuthenticate: Self = this.set("onAuthenticate", js.undefined)
    @scala.inline
    def setOnResponseFinish(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* rrr */ RequestResponseRecord) => Unit
    ): Self = this.set("onResponseFinish", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnResponseFinish: Self = this.set("onResponseFinish", js.undefined)
    @scala.inline
    def setRequestSizeBucketsVarargs(value: Double*): Self = this.set("requestSizeBuckets", js.Array(value :_*))
    @scala.inline
    def setRequestSizeBuckets(value: js.Array[Double]): Self = this.set("requestSizeBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestSizeBuckets: Self = this.set("requestSizeBuckets", js.undefined)
    @scala.inline
    def setResponseSizeBucketsVarargs(value: Double*): Self = this.set("responseSizeBuckets", js.Array(value :_*))
    @scala.inline
    def setResponseSizeBuckets(value: js.Array[Double]): Self = this.set("responseSizeBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseSizeBuckets: Self = this.set("responseSizeBuckets", js.undefined)
    @scala.inline
    def setSessionMaxAge(value: Double): Self = this.set("sessionMaxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionMaxAge: Self = this.set("sessionMaxAge", js.undefined)
    @scala.inline
    def setSwaggerOnly(value: Boolean): Self = this.set("swaggerOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwaggerOnly: Self = this.set("swaggerOnly", js.undefined)
    @scala.inline
    def setSwaggerSpec(value: Record[_, _]): Self = this.set("swaggerSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwaggerSpec: Self = this.set("swaggerSpec", js.undefined)
    @scala.inline
    def setTimelineBucketDuration(value: Double): Self = this.set("timelineBucketDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimelineBucketDuration: Self = this.set("timelineBucketDuration", js.undefined)
    @scala.inline
    def setUriPath(value: String): Self = this.set("uriPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUriPath: Self = this.set("uriPath", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


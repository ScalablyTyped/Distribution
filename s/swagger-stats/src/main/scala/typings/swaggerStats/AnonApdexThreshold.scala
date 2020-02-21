package typings.swaggerStats

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import typings.swaggerStats.mod.RequestResponseRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApdexThreshold extends js.Object {
  /**
    * Apdex Threshold, in milliseconds. In Apdex calculation, request is considered satisfied if it is answered in less then this
    * threshold, and request is tolerating if it's answered in less than threshold * 4.
    * Make sure both threshold and threshold * 4 are buckets in durationBuckets, so Apdex calculation can be done using Prometheus metrics.
    *
    * @default 25
    */
  var apdexThreshold: Double
  /**
    * Enable Basic authentication.
    *
    * @default false
    */
  var authentication: Boolean
  /**
    * Buckets for duration histogram metrics, in Milliseconds.
    * The default buckets are tailored to broadly measure API response time.Most likely needs to be defined per app to account for application specifics.
    *
    * @default [5, 10, 25, 50, 100, 250, 500, 1000, 2500, 5000, 10000]
    */
  var durationBuckets: js.Array[Double]
  /**
    * Elasticsearch URL. If specified, enables storing of request response records in Elasticsearch.
    *
    * @default disabled
    */
  var elasticsearch: String
  /**
    * Elasticsearch index prefix.
    */
  var elasticsearchIndexPrefix: String
  /**
    * Password to authenticate with Elasticsearch.
    */
  var elasticsearchPassword: String
  /**
    * Username to authenticate with Elasticsearch.
    */
  var elasticsearchUsername: String
  /**
    * Enables Egress HTTP monitoring.
    *
    * @default false
    */
  var enableEgress: Boolean
  /**
    * Hostname. Will attempt to detect if not provided.
    */
  var hostname: String
  /**
    * IP Address. Will attempt to detect if not provided.
    */
  var ip: String
  /**
    * Prometheus metrics prefix. Will be prepended to metric name if specified.
    */
  var metricsPrefix: String
  /**
    * Your service name. Defaults to hostname if not specified. Will be returned in stats as specified.
    */
  var name: String
  /**
    * Buckets for request size histogram metric, in Bytes.
    * The default buckets are tailored to broadly measure API request size.Most likely needs to be defined per app to account for application specifics.
    *
    * @default [5, 10, 25, 50, 100, 250, 500, 1000, 2500, 5000, 10000]
    */
  var requestSizeBuckets: js.Array[Double]
  /**
    * Buckets for response size histogram metric, in Bytes.
    * The default buckets are tailored to broadly measure API response size.Most likely needs to be defined per app to account for application specifics.
    *
    * @default [5, 10, 25, 50, 100, 250, 500, 1000, 2500, 5000, 10000]
    */
  var responseSizeBuckets: js.Array[Double]
  /**
    * If authentication is enabled, max age of the session, in seconds.
    *
    * @default 900
    */
  var sessionMaxAge: Double
  /**
    * Set to true to track only requests defined in swagger spec.
    *
    * @default false
    */
  var swaggerOnly: Boolean
  /**
    * Swagger specification object. Should be pre-validated and with resolved references. Optional.
    */
  var swaggerSpec: Record[_, _]
  /**
    * Duration of timeline bucket in milliseconds.
    * Timeline always stores 60 last time buckets, with this option you may adjust timeline granularity and length.
    *
    * @default 60000 (1 min) making timeline 1 hour.
    */
  var timelineBucketDuration: Double
  /**
    * Base path for swagger-stats APIs.
    * If specified, will be used to serve UI, stats and metrics like this:
    * /{uriPath}/ui, /{uriPath}/stats, /{uriPath}/metrics
    *
    * @default /swagger-stats
    */
  var uriPath: String
  /**
    * Your service version. Will be returned in stats as specified.
    */
  var version: String
  /**
    * If authentication is enabled, callback to authenticate request to /swagger-stats/stats and /swagger-stats/metrics.
    * Application must implement onAuthenticate to validate user credentials.
    * The following parameters are passed to this callback:
    * onAuthenticate(req,username,password)
    * - req - request
    * - username - username
    * - password - password
    * Must return true if user authenticated, false if not.
    */
  def onAuthenticate(req: IncomingMessage, username: String, password: String): Boolean
  /**
    * Callback to invoke when response is finished.
    * Application may implement it to trace Request Response Record (RRR), which is passed as parameter.
    * The following parameters are passed to this callback:
    * onResponseFinish(req,res,rrr)
    * - req - request
    * - res - response
    * - rrr - Request Response Record (RRR)
    */
  def onResponseFinish(req: IncomingMessage, res: ServerResponse, rrr: RequestResponseRecord): Unit
}

object AnonApdexThreshold {
  @scala.inline
  def apply(
    apdexThreshold: Double,
    authentication: Boolean,
    durationBuckets: js.Array[Double],
    elasticsearch: String,
    elasticsearchIndexPrefix: String,
    elasticsearchPassword: String,
    elasticsearchUsername: String,
    enableEgress: Boolean,
    hostname: String,
    ip: String,
    metricsPrefix: String,
    name: String,
    onAuthenticate: (IncomingMessage, String, String) => Boolean,
    onResponseFinish: (IncomingMessage, ServerResponse, RequestResponseRecord) => Unit,
    requestSizeBuckets: js.Array[Double],
    responseSizeBuckets: js.Array[Double],
    sessionMaxAge: Double,
    swaggerOnly: Boolean,
    swaggerSpec: Record[_, _],
    timelineBucketDuration: Double,
    uriPath: String,
    version: String
  ): AnonApdexThreshold = {
    val __obj = js.Dynamic.literal(apdexThreshold = apdexThreshold.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], durationBuckets = durationBuckets.asInstanceOf[js.Any], elasticsearch = elasticsearch.asInstanceOf[js.Any], elasticsearchIndexPrefix = elasticsearchIndexPrefix.asInstanceOf[js.Any], elasticsearchPassword = elasticsearchPassword.asInstanceOf[js.Any], elasticsearchUsername = elasticsearchUsername.asInstanceOf[js.Any], enableEgress = enableEgress.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], metricsPrefix = metricsPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onAuthenticate = js.Any.fromFunction3(onAuthenticate), onResponseFinish = js.Any.fromFunction3(onResponseFinish), requestSizeBuckets = requestSizeBuckets.asInstanceOf[js.Any], responseSizeBuckets = responseSizeBuckets.asInstanceOf[js.Any], sessionMaxAge = sessionMaxAge.asInstanceOf[js.Any], swaggerOnly = swaggerOnly.asInstanceOf[js.Any], swaggerSpec = swaggerSpec.asInstanceOf[js.Any], timelineBucketDuration = timelineBucketDuration.asInstanceOf[js.Any], uriPath = uriPath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApdexThreshold]
  }
}


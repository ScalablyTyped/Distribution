package typings.webpagetest.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsOptions extends js.Object {
  /** include the breakdown of requests and bytes by mime type */
  var breakDown: js.UndefOr[Boolean] = js.undefined
  /** include the breakdown of requests and bytes by domain */
  var domains: js.UndefOr[Boolean] = js.undefined
  /** set the metric used to calculate median for multiple runs tests (default: loadTime) */
  var medianMetric: js.UndefOr[String] = js.undefined
  /** include the PageSpeed score in the response (may be slower) */
  var pageSpeed: js.UndefOr[Boolean] = js.undefined
  /** set performance test suite reporter output: [dot]|spec|tap|xunit|list|progress|min|nyan|landing|json|doc|markdown|teamcity */
  var reporter: js.UndefOr[String] = js.undefined
  /** include the request data in the response (slower and results in much larger responses) */
  var requests: js.UndefOr[Boolean] = js.undefined
  /** set the specs for performance test suite */
  var specs: js.UndefOr[String] = js.undefined
}

object ResultsOptions {
  @scala.inline
  def apply(
    breakDown: js.UndefOr[Boolean] = js.undefined,
    domains: js.UndefOr[Boolean] = js.undefined,
    medianMetric: String = null,
    pageSpeed: js.UndefOr[Boolean] = js.undefined,
    reporter: String = null,
    requests: js.UndefOr[Boolean] = js.undefined,
    specs: String = null
  ): ResultsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakDown)) __obj.updateDynamic("breakDown")(breakDown)
    if (!js.isUndefined(domains)) __obj.updateDynamic("domains")(domains)
    if (medianMetric != null) __obj.updateDynamic("medianMetric")(medianMetric)
    if (!js.isUndefined(pageSpeed)) __obj.updateDynamic("pageSpeed")(pageSpeed)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (!js.isUndefined(requests)) __obj.updateDynamic("requests")(requests)
    if (specs != null) __obj.updateDynamic("specs")(specs)
    __obj.asInstanceOf[ResultsOptions]
  }
}


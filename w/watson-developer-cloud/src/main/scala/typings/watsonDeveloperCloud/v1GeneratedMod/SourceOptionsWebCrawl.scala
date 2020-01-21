package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object defining which URL to crawl and how to crawl it. */
trait SourceOptionsWebCrawl extends js.Object {
  /** When `true`, allows the crawl to interact with HTTPS sites with SSL certificates with untrusted signers. */
  var allow_untrusted_certificate: js.UndefOr[Boolean] = js.undefined
  /** The number of concurrent URLs to fetch. `gentle` means one URL is fetched at a time with a delay between each call. `normal` means as many as two URLs are fectched concurrently with a short delay between fetch calls. `aggressive` means that up to ten URLs are fetched concurrently with a short delay between fetch calls. */
  var crawl_speed: js.UndefOr[String] = js.undefined
  /** When `true`, crawls of the specified URL are limited to the host part of the **url** field. */
  var limit_to_starting_hosts: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of hops to make from the initial URL. When a page is crawled each link on that page will also be crawled if it is within the **maximum_hops** from the initial URL. The first page crawled is 0 hops, each link crawled from the first page is 1 hop, each link crawled from those pages is 2 hops, and so on. */
  var maximum_hops: js.UndefOr[Double] = js.undefined
  /** When `true`, the crawler will ignore any `robots.txt` encountered by the crawler. This should only ever be done when crawling a web site the user owns. This must be be set to `true` when a **gateway_id** is specied in the **credentials**. */
  var override_robots_txt: js.UndefOr[Boolean] = js.undefined
  /** The maximum milliseconds to wait for a response from the web server. */
  var request_timeout: js.UndefOr[Double] = js.undefined
  /** The starting URL to crawl. */
  var url: String
}

object SourceOptionsWebCrawl {
  @scala.inline
  def apply(
    url: String,
    allow_untrusted_certificate: js.UndefOr[Boolean] = js.undefined,
    crawl_speed: String = null,
    limit_to_starting_hosts: js.UndefOr[Boolean] = js.undefined,
    maximum_hops: Int | Double = null,
    override_robots_txt: js.UndefOr[Boolean] = js.undefined,
    request_timeout: Int | Double = null
  ): SourceOptionsWebCrawl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_untrusted_certificate)) __obj.updateDynamic("allow_untrusted_certificate")(allow_untrusted_certificate.asInstanceOf[js.Any])
    if (crawl_speed != null) __obj.updateDynamic("crawl_speed")(crawl_speed.asInstanceOf[js.Any])
    if (!js.isUndefined(limit_to_starting_hosts)) __obj.updateDynamic("limit_to_starting_hosts")(limit_to_starting_hosts.asInstanceOf[js.Any])
    if (maximum_hops != null) __obj.updateDynamic("maximum_hops")(maximum_hops.asInstanceOf[js.Any])
    if (!js.isUndefined(override_robots_txt)) __obj.updateDynamic("override_robots_txt")(override_robots_txt.asInstanceOf[js.Any])
    if (request_timeout != null) __obj.updateDynamic("request_timeout")(request_timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsWebCrawl]
  }
}


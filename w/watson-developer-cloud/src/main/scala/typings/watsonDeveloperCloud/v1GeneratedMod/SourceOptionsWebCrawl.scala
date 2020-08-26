package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object defining which URL to crawl and how to crawl it. */
@js.native
trait SourceOptionsWebCrawl extends js.Object {
  /** When `true`, allows the crawl to interact with HTTPS sites with SSL certificates with untrusted signers. */
  var allow_untrusted_certificate: js.UndefOr[Boolean] = js.native
  /** The number of concurrent URLs to fetch. `gentle` means one URL is fetched at a time with a delay between each call. `normal` means as many as two URLs are fectched concurrently with a short delay between fetch calls. `aggressive` means that up to ten URLs are fetched concurrently with a short delay between fetch calls. */
  var crawl_speed: js.UndefOr[String] = js.native
  /** When `true`, crawls of the specified URL are limited to the host part of the **url** field. */
  var limit_to_starting_hosts: js.UndefOr[Boolean] = js.native
  /** The maximum number of hops to make from the initial URL. When a page is crawled each link on that page will also be crawled if it is within the **maximum_hops** from the initial URL. The first page crawled is 0 hops, each link crawled from the first page is 1 hop, each link crawled from those pages is 2 hops, and so on. */
  var maximum_hops: js.UndefOr[Double] = js.native
  /** When `true`, the crawler will ignore any `robots.txt` encountered by the crawler. This should only ever be done when crawling a web site the user owns. This must be be set to `true` when a **gateway_id** is specied in the **credentials**. */
  var override_robots_txt: js.UndefOr[Boolean] = js.native
  /** The maximum milliseconds to wait for a response from the web server. */
  var request_timeout: js.UndefOr[Double] = js.native
  /** The starting URL to crawl. */
  var url: String = js.native
}

object SourceOptionsWebCrawl {
  @scala.inline
  def apply(url: String): SourceOptionsWebCrawl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsWebCrawl]
  }
  @scala.inline
  implicit class SourceOptionsWebCrawlOps[Self <: SourceOptionsWebCrawl] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllow_untrusted_certificate(value: Boolean): Self = this.set("allow_untrusted_certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_untrusted_certificate: Self = this.set("allow_untrusted_certificate", js.undefined)
    @scala.inline
    def setCrawl_speed(value: String): Self = this.set("crawl_speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawl_speed: Self = this.set("crawl_speed", js.undefined)
    @scala.inline
    def setLimit_to_starting_hosts(value: Boolean): Self = this.set("limit_to_starting_hosts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_to_starting_hosts: Self = this.set("limit_to_starting_hosts", js.undefined)
    @scala.inline
    def setMaximum_hops(value: Double): Self = this.set("maximum_hops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum_hops: Self = this.set("maximum_hops", js.undefined)
    @scala.inline
    def setOverride_robots_txt(value: Boolean): Self = this.set("override_robots_txt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride_robots_txt: Self = this.set("override_robots_txt", js.undefined)
    @scala.inline
    def setRequest_timeout(value: Double): Self = this.set("request_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_timeout: Self = this.set("request_timeout", js.undefined)
  }
  
}


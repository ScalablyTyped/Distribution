package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object defining which URL to crawl and how to crawl it. */
trait SourceOptionsWebCrawl extends StObject {
  
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
  
  inline def apply(url: String): SourceOptionsWebCrawl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsWebCrawl]
  }
  
  extension [Self <: SourceOptionsWebCrawl](x: Self) {
    
    inline def setAllow_untrusted_certificate(value: Boolean): Self = StObject.set(x, "allow_untrusted_certificate", value.asInstanceOf[js.Any])
    
    inline def setAllow_untrusted_certificateUndefined: Self = StObject.set(x, "allow_untrusted_certificate", js.undefined)
    
    inline def setCrawl_speed(value: String): Self = StObject.set(x, "crawl_speed", value.asInstanceOf[js.Any])
    
    inline def setCrawl_speedUndefined: Self = StObject.set(x, "crawl_speed", js.undefined)
    
    inline def setLimit_to_starting_hosts(value: Boolean): Self = StObject.set(x, "limit_to_starting_hosts", value.asInstanceOf[js.Any])
    
    inline def setLimit_to_starting_hostsUndefined: Self = StObject.set(x, "limit_to_starting_hosts", js.undefined)
    
    inline def setMaximum_hops(value: Double): Self = StObject.set(x, "maximum_hops", value.asInstanceOf[js.Any])
    
    inline def setMaximum_hopsUndefined: Self = StObject.set(x, "maximum_hops", js.undefined)
    
    inline def setOverride_robots_txt(value: Boolean): Self = StObject.set(x, "override_robots_txt", value.asInstanceOf[js.Any])
    
    inline def setOverride_robots_txtUndefined: Self = StObject.set(x, "override_robots_txt", js.undefined)
    
    inline def setRequest_timeout(value: Double): Self = StObject.set(x, "request_timeout", value.asInstanceOf[js.Any])
    
    inline def setRequest_timeoutUndefined: Self = StObject.set(x, "request_timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

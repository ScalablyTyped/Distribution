package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultsOptions extends js.Object {
  
  /** include the breakdown of requests and bytes by mime type */
  var breakDown: js.UndefOr[Boolean] = js.native
  
  /** include the breakdown of requests and bytes by domain */
  var domains: js.UndefOr[Boolean] = js.native
  
  /** set the metric used to calculate median for multiple runs tests (default: loadTime) */
  var medianMetric: js.UndefOr[String] = js.native
  
  /** include the PageSpeed score in the response (may be slower) */
  var pageSpeed: js.UndefOr[Boolean] = js.native
  
  /** set performance test suite reporter output: [dot]|spec|tap|xunit|list|progress|min|nyan|landing|json|doc|markdown|teamcity */
  var reporter: js.UndefOr[String] = js.native
  
  /** include the request data in the response (slower and results in much larger responses) */
  var requests: js.UndefOr[Boolean] = js.native
  
  /** set the specs for performance test suite */
  var specs: js.UndefOr[String] = js.native
}
object ResultsOptions {
  
  @scala.inline
  def apply(): ResultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultsOptions]
  }
  
  @scala.inline
  implicit class ResultsOptionsOps[Self <: ResultsOptions] (val x: Self) extends AnyVal {
    
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
    def setBreakDown(value: Boolean): Self = this.set("breakDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakDown: Self = this.set("breakDown", js.undefined)
    
    @scala.inline
    def setDomains(value: Boolean): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    
    @scala.inline
    def setMedianMetric(value: String): Self = this.set("medianMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedianMetric: Self = this.set("medianMetric", js.undefined)
    
    @scala.inline
    def setPageSpeed(value: Boolean): Self = this.set("pageSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSpeed: Self = this.set("pageSpeed", js.undefined)
    
    @scala.inline
    def setReporter(value: String): Self = this.set("reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    
    @scala.inline
    def setRequests(value: Boolean): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    
    @scala.inline
    def setSpecs(value: String): Self = this.set("specs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecs: Self = this.set("specs", js.undefined)
  }
}

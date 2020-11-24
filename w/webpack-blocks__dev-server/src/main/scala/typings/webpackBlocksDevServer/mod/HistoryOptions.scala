package typings.webpackBlocksDevServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryOptions extends js.Object {
  
  var disableDotRule: js.UndefOr[Boolean] = js.native
  
  var htmlAcceptHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var rewrites: js.UndefOr[RewritesObject] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object HistoryOptions {
  
  @scala.inline
  def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  
  @scala.inline
  implicit class HistoryOptionsOps[Self <: HistoryOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableDotRule(value: Boolean): Self = this.set("disableDotRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDotRule: Self = this.set("disableDotRule", js.undefined)
    
    @scala.inline
    def setHtmlAcceptHeadersVarargs(value: String*): Self = this.set("htmlAcceptHeaders", js.Array(value :_*))
    
    @scala.inline
    def setHtmlAcceptHeaders(value: js.Array[String]): Self = this.set("htmlAcceptHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAcceptHeaders: Self = this.set("htmlAcceptHeaders", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setRewrites(value: RewritesObject): Self = this.set("rewrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewrites: Self = this.set("rewrites", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}

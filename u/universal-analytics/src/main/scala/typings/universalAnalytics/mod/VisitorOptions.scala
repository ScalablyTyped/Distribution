package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisitorOptions extends js.Object {
  
  var batchSize: js.UndefOr[Double] = js.native
  
  /**
    * Client ID
    */
  var cid: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var enableBatching: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var requestOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var strictCidFormat: js.UndefOr[Boolean] = js.native
  
  /**
    * Tracking ID
    */
  var tid: js.UndefOr[String] = js.native
  
  /**
    * User ID
    */
  var uid: js.UndefOr[String] = js.native
}
object VisitorOptions {
  
  @scala.inline
  def apply(): VisitorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitorOptions]
  }
  
  @scala.inline
  implicit class VisitorOptionsOps[Self <: VisitorOptions] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setEnableBatching(value: Boolean): Self = this.set("enableBatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBatching: Self = this.set("enableBatching", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: StringDictionary[js.Any]): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    
    @scala.inline
    def setStrictCidFormat(value: Boolean): Self = this.set("strictCidFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictCidFormat: Self = this.set("strictCidFormat", js.undefined)
    
    @scala.inline
    def setTid(value: String): Self = this.set("tid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTid: Self = this.set("tid", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
}

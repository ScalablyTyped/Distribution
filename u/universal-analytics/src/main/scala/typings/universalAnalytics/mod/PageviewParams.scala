package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageviewParams
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Document Host Name
    *
    * Specifies the hostname from which content was hosted.
    *
    * Max length: 100 Bytes
    */
  var dh: js.UndefOr[String] = js.native
  
  /**
    * Document location URL
    *
    * Use this parameter to send the full URL (document location) of the page on which content resides.
    *
    * Max length: 2048 Bytes
    */
  var dl: js.UndefOr[String] = js.native
  
  /**
    * Document Path
    *
    * The path portion of the page URL. Should begin with '/'.
    *
    * Max length: 2048 Bytes
    */
  var dp: js.UndefOr[String] = js.native
  
  /**
    * Document Title
    *
    * The title of the page / document.
    *
    * Max length: 1500 Bytes
    */
  var dt: js.UndefOr[String] = js.native
}
object PageviewParams {
  
  @scala.inline
  def apply(): PageviewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageviewParams]
  }
  
  @scala.inline
  implicit class PageviewParamsOps[Self <: PageviewParams] (val x: Self) extends AnyVal {
    
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
    def setDh(value: String): Self = this.set("dh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDh: Self = this.set("dh", js.undefined)
    
    @scala.inline
    def setDl(value: String): Self = this.set("dl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDl: Self = this.set("dl", js.undefined)
    
    @scala.inline
    def setDp(value: String): Self = this.set("dp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDp: Self = this.set("dp", js.undefined)
    
    @scala.inline
    def setDt(value: String): Self = this.set("dt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDt: Self = this.set("dt", js.undefined)
  }
}

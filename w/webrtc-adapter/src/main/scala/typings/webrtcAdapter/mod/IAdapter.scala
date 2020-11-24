package typings.webrtcAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAdapter extends js.Object {
  
  var browserDetails: IBrowserDetails = js.native
  
  var browserShim: js.UndefOr[IChromeShim | IEdgeShim | IFirefoxShim | ISafariShim] = js.native
  
  var commonShim: ICommonShim = js.native
  
  def disableLog(disable: Boolean): Unit = js.native
  
  def disableWarnings(disable: Boolean): Unit = js.native
  
  def extractVersion(uastring: String, expr: String, pos: Double): Double = js.native
}
object IAdapter {
  
  @scala.inline
  def apply(
    browserDetails: IBrowserDetails,
    commonShim: ICommonShim,
    disableLog: Boolean => Unit,
    disableWarnings: Boolean => Unit,
    extractVersion: (String, String, Double) => Double
  ): IAdapter = {
    val __obj = js.Dynamic.literal(browserDetails = browserDetails.asInstanceOf[js.Any], commonShim = commonShim.asInstanceOf[js.Any], disableLog = js.Any.fromFunction1(disableLog), disableWarnings = js.Any.fromFunction1(disableWarnings), extractVersion = js.Any.fromFunction3(extractVersion))
    __obj.asInstanceOf[IAdapter]
  }
  
  @scala.inline
  implicit class IAdapterOps[Self <: IAdapter] (val x: Self) extends AnyVal {
    
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
    def setBrowserDetails(value: IBrowserDetails): Self = this.set("browserDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonShim(value: ICommonShim): Self = this.set("commonShim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLog(value: Boolean => Unit): Self = this.set("disableLog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableWarnings(value: Boolean => Unit): Self = this.set("disableWarnings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtractVersion(value: (String, String, Double) => Double): Self = this.set("extractVersion", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBrowserShim(value: IChromeShim | IEdgeShim | IFirefoxShim | ISafariShim): Self = this.set("browserShim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserShim: Self = this.set("browserShim", js.undefined)
  }
}

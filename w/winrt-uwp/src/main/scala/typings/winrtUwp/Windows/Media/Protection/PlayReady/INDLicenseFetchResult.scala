package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the result of the PlayReady-ND license fetch. */
@js.native
trait INDLicenseFetchResult extends js.Object {
  
  /** Gets the custom data from a license fetch response. */
  var responseCustomData: INDCustomData = js.native
}
object INDLicenseFetchResult {
  
  @scala.inline
  def apply(responseCustomData: INDCustomData): INDLicenseFetchResult = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDLicenseFetchResult]
  }
  
  @scala.inline
  implicit class INDLicenseFetchResultOps[Self <: INDLicenseFetchResult] (val x: Self) extends AnyVal {
    
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
    def setResponseCustomData(value: INDCustomData): Self = this.set("responseCustomData", value.asInstanceOf[js.Any])
  }
}

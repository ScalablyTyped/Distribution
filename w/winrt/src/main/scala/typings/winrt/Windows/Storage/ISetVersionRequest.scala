package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetVersionRequest extends js.Object {
  
  var currentVersion: Double = js.native
  
  var desiredVersion: Double = js.native
  
  def getDeferral(): SetVersionDeferral = js.native
}
object ISetVersionRequest {
  
  @scala.inline
  def apply(currentVersion: Double, desiredVersion: Double, getDeferral: () => SetVersionDeferral): ISetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ISetVersionRequest]
  }
  
  @scala.inline
  implicit class ISetVersionRequestOps[Self <: ISetVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setCurrentVersion(value: Double): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredVersion(value: Double): Self = this.set("desiredVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => SetVersionDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
}

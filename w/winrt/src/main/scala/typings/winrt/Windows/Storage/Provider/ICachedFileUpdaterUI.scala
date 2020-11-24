package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICachedFileUpdaterUI extends js.Object {
  
  var onfileupdaterequested: js.Any = js.native
  
  var onuirequested: js.Any = js.native
  
  var title: String = js.native
  
  var uIStatus: UIStatus = js.native
  
  var updateTarget: CachedFileTarget = js.native
}
object ICachedFileUpdaterUI {
  
  @scala.inline
  def apply(
    onfileupdaterequested: js.Any,
    onuirequested: js.Any,
    title: String,
    uIStatus: UIStatus,
    updateTarget: CachedFileTarget
  ): ICachedFileUpdaterUI = {
    val __obj = js.Dynamic.literal(onfileupdaterequested = onfileupdaterequested.asInstanceOf[js.Any], onuirequested = onuirequested.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uIStatus = uIStatus.asInstanceOf[js.Any], updateTarget = updateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICachedFileUpdaterUI]
  }
  
  @scala.inline
  implicit class ICachedFileUpdaterUIOps[Self <: ICachedFileUpdaterUI] (val x: Self) extends AnyVal {
    
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
    def setOnfileupdaterequested(value: js.Any): Self = this.set("onfileupdaterequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnuirequested(value: js.Any): Self = this.set("onuirequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIStatus(value: UIStatus): Self = this.set("uIStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTarget(value: CachedFileTarget): Self = this.set("updateTarget", value.asInstanceOf[js.Any])
  }
}

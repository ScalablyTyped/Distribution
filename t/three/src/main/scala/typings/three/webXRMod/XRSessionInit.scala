package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRSessionInit extends js.Object {
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.native
  
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.native
}
object XRSessionInit {
  
  @scala.inline
  def apply(): XRSessionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRSessionInit]
  }
  
  @scala.inline
  implicit class XRSessionInitOps[Self <: XRSessionInit] (val x: Self) extends AnyVal {
    
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
    def setOptionalFeaturesVarargs(value: String*): Self = this.set("optionalFeatures", js.Array(value :_*))
    
    @scala.inline
    def setOptionalFeatures(value: js.Array[String]): Self = this.set("optionalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalFeatures: Self = this.set("optionalFeatures", js.undefined)
    
    @scala.inline
    def setRequiredFeaturesVarargs(value: String*): Self = this.set("requiredFeatures", js.Array(value :_*))
    
    @scala.inline
    def setRequiredFeatures(value: js.Array[String]): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFeatures: Self = this.set("requiredFeatures", js.undefined)
  }
}

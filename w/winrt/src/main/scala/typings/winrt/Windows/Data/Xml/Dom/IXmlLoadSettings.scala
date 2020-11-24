package typings.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlLoadSettings extends js.Object {
  
  var elementContentWhiteSpace: Boolean = js.native
  
  var maxElementDepth: Double = js.native
  
  var prohibitDtd: Boolean = js.native
  
  var resolveExternals: Boolean = js.native
  
  var validateOnParse: Boolean = js.native
}
object IXmlLoadSettings {
  
  @scala.inline
  def apply(
    elementContentWhiteSpace: Boolean,
    maxElementDepth: Double,
    prohibitDtd: Boolean,
    resolveExternals: Boolean,
    validateOnParse: Boolean
  ): IXmlLoadSettings = {
    val __obj = js.Dynamic.literal(elementContentWhiteSpace = elementContentWhiteSpace.asInstanceOf[js.Any], maxElementDepth = maxElementDepth.asInstanceOf[js.Any], prohibitDtd = prohibitDtd.asInstanceOf[js.Any], resolveExternals = resolveExternals.asInstanceOf[js.Any], validateOnParse = validateOnParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlLoadSettings]
  }
  
  @scala.inline
  implicit class IXmlLoadSettingsOps[Self <: IXmlLoadSettings] (val x: Self) extends AnyVal {
    
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
    def setElementContentWhiteSpace(value: Boolean): Self = this.set("elementContentWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxElementDepth(value: Double): Self = this.set("maxElementDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProhibitDtd(value: Boolean): Self = this.set("prohibitDtd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveExternals(value: Boolean): Self = this.set("resolveExternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnParse(value: Boolean): Self = this.set("validateOnParse", value.asInstanceOf[js.Any])
  }
}

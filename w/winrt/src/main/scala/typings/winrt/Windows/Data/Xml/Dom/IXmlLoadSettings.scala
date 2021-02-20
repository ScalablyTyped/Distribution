package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlLoadSettings extends StObject {
  
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
  implicit class IXmlLoadSettingsMutableBuilder[Self <: IXmlLoadSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementContentWhiteSpace(value: Boolean): Self = StObject.set(x, "elementContentWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxElementDepth(value: Double): Self = StObject.set(x, "maxElementDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProhibitDtd(value: Boolean): Self = StObject.set(x, "prohibitDtd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveExternals(value: Boolean): Self = StObject.set(x, "resolveExternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnParse(value: Boolean): Self = StObject.set(x, "validateOnParse", value.asInstanceOf[js.Any])
  }
}

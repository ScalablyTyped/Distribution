package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlLoadSettings
  extends StObject
     with IXmlLoadSettings
object XmlLoadSettings {
  
  inline def apply(
    elementContentWhiteSpace: Boolean,
    maxElementDepth: Double,
    prohibitDtd: Boolean,
    resolveExternals: Boolean,
    validateOnParse: Boolean
  ): XmlLoadSettings = {
    val __obj = js.Dynamic.literal(elementContentWhiteSpace = elementContentWhiteSpace.asInstanceOf[js.Any], maxElementDepth = maxElementDepth.asInstanceOf[js.Any], prohibitDtd = prohibitDtd.asInstanceOf[js.Any], resolveExternals = resolveExternals.asInstanceOf[js.Any], validateOnParse = validateOnParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlLoadSettings]
  }
}

package typings.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlLoadSettings extends js.Object {
  var elementContentWhiteSpace: Boolean
  var maxElementDepth: Double
  var prohibitDtd: Boolean
  var resolveExternals: Boolean
  var validateOnParse: Boolean
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
    val __obj = js.Dynamic.literal(elementContentWhiteSpace = elementContentWhiteSpace, maxElementDepth = maxElementDepth, prohibitDtd = prohibitDtd, resolveExternals = resolveExternals, validateOnParse = validateOnParse)
  
    __obj.asInstanceOf[IXmlLoadSettings]
  }
}


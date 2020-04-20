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
    val __obj = js.Dynamic.literal(elementContentWhiteSpace = elementContentWhiteSpace.asInstanceOf[js.Any], maxElementDepth = maxElementDepth.asInstanceOf[js.Any], prohibitDtd = prohibitDtd.asInstanceOf[js.Any], resolveExternals = resolveExternals.asInstanceOf[js.Any], validateOnParse = validateOnParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlLoadSettings]
  }
}


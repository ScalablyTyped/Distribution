package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlLoadSettings extends js.Object {
  var elementContentWhiteSpace: scala.Boolean
  var maxElementDepth: scala.Double
  var prohibitDtd: scala.Boolean
  var resolveExternals: scala.Boolean
  var validateOnParse: scala.Boolean
}

object IXmlLoadSettings {
  @scala.inline
  def apply(
    elementContentWhiteSpace: scala.Boolean,
    maxElementDepth: scala.Double,
    prohibitDtd: scala.Boolean,
    resolveExternals: scala.Boolean,
    validateOnParse: scala.Boolean
  ): IXmlLoadSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("elementContentWhiteSpace")(elementContentWhiteSpace)
    __obj.updateDynamic("maxElementDepth")(maxElementDepth)
    __obj.updateDynamic("prohibitDtd")(prohibitDtd)
    __obj.updateDynamic("resolveExternals")(resolveExternals)
    __obj.updateDynamic("validateOnParse")(validateOnParse)
    __obj.asInstanceOf[IXmlLoadSettings]
  }
}


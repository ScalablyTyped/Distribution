package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionsPolicyId extends js.Object {
  var hash: stdLib.AlgorithmIdentifier
  var identifier: OptionsPolicyIdentifier
  var qualifiers: js.UndefOr[js.Array[OptionsPolicyUserNotice | java.lang.String]] = js.undefined
  var transforms: js.UndefOr[js.Array[xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.OptionsSignTransform]] = js.undefined
}


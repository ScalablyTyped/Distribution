package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object XmlDSigJsNs {
  type BASE64 = java.lang.String
  type DataObjects = XmlSignatureCollection[DataObject]
  type DigestAlgorithm = xmldsigjsLib.xmldsigjsLibStrings.`SHA-1` | xmldsigjsLib.xmldsigjsLibStrings.`SHA-256` | xmldsigjsLib.xmldsigjsLibStrings.`SHA-384` | xmldsigjsLib.xmldsigjsLibStrings.`SHA-512`
  type NamedCurveType = java.lang.String | xmldsigjsLib.xmldsigjsLibStrings.`P-256` | xmldsigjsLib.xmldsigjsLibStrings.`P-384` | xmldsigjsLib.xmldsigjsLibStrings.`P-521`
  type OptionsSignTransform = xmldsigjsLib.xmldsigjsLibStrings.enveloped | xmldsigjsLib.xmldsigjsLibStrings.c14n | xmldsigjsLib.xmldsigjsLibStrings.`exc-c14n` | xmldsigjsLib.xmldsigjsLibStrings.`c14n-com` | xmldsigjsLib.xmldsigjsLibStrings.`exc-c14n-com` | xmldsigjsLib.xmldsigjsLibStrings.base64
  type References = XmlSignatureCollection[Reference]
  type RsaPssSha1 = RsaPssBase
  type RsaPssSha256 = RsaPssBase
  type RsaPssSha384 = RsaPssBase
  type RsaPssSha512 = RsaPssBase
  type XmlSignatureCollection[I /* <: XmlSignatureObject */] = xmlDashCoreLib.xmlDashCoreMod.XmlCollection[I]
  type XmlSignatureObject = xmlDashCoreLib.xmlDashCoreMod.XmlObject
}

package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object XmlDSigJsNs {
  type BASE64 = java.lang.String
  type DataObjects = XmlSignatureCollection[DataObject]
  type NamedCurveType = _NamedCurveType | java.lang.String
  type References = XmlSignatureCollection[Reference]
  type RsaPssSha1 = RsaPssBase
  type RsaPssSha256 = RsaPssBase
  type RsaPssSha384 = RsaPssBase
  type RsaPssSha512 = RsaPssBase
  type XmlSignatureCollection[I /* <: XmlSignatureObject */] = xmlDashCoreLib.xmlDashCoreMod.XmlCollection[I]
  type XmlSignatureObject = xmlDashCoreLib.xmlDashCoreMod.XmlObject
}

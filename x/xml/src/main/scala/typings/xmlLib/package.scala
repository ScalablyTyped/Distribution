package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlLib {
  type XmlAtom = java.lang.String | scala.Double | scala.Boolean
  type XmlDesc = Anon_Attr | Anon_Cdata | Anon_CdataAttr | XmlAtom | js.Array[XmlAtom] | js.Any
  type XmlObject = (org.scalablytyped.runtime.StringDictionary[js.Any | XmlDesc]) | XmlDesc
}

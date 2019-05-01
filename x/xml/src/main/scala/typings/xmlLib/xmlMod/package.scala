package typings
package xmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlMod {
  type XmlAtom = java.lang.String | scala.Double | scala.Boolean
  type XmlAttrs = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - xmlLib.Anon_Attr
    - xmlLib.Anon_Cdata
    - xmlLib.Anon_AttrCdata
    - XmlAtom
    - js.Array[XmlAtom]
    - XmlDescArray
  */
  type XmlDesc = _XmlDesc | js.Array[XmlAtom] | XmlAtom
  type XmlObject = (org.scalablytyped.runtime.StringDictionary[ElementObject | XmlDesc]) | XmlDesc
}

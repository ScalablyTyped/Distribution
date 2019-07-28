package typings.xml

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlMod {
  type XmlAtom = String | Double | Boolean
  type XmlAttrs = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.xml.Anon_Attr
    - typings.xml.Anon_Cdata
    - typings.xml.Anon_AttrCdata
    - typings.xml.xmlMod.XmlAtom
    - js.Array[typings.xml.xmlMod.XmlAtom]
    - typings.xml.xmlMod.XmlDescArray
  */
  type XmlDesc = _XmlDesc | js.Array[XmlAtom] | XmlAtom
  type XmlObject = (StringDictionary[ElementObject | XmlDesc]) | XmlDesc
}

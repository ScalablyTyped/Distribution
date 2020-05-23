package typings.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type XmlAtom = java.lang.String | scala.Double | scala.Boolean | scala.Null
  type XmlAttrs = org.scalablytyped.runtime.StringDictionary[typings.xml.mod.XmlAtom]
  /* Rewritten from type alias, can be one of: 
    - typings.xml.anon.Attr
    - typings.xml.anon.Cdata
    - typings.xml.anon.AttrCdata
    - typings.xml.mod.XmlAtom
    - js.Array[typings.xml.mod.XmlAtom]
    - typings.xml.mod.XmlDescArray
  */
  type XmlDesc = typings.xml.mod._XmlDesc | js.Array[typings.xml.mod.XmlAtom] | typings.xml.mod.XmlAtom
  type XmlObject = (org.scalablytyped.runtime.StringDictionary[typings.xml.mod.ElementObject | typings.xml.mod.XmlDesc]) | typings.xml.mod.XmlDesc
}

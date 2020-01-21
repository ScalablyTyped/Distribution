package typings.xmlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Base type for associated arrays
    *
    * @interface AssocArray
    * @template T
    */
  type AssocArray[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ISelectResult = js.Array[typings.std.Node] | typings.std.Node | scala.Boolean | scala.Double | java.lang.String
  type IXmlSerializableConstructor = org.scalablytyped.runtime.Instantiable0[typings.xmlCore.mod.IXmlSerializable]
  type SelectNodes = js.Function2[
    /* node */ typings.std.Node, 
    /* xPath */ java.lang.String, 
    js.Array[typings.std.Node]
  ]
  type XmlAttributeType[T] = typings.xmlCore.mod.XmlSchemaItem[T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.xmlCore.xmlCoreStrings.utf8
    - typings.xmlCore.xmlCoreStrings.binary
    - typings.xmlCore.xmlCoreStrings.hex
    - typings.xmlCore.xmlCoreStrings.base64
    - typings.xmlCore.xmlCoreStrings.base64url
  */
  type XmlBufferEncoding = typings.xmlCore.mod._XmlBufferEncoding | java.lang.String
}

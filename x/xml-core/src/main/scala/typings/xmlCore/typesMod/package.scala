package typings.xmlCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AssocArray[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type ISelectResult = js.Array[typings.std.Node] | typings.std.Node | scala.Boolean | scala.Double | java.lang.String
  
  type IXmlSerializableConstructor = org.scalablytyped.runtime.Instantiable0[typings.xmlCore.typesMod.IXmlSerializable]
  
  type XmlAttributeType[T] = typings.xmlCore.typesMod.XmlSchemaItem[T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.xmlCore.xmlCoreStrings.utf8
    - typings.xmlCore.xmlCoreStrings.binary
    - typings.xmlCore.xmlCoreStrings.hex
    - typings.xmlCore.xmlCoreStrings.base64
    - typings.xmlCore.xmlCoreStrings.base64url
  */
  type XmlBufferEncoding = typings.xmlCore.typesMod._XmlBufferEncoding | java.lang.String
}

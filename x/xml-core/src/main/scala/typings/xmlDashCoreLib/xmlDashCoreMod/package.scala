package typings
package xmlDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlDashCoreMod {
  /**
    * Base type for associated arrays
    * 
    * @interface AssocArray
    * @template T
    */
  type AssocArray[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ISelectResult = js.Array[stdLib.Node] | stdLib.Node | scala.Boolean | scala.Double | java.lang.String
  // utils
  type SelectNodes = js.Function2[/* node */ stdLib.Node, /* xpath */ java.lang.String, js.Array[stdLib.Node]]
  type XmlAttributeType[T] = XmlSchemaItem[T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - xmlDashCoreLib.xmlDashCoreLibStrings.utf8
    - xmlDashCoreLib.xmlDashCoreLibStrings.binary
    - xmlDashCoreLib.xmlDashCoreLibStrings.hex
    - xmlDashCoreLib.xmlDashCoreLibStrings.base64
    - xmlDashCoreLib.xmlDashCoreLibStrings.base64url
  */
  type XmlBufferEncoding = _XmlBufferEncoding | java.lang.String
}

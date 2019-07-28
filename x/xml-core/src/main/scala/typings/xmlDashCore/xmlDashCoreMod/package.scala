package typings.xmlDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
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
  type AssocArray[T] = StringDictionary[T]
  type ISelectResult = js.Array[Node] | Node | Boolean | Double | String
  // utils
  type SelectNodes = js.Function2[/* node */ Node, /* xpath */ String, js.Array[Node]]
  type XmlAttributeType[T] = XmlSchemaItem[T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.xmlDashCore.xmlDashCoreStrings.utf8
    - typings.xmlDashCore.xmlDashCoreStrings.binary
    - typings.xmlDashCore.xmlDashCoreStrings.hex
    - typings.xmlDashCore.xmlDashCoreStrings.base64
    - typings.xmlDashCore.xmlDashCoreStrings.base64url
  */
  type XmlBufferEncoding = _XmlBufferEncoding | String
}

package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "Transform")
@js.native
class Transform ()
  extends XmlSignatureObject
     with ITransform {
  /**
    * XPath of the transformation
    */
  var XPath: java.lang.String = js.native
  var innerXml: stdLib.Node | scala.Null = js.native
}


package typings.xmldsigjs.xmldsigjsMod

import typings.std.Node
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "Transform")
@js.native
class Transform ()
  extends XmlObject
     with ITransform {
  /**
    * XPath of the transformation
    */
  var XPath: String = js.native
  var innerXml: Node | Null = js.native
}


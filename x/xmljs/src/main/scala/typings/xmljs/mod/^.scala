package typings.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
@JSImport("xmljs", JSImport.Namespace)
@js.native
class ^ protected () extends XmlParser {
  def this(oPar: ParserParameters) = this()
}

@JSImport("xmljs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns whenever a node is a XmlNode or not
    * @param n
    */
  def isXmlNode(n: Node): /* is xmljs.xmljs.XmlNode */ Boolean = js.native
}


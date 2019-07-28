package typings.xmljs.xmljsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
@JSImport("xmljs", JSImport.Namespace)
@js.native
class ^ protected () extends XmlParser {
  def this(oPar: ParserParameters) = this()
  /* CompleteClass */
  override var errors: js.Array[Error] = js.native
  /**
    * Parses a xml string
    * @param xml  XML string to parse
    * @param cb Callback function with error and the result (an Node)
    * @returns whenever or not there where any errors
    */
  /* CompleteClass */
  override def parseString(xml: String, cb: js.Function2[/* err */ Null | js.Array[Error], /* xmlNode */ Node, Unit]): Boolean = js.native
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


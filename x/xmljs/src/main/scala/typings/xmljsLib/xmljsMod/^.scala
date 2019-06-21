package typings
package xmljsLib.xmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
@JSImport("xmljs", JSImport.Namespace)
@js.native
class ^ protected () extends XmlParser {
  def this(oPar: ParserParameters) = this()
  /* CompleteClass */
  override var errors: js.Array[stdLib.Error] = js.native
  /**
    * Parses a xml string
    * @param xml  XML string to parse
    * @param cb Callback function with error and the result (an Node)
    * @returns whenever or not there where any errors
    */
  /* CompleteClass */
  override def parseString(
    xml: java.lang.String,
    cb: js.Function2[/* err */ scala.Null | js.Array[stdLib.Error], /* xmlNode */ Node, scala.Unit]
  ): scala.Boolean = js.native
}

@JSImport("xmljs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns whenever a node is a XmlNode or not
    * @param n
    */
  def isXmlNode(n: Node): /* is xmljs.xmljs.XmlNode */ scala.Boolean = js.native
}


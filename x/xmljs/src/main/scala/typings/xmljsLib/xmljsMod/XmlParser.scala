package typings
package xmljsLib.xmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
trait XmlParser extends js.Object {
  var errors: js.Array[stdLib.Error]
  /**
    * Parses a xml string
    * @param xml  XML string to parse
    * @param cb Callback function with error and the result (an Node)
    * @returns whenever or not there where any errors
    */
  def parseString(
    xml: java.lang.String,
    cb: js.Function2[/* err */ scala.Null | js.Array[stdLib.Error], /* xmlNode */ Node, scala.Unit]
  ): scala.Boolean
}

object XmlParser {
  @scala.inline
  def apply(
    errors: js.Array[stdLib.Error],
    parseString: (java.lang.String, js.Function2[/* err */ scala.Null | js.Array[stdLib.Error], /* xmlNode */ Node, scala.Unit]) => scala.Boolean
  ): XmlParser = {
    val __obj = js.Dynamic.literal(errors = errors, parseString = js.Any.fromFunction2(parseString))
  
    __obj.asInstanceOf[XmlParser]
  }
}


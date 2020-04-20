package typings.xmljs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
trait XmlParser extends js.Object {
  var errors: js.Array[Error]
  /**
    * Parses a xml string
    * @param xml  XML string to parse
    * @param cb Callback function with error and the result (an Node)
    * @returns whenever or not there where any errors
    */
  def parseString(xml: String, cb: js.Function2[/* err */ Null | js.Array[Error], /* xmlNode */ Node, Unit]): Boolean
}

object XmlParser {
  @scala.inline
  def apply(
    errors: js.Array[Error],
    parseString: (String, js.Function2[/* err */ Null | js.Array[Error], /* xmlNode */ Node, Unit]) => Boolean
  ): XmlParser = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], parseString = js.Any.fromFunction2(parseString))
    __obj.asInstanceOf[XmlParser]
  }
}


package typings.xmljs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ Write your module's methods and properties in this class */
@js.native
trait XmlParser extends js.Object {
  
  var errors: js.Array[Error] = js.native
  
  /**
    * Parses a xml string
    * @param xml  XML string to parse
    * @param cb Callback function with error and the result (an Node)
    * @returns whenever or not there where any errors
    */
  def parseString(xml: String, cb: js.Function2[/* err */ Null | js.Array[Error], /* xmlNode */ Node, Unit]): Boolean = js.native
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
  
  @scala.inline
  implicit class XmlParserOps[Self <: XmlParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseString(
      value: (String, js.Function2[/* err */ Null | js.Array[Error], /* xmlNode */ Node, Unit]) => Boolean
    ): Self = this.set("parseString", js.Any.fromFunction2(value))
  }
}

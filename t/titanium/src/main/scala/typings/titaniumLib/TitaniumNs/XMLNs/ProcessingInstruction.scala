package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A way to keep processor-specific information in the text of the document. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1004215813) on Android and iOS.
		 */
trait ProcessingInstruction
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Retrieve the content of this processing instruction. This from the first non white space character after the target to the character immediatly preceding the ?>. When setting a processing instruction, a DOMException may be thrown on an invalid instruction.
  			 */
  var data: java.lang.String
  /**
  			 * Retrieve the target of this processing instruction. XML defines this as being the first token following the markup that begins the processing instruction.
  			 */
  val target: java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.ProcessingInstruction.data> property.
  			 */
  def getData(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.ProcessingInstruction.target> property.
  			 */
  def getTarget(): java.lang.String
  /**
  			 * Sets the value of the <Titanium.XML.ProcessingInstruction.data> property.
  			 */
  def setData(data: java.lang.String): scala.Unit
}


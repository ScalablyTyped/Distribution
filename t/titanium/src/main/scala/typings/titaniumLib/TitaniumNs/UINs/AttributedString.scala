package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An attributed string proxy manages character strings and associated sets of attributes (for example,
		 * font and foregroundcolor) that apply to individual characters or ranges of characters in the string.
		 */

trait AttributedString
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * An array of attributes to add.
  			 */
  var attributes: js.Array[titaniumLib.Attribute]
  /**
  			 * The text applied to the attributed string.
  			 */
  var text: java.lang.String
  /**
  			 * Adds an [attribute](Attribute) with the given name and value to the characters in the specified range.
  			 */
  def addAttribute(attribute: titaniumLib.Attribute): scala.Unit
  /**
  			 * Gets the value of the <Titanium.UI.AttributedString.attributes> property.
  			 */
  def getAttributes(): js.Array[titaniumLib.Attribute]
  /**
  			 * Gets the value of the <Titanium.UI.AttributedString.text> property.
  			 */
  def getText(): java.lang.String
  /**
  			 * Sets the value of the <Titanium.UI.AttributedString.attributes> property.
  			 */
  def setAttributes(attributes: js.Array[titaniumLib.Attribute]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.AttributedString.text> property.
  			 */
  def setText(text: java.lang.String): scala.Unit
}


package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An attributed string proxy manages character strings and associated sets of attributes (for example,
			 * font and kerning) that apply to individual characters or ranges of characters in the string.
			 */
trait AttributedString
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * An array of attributes to add.
  				 */
  var attributes: js.Array[Attribute]
  /**
  				 * The text applied to the attributed string.
  				 */
  var text: java.lang.String
  /**
  				 * Adds an [attribute](Attribute) with the given name and value to the characters in the specified range.
  				 */
  def addAttribute(attribute: Attribute): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AttributedString.attributes> property.
  				 */
  def getAttributes(): js.Array[Attribute]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AttributedString.text> property.
  				 */
  def getText(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AttributedString.attributes> property.
  				 */
  def setAttributes(attributes: js.Array[Attribute]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AttributedString.text> property.
  				 */
  def setText(text: java.lang.String): scala.Unit
}


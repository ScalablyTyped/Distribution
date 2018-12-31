package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An abstract datatype for specifying an attributed string attribute.
			 */
trait Attribute
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Attribute range.
  				 */
  var range: js.Array[scala.Double]
  /**
  				 * Attribute to apply to the text.
  				 */
  var `type`: scala.Double
  /**
  				 * Attribute value.
  				 */
  var value: scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def getRange(): js.Array[scala.Double]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def getType(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def getValue(): scala.Double
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.range> property.
  				 */
  def setRange(range: js.Array[scala.Double]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.type> property.
  				 */
  def setType(`type`: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Attribute.value> property.
  				 */
  def setValue(value: scala.Double): scala.Unit
}


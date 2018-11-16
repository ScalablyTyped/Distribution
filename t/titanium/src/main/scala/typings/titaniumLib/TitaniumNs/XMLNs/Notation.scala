package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Represents a notation declared in the DTD.  Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-5431D1B9) on Android and iOS.
		 */

trait Notation
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The public identifier of this notation. If the public identifier was not specified, this is `null`.
  			 */
  val publicId: java.lang.String
  /**
  			 * The system identifier of this notation. If the system identifier was not specified, this is `null`.
  			 */
  val systemId: java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.Notation.publicId> property.
  			 */
  def getPublicId(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.Notation.systemId> property.
  			 */
  def getSystemId(): java.lang.String
}


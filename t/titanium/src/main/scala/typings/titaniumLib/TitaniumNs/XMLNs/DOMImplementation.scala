package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The <Titanium.XML.DOMImplementation> interface provides a number of methods for performing operations that are independent of any particular instance of the document object model.Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-102161490) on Android and iOS.
		 */

trait DOMImplementation
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Creates an <Titanium.XML.Document> object of the specified type with its document element. Raises an exception if qualifiedName is malformed, contains an illegal character, or is inconsistent with namespaceURI. Also raises an exception if doctype has already been used with a different document.
  			 */
  def createDocument(namespaceURI: java.lang.String, qualifiedName: java.lang.String, doctype: DocumentType): Document
  /**
  			 * Creates an empty <Titanium.XML.DocumentType> node. Entity declarations and notations are not made available. Entity reference expansions and default attribute additions do not occur. Raises an exception if qualifiedName is malformed or contains an illegal character.
  			 */
  def createDocumentType(qualifiedName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): DocumentType
  /**
  			 * Test if the <Titanium.XML.DOMImplementation> implements a specific feature.
  			 */
  def hasFeature(feature: java.lang.String, version: java.lang.String): scala.Boolean
}


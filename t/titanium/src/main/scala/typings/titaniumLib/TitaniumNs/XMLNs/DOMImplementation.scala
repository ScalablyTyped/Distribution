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

object DOMImplementation {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    createDocument: js.Function3[java.lang.String, java.lang.String, DocumentType, Document],
    createDocumentType: js.Function3[java.lang.String, java.lang.String, java.lang.String, DocumentType],
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    hasFeature: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): DOMImplementation = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, createDocument = createDocument, createDocumentType = createDocumentType, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, hasFeature = hasFeature, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[DOMImplementation]
  }
}


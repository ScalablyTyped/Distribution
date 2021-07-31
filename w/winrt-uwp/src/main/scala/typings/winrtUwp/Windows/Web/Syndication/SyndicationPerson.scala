package typings.winrtUwp.Windows.Web.Syndication

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an author or contributor of syndication content. */
trait SyndicationPerson extends StObject {
  
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute]
  
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri
  
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode]
  
  /** Gets or sets the email address of the person. */
  var email: String
  
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument
  
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String
  
  /** Gets the name of the syndication person. */
  var name: String
  
  /** Gets or sets the local name of the element. */
  var nodeName: String
  
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String
  
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String
  
  /** Gets or sets the Uniform Resource Identifier (URI) of the person. This property represents the atom:uri element. It is the absolute URI resolved against the xml:base attribute, if it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property is NULL because the relative URI is not supported by the runtime URI class. */
  var uri: Uri
}
object SyndicationPerson {
  
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    email: String,
    getXmlDocument: SyndicationFormat => XmlDocument,
    language: String,
    name: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    uri: Uri
  ): SyndicationPerson = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationPerson]
  }
  
  @scala.inline
  implicit class SyndicationPersonMutableBuilder[Self <: SyndicationPerson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = StObject.set(x, "attributeExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUri(value: Uri): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementExtensions(value: IVector[ISyndicationNode]): Self = StObject.set(x, "elementExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = StObject.set(x, "getXmlDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNamespace(value: String): Self = StObject.set(x, "nodeNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}

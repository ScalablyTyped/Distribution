package typings.winrtUwp.Windows.Web.Syndication

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the category of a feed or an item. This class encapsulates information in the /rss/channel/item/category element in RSS 2.0 or the atom:category element in Atom 1.0. */
@js.native
trait SyndicationCategory extends js.Object {
  /** Gets the list of custom attributes of the element. */
  var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
  var baseUri: Uri = js.native
  /** Gets the list of child elements within the element. */
  var elementExtensions: IVector[ISyndicationNode] = js.native
  /** Gets or sets the label for the category. This property represents the label attribute on atom:category. It provides a label for display in end-user applications. */
  var label: String = js.native
  /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
  var language: String = js.native
  /** Gets or sets the local name of the element. */
  var nodeName: String = js.native
  /** Gets or sets the namespace of the element. */
  var nodeNamespace: String = js.native
  /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
  var nodeValue: String = js.native
  /** Gets or sets the scheme of the category. This property represents the scheme attribute on atom:category or the domain attribute on the category element in RSS 2.0. */
  var scheme: String = js.native
  /** Gets or sets a string that identifies the category. This property represents the required term attribute on atom:category or the text content of the category element in RSS 2.0. */
  var term: String = js.native
  /**
    * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
    * @param format The format of the data.
    * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
    */
  def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

object SyndicationCategory {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    label: String,
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    scheme: String,
    term: String
  ): SyndicationCategory = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationCategory]
  }
  @scala.inline
  implicit class SyndicationCategoryOps[Self <: SyndicationCategory] (val x: Self) extends AnyVal {
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
    def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = this.set("attributeExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseUri(value: Uri): Self = this.set("baseUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementExtensions(value: IVector[ISyndicationNode]): Self = this.set("elementExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = this.set("getXmlDocument", js.Any.fromFunction1(value))
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeNamespace(value: String): Self = this.set("nodeNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
  }
  
}


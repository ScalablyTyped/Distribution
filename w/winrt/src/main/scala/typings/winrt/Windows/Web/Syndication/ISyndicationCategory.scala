package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationCategory extends ISyndicationNode {
  var label: String = js.native
  var scheme: String = js.native
  var term: String = js.native
}

object ISyndicationCategory {
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
  ): ISyndicationCategory = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationCategory]
  }
  @scala.inline
  implicit class ISyndicationCategoryOps[Self <: ISyndicationCategory] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
  }
  
}


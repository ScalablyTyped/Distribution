package typings
package winrtLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceCollection
  extends winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationNode {
  var accepts: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationCategory]
  var title: winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationText
  var uri: winrtLib.WindowsNs.FoundationNs.Uri
}

object IResourceCollection {
  @scala.inline
  def apply(
    accepts: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationCategory],
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationNode],
    getXmlDocument: js.Function1[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat, 
      winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
    ],
    language: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    title: winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationText,
    uri: winrtLib.WindowsNs.FoundationNs.Uri
  ): IResourceCollection = {
    val __obj = js.Dynamic.literal(accepts = accepts, attributeExtensions = attributeExtensions, baseUri = baseUri, categories = categories, elementExtensions = elementExtensions, getXmlDocument = getXmlDocument, language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, title = title, uri = uri)
  
    __obj.asInstanceOf[IResourceCollection]
  }
}


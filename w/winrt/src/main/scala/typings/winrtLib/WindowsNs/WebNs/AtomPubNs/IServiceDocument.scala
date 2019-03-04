package typings
package winrtLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServiceDocument
  extends winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationNode {
  var workspaces: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Workspace]
}

object IServiceDocument {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationNode],
    getXmlDocument: js.Function1[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat, 
      winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
    ],
    language: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    workspaces: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Workspace]
  ): IServiceDocument = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions, baseUri = baseUri, elementExtensions = elementExtensions, getXmlDocument = getXmlDocument, language = language, nodeName = nodeName, nodeNamespace = nodeNamespace, nodeValue = nodeValue, workspaces = workspaces)
  
    __obj.asInstanceOf[IServiceDocument]
  }
}


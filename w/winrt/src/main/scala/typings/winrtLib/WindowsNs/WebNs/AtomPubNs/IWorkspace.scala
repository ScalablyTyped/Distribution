package typings
package winrtLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkspace
  extends winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationNode {
  var collections: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceCollection]
  var title: winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationText
}

object IWorkspace {
  @scala.inline
  def apply(
    attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute],
    baseUri: winrtLib.WindowsNs.FoundationNs.Uri,
    collections: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceCollection],
    elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationNode],
    getXmlDocument: js.Function1[
      winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat, 
      winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
    ],
    language: java.lang.String,
    nodeName: java.lang.String,
    nodeNamespace: java.lang.String,
    nodeValue: java.lang.String,
    title: winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationText
  ): IWorkspace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeExtensions")(attributeExtensions)
    __obj.updateDynamic("baseUri")(baseUri)
    __obj.updateDynamic("collections")(collections)
    __obj.updateDynamic("elementExtensions")(elementExtensions)
    __obj.updateDynamic("getXmlDocument")(getXmlDocument)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodeNamespace")(nodeNamespace)
    __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IWorkspace]
  }
}


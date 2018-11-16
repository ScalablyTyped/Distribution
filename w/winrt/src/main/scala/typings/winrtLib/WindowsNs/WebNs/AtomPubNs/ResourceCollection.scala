package typings
package winrtLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub.ResourceCollection")
@js.native
class ResourceCollection () extends IResourceCollection {
  /* CompleteClass */
  override var accepts: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /* CompleteClass */
  override var attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var categories: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationCategory] = js.native
  /* CompleteClass */
  override var elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationNode] = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override var nodeName: java.lang.String = js.native
  /* CompleteClass */
  override var nodeNamespace: java.lang.String = js.native
  /* CompleteClass */
  override var nodeValue: java.lang.String = js.native
  /* CompleteClass */
  override var title: winrtLib.WindowsNs.WebNs.SyndicationNs.ISyndicationText = js.native
  /* CompleteClass */
  override var uri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override def getXmlDocument(format: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}


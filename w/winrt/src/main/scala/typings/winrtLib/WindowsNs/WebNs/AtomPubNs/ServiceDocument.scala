package typings
package winrtLib.WindowsNs.WebNs.AtomPubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub.ServiceDocument")
@js.native
class ServiceDocument () extends IServiceDocument {
  /* CompleteClass */
  override var attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
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
  override var workspaces: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Workspace] = js.native
  /* CompleteClass */
  override def getXmlDocument(format: winrtLib.WindowsNs.WebNs.SyndicationNs.SyndicationFormat): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}


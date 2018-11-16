package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationLink")
@js.native
class SyndicationLink () extends ISyndicationLink {
  def this(uri: winrtLib.WindowsNs.FoundationNs.Uri) = this()
  def this(uri: winrtLib.WindowsNs.FoundationNs.Uri, relationship: java.lang.String, title: java.lang.String, mediaType: java.lang.String, length: scala.Double) = this()
  /* CompleteClass */
  override var attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override var length: scala.Double = js.native
  /* CompleteClass */
  override var mediaType: java.lang.String = js.native
  /* CompleteClass */
  override var nodeName: java.lang.String = js.native
  /* CompleteClass */
  override var nodeNamespace: java.lang.String = js.native
  /* CompleteClass */
  override var nodeValue: java.lang.String = js.native
  /* CompleteClass */
  override var relationship: java.lang.String = js.native
  /* CompleteClass */
  override var resourceLanguage: java.lang.String = js.native
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /* CompleteClass */
  override var uri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}


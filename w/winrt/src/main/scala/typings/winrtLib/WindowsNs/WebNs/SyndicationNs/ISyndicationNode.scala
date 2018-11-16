package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISyndicationNode extends js.Object {
  var attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute]
  var baseUri: winrtLib.WindowsNs.FoundationNs.Uri
  var elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode]
  var language: java.lang.String
  var nodeName: java.lang.String
  var nodeNamespace: java.lang.String
  var nodeValue: java.lang.String
  def getXmlDocument(format: SyndicationFormat): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
}


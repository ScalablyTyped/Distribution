package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceMap extends IMapView[String, NamedResource] {
  var uri: Uri = js.native
  def getSubtree(reference: String): ResourceMap = js.native
  def getValue(resource: String): ResourceCandidate = js.native
  def getValue(resource: String, context: ResourceContext): ResourceCandidate = js.native
}


package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceMap
  extends winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, NamedResource] {
  var uri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  def getSubtree(reference: java.lang.String): ResourceMap = js.native
  def getValue(resource: java.lang.String): ResourceCandidate = js.native
  def getValue(resource: java.lang.String, context: ResourceContext): ResourceCandidate = js.native
}


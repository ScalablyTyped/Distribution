package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedResource extends js.Object {
  var candidates: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceCandidate] = js.native
  var uri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  def resolve(): ResourceCandidate = js.native
  def resolve(resourceContext: ResourceContext): ResourceCandidate = js.native
  def resolveAll(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceCandidate] = js.native
  def resolveAll(resourceContext: ResourceContext): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ResourceCandidate] = js.native
}

